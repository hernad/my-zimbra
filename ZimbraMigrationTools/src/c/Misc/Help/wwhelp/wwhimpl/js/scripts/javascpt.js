/*
 * ***** BEGIN LICENSE BLOCK *****
 *
 * Zimbra Collaboration Suite CSharp Client
 * Copyright (C) 2012, 2013, 2014, 2016 Synacor, Inc.
 *
 * The contents of this file are subject to the Common Public Attribution License Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at: https://www.zimbra.com/license
 * The License is based on the Mozilla Public License Version 1.1 but Sections 14 and 15
 * have been added to cover use of software over a computer network and provide for limited attribution
 * for the Original Developer. In addition, Exhibit A has been modified to be consistent with Exhibit B.
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied.
 * See the License for the specific language governing rights and limitations under the License.
 * The Original Code is Zimbra Open Source Web Client.
 * The Initial Developer of the Original Code is Zimbra, Inc.  All rights to the Original Code were
 * transferred by Zimbra, Inc. to Synacor, Inc. on September 14, 2015.
 *
 * All portions of the code are Copyright (C) 2012, 2013, 2014, 2016 Synacor, Inc. All Rights Reserved.
 *
 * ***** END LICENSE BLOCK *****
 */
// Copyright (c) 2000-2012 Quadralay Corporation.  All rights reserved.
//

function  WWHJavaScript_Object()
{
  this.mSettings           = new WWHJavaScriptSettings_Object();
  this.mMessages           = new WWHJavaScriptMessages_Object();
  this.mInitialTab         = -1;
  this.mbClickedChangeTab  = false;
  this.mbChangingTabs      = false;
  this.mCurrentTab         = -1;
  this.mPanels             = null;
  this.mTabs               = null;
  this.mMaxHTMLSegmentSize = 8192;  // Best tested value is 8192

  this.fInit                      = WWHJavaScript_Init;
  this.fClickedChangeTab          = WWHJavaScript_ClickedChangeTab;
  this.fClickedChangeTabWithDelay = WWHJavaScript_ClickedChangeTabWithDelay;
  this.fStartChangeTab            = WWHJavaScript_StartChangeTab;
  this.fEndChangeTab              = WWHJavaScript_EndChangeTab;
  this.fSyncTOC                   = WWHJavaScript_SyncTOC;
  this.fFavoritesCurrent          = WWHJavaScript_FavoritesCurrent;

  // Load up messages
  //
  this.mMessages.fSetByLocale(WWHFrame.WWHBrowser.mLocale);

  // Disable hover text for accessibility or if popups are not supported
  //
  if (( ! WWHFrame.WWHBrowser.mbSupportsPopups) ||
      (WWHFrame.WWHHelp.mbAccessible))
  {
    this.mSettings.mHoverText.mbEnabled = false;
  }
}

function  WWHJavaScript_Init()
{
  // Create panels and tabs objects
  //
  this.mPanels = new WWHPanels_Object();
  this.mTabs   = new WWHTabs_Object(this.mPanels.mPanelEntries.length);

  // Determine initial tab setting
  //
  switch (WWHFrame.WWHHelp.mInitialTabName)
  {
    case "contents":
      this.mInitialTab = WWHFrame.WWHOutline.mPanelTabIndex;
      break;

    case "index":
      this.mInitialTab = WWHFrame.WWHIndex.mPanelTabIndex;
      break;

    case "search":
      this.mInitialTab = WWHFrame.WWHSearch.mPanelTabIndex;
      break;

    case "favorites":
      this.mInitialTab = WWHFrame.WWHFavorites.mPanelTabIndex;
      break;
  }
  if (this.mInitialTab < 0)
  {
    this.mInitialTab = 0;
  }

  // Complete initialization process
  //
  if ( ! WWHFrame.WWHHandler.mbInitialized)
  {
    WWHFrame.WWHHandler.mbInitialized = true;
    WWHFrame.WWHHelp.fHandlerInitialized();
  }
}

function  WWHJavaScript_ClickedChangeTab(ParamIndex)
{
  if ( ! this.mbClickedChangeTab)
  {
    // Change tabs
    //
    this.mbClickedChangeTab = true;
    this.fStartChangeTab(ParamIndex);
  }
}

function  WWHJavaScript_ClickedChangeTabWithDelay(ParamIndex)
{
  setTimeout("WWHFrame.WWHJavaScript.fClickedChangeTab(" + ParamIndex + ");", 1);
}

function  WWHJavaScript_StartChangeTab(ParamIndex)
{
  if (( ! this.mbChangingTabs) &&
      (this.mCurrentTab != ParamIndex))
  {
    // Signal that we are changing tabs
    //
    this.mbChangingTabs = true;

    // Update tab index
    //
    this.mCurrentTab = ParamIndex;

    // Update tab frame
    //
    this.mTabs.fReload();
  }
}

function  WWHJavaScript_EndChangeTab()
{
  if (this.mbClickedChangeTab)
  {
    this.mbClickedChangeTab = false;
  }

  // Signal that the change tab process is complete
  //
  this.mbChangingTabs = false;

  // Perform additional processing if initial tab specified
  //
  if (WWHFrame.WWHHelp.mInitialTabName == "contents")
  {
    WWHFrame.WWHHelp.mInitialTabName = null;
    WWHFrame.WWHHelp.mbAutoSyncTOC = true;
  }
  setTimeout("WWHFrame.WWHHelp.fAutoSyncTOC();", 1);
}

function  WWHJavaScript_SyncTOC(ParamBookIndex,
                                ParamFileIndex,
                                ParamAnchor,
                                bParamReportError)
{
  var  TabIndex;
  var  Index;


  // Confirm TOC is available as a tab
  //
  if (this.mSettings.mTOC.mbShow)
  {
    // Confirm file is part of a known book
    //
    if ((ParamBookIndex >= 0) &&
        (ParamFileIndex >= 0))
    {
      // Determine visibility
      //
      if (this.mPanels.fGetCurrentPanelObject().mPanelTabTitle == this.mMessages.mTabsTOCLabel)
      {
        // Sync TOC
        //
        WWHFrame.WWHOutline.fSync(ParamBookIndex, ParamFileIndex, ParamAnchor, true, bParamReportError);
      }
      else
      {
        // Determine tab to display for TOC
        //
        TabIndex = -1;
        Index = 0;
        while ((TabIndex == -1) &&
               (Index < WWHFrame.WWHJavaScript.mPanels.mPanelEntries.length))
        {
          if (WWHFrame.WWHJavaScript.mPanels.mPanelEntries[Index].mPanelObject.mPanelTabTitle == WWHFrame.WWHJavaScript.mMessages.mTabsTOCLabel)
          {
            TabIndex = Index;
          }

          Index++;
        }

        // Display contents tab and sync
        //
        if (TabIndex != -1)
        {
          // Force auto sync on tab display
          //
          WWHFrame.WWHHelp.mInitialTabName = "contents";
          WWHFrame.WWHJavaScript.fStartChangeTab(TabIndex);
        }
      }
    }
  }
}

function  WWHJavaScript_FavoritesCurrent(ParamBookIndex,
                                         ParamFileIndex)
{
  WWHFrame.WWHFavorites.fSetCurrent(ParamBookIndex, ParamFileIndex);

  // Update navigation
  //
  if (this.mPanels.fGetCurrentPanelObject().mPanelTabTitle == this.mMessages.mTabsFavoritesLabel)
  {
    // Refresh
    //
    WWHFrame.WWHJavaScript.mPanels.fReloadNavigation();
  }
}