/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Web Client
 * Copyright (C) 2005, 2006, 2007, 2009, 2010, 2013, 2014, 2016 Synacor, Inc.
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
 * All portions of the code are Copyright (C) 2005, 2006, 2007, 2009, 2010, 2013, 2014, 2016 Synacor, Inc. All Rights Reserved.
 * ***** END LICENSE BLOCK *****
 */


/**
 * static class that wraps around AjxEventManager
 * 
 * @private
 */
DwtEventManager = function() {
};

DwtEventManager._instance = new AjxEventMgr();

DwtEventManager._domEventToDwtMap = {
	'ondblclick': DwtEvent.ONDBLCLICK,
	'onmousedown': DwtEvent.ONMOUSEDOWN ,
	'onmouseup': DwtEvent.ONMOUSEUP,
	'onmousemove': DwtEvent.ONMOUSEMOVE,
	'onmouseout': DwtEvent.ONMOUSEOUT,
	'onmouseover': DwtEvent.ONMOUSEOVER,
	'onselectstart': DwtEvent.ONSELECTSTART,
	'onchange': DwtEvent.ONCHANGE
};

DwtEventManager.addListener = 
function(eventType, listener) {
	DwtEventManager._instance.addListener(eventType, listener);
};

DwtEventManager.notifyListeners = 
function(eventType, event) {
	DwtEventManager._instance.notifyListeners(eventType, event);
};

DwtEventManager.removeListener = 
function(eventType, listener) {
	DwtEventManager._instance.removeListener(eventType, listener);
};