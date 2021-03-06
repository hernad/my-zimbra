/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Web Client
 * Copyright (C) 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2016 Synacor, Inc.
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
 * All portions of the code are Copyright (C) 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2016 Synacor, Inc. All Rights Reserved.
 * ***** END LICENSE BLOCK *****
 */

/**
* @class ZaMigrationWizView
* @contructor ZaMigrationWizView
* @param parent
* @param app
* @author Greg Solovyev
**/
ZaMigrationWizView = function(parent) {
	if (arguments.length == 0) return;
        ZaTabView.call(this, {
                parent:parent,
                iKeyName:"ZaMigrationWizView",
                contextId:ZaId.TAB_DOWNLOADS
        });
	this.setScrollStyle(Dwt.SCROLL);
	this.initForm(new Object(), this.getMyXForm())
//	this._createHTML();
}

ZaMigrationWizView.prototype = new ZaTabView();
ZaMigrationWizView.prototype.constructor = ZaMigrationWizView;
ZaTabView.XFormModifiers["ZaMigrationWizView"] = new Array();

ZaMigrationWizView.prototype.getTabIcon =
function () {
	return "MigrationWiz" ;
}

ZaMigrationWizView.prototype.getTabTitle =
function () {
	return ZaMsg.Migration_wiz_title ;
}

ZaMigrationWizView.prototype.getTitle =
function () {
	return ZaMsg.Migration_wiz_title ;
}

/**
* @param xModelMetaData - XModel metadata that describes data model
* @param xFormMetaData - XForm metadata that describes the form
**/
ZaMigrationWizView.prototype.initForm =
function (xModelMetaData, xFormMetaData) {
	if(xModelMetaData == null || xFormMetaData == null)
		throw new AjxException("Metadata for XForm and/or XModel are not defined", AjxException.INVALID_PARAM, "ZaMigrationWizView.prototype.initForm");

	this._localXModel = new XModel(xModelMetaData);
	this._localXForm = new XForm(xFormMetaData, this._localXModel, null, this, ZaId.getTabViewId(this._contextId));
	this._localXForm.setController(this);
	this._localXForm.draw();
	// This is specifically for the dwt button. If the instance is null, which here it is,
	// dwt widgets don't get inserted into the xform, until you manually call refresh().
	this._localXForm.refresh();
	this._drawn = true;
}

ZaMigrationWizView.myXFormModifier = function(xFormObject) {
	xFormObject.tableCssStyle="width:100%;overflow:auto;";
	xFormObject.itemDefaults = {_SEPARATOR_: {containerCssStyle:"padding-right:3px;padding-left:3px;"}};
	xFormObject.items = [
			{type:_OUTPUT_, label:null, value:ZaMsg.DOWNLOAD_PAGE_0, colSpan:"*", cssStyle:"font-size:12pt;	font-weight: bold;"},
			{type: _GROUP_, numCols: 2, colSpan: "*", items: [
					{type:_OUTPUT_, label:null, value:ZaMsg.DOWNLOAD_PAGE_1, cssStyle:"font-size:12px;"},
					{type: _OUTPUT_, value: AjxImg.getImageHtml("Help")}
				]
			},
			{type:_SPACER_, colSpan:"*"},
			{type:_OUTPUT_, label:null, value:ZaMsg.DOWNLOAD_FOR_ADMIN, colSpan:"*", cssStyle:"font-size:10pt;font-weight: bold;"},
			{type:_SPACER_, colSpan:"*"},
			{type:_SPACER_, colSpan:"*"},
			{type:_OUTPUT_, label:null, value:ZaMsg.DOWNLOAD_FOR_USER,  colSpan:"*", cssStyle:"font-size:10pt;font-weight: bold;"},
			{type:_SPACER_, colSpan:"*"},
			{type:_GROUP_, numCols:1, colSpan:"*", zName:"DownloadsForUser",
				items: [
					//PST import
					{type: _GROUP_ , numCols:3,
						items: [
							{type:_OUTPUT_, value:AjxImg.getImageHtml("Migration")},
							{type:_OUTPUT_, cssStyle:"font-size:12px;", labelLocation:_NONE_, label:null,
							id:"pst_import_link",
                                value: ZaMigrationWizView.getDownloadLink(ZaMsg.IMPORT_WIZ_DOWNLOAD_LINK, ZaMsg.IMPORT_WIZ_DOWNLOAD_LINK_MSG)
                            },
							{type:_OUTPUT_, cssStyle:"font-size:12px;", labelLocation:_NONE_, label:null,
							id:"pst_import_help_link",
                                value:["(<A target='_blank' onclick='ZaZimbraAdmin.unloadHackCallback();' HREF='",location.pathname,"adminhelp/pdf/User Instructions for ZCS Import Wizard.pdf?locid=",AjxEnv.DEFAULT_LOCALE,"'>",ZaMsg.IMPORT_WIZ_DOWNLOAD_HELP,"</a>)"].join("")}
						]
					},
					{type:_OUTPUT_, cssClass:"ZaDownloadText", label: null, value:ZaMsg.IMPORT_WIZ_DOWNLOAD_TEXT}
				]
			}
		];
}
ZaTabView.XFormModifiers["ZaMigrationWizView"].push(ZaMigrationWizView.myXFormModifier);

ZaMigrationWizView.getDownloadLink =  function (link, msg) {
    return "<a onclick=\"ZaZimbraAdmin.unloadHackCallback();\" target=\"_blank\" href=\""
            + link  + "\">" + msg + "</a>";
}
