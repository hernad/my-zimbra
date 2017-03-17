/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Web Client
 * Copyright (C) 2006, 2007, 2009, 2010, 2012, 2013, 2014, 2016 Synacor, Inc.
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
 * All portions of the code are Copyright (C) 2006, 2007, 2009, 2010, 2012, 2013, 2014, 2016 Synacor, Inc. All Rights Reserved.
 * ***** END LICENSE BLOCK *****
 */
/*
 * Package: Tasks
 * 
 * Supports: The Tasks application
 * 
 * Loaded: When the user goes to the Tasks application
 */

// base class for ZmApptView
AjxPackage.require("zimbraMail.mail.view.ZmMailMsgView");

AjxPackage.require("zimbraMail.calendar.controller.ZmCalItemComposeController");

AjxPackage.require("zimbraMail.calendar.model.ZmRecurrence");
AjxPackage.require("zimbraMail.calendar.model.ZmCalItem");

AjxPackage.require("zimbraMail.calendar.view.ZmApptRecurDialog");
AjxPackage.require("zimbraMail.calendar.view.ZmApptViewHelper");
AjxPackage.require("zimbraMail.calendar.view.ZmCalItemEditView");
AjxPackage.require("zimbraMail.calendar.view.ZmCalItemView");

AjxPackage.require("zimbraMail.calendar.controller.ZmCalendarTreeController");


AjxPackage.require("zimbraMail.tasks.view.ZmTaskView");
AjxPackage.require("zimbraMail.tasks.view.ZmTaskMultiView");
AjxPackage.require("zimbraMail.tasks.view.ZmTaskEditView");
AjxPackage.require("zimbraMail.tasks.view.ZmNewTaskFolderDialog");

AjxPackage.require("zimbraMail.tasks.controller.ZmTaskController");
AjxPackage.require("zimbraMail.tasks.controller.ZmTaskTreeController");