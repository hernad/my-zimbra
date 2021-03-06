<!-- 
***** BEGIN LICENSE BLOCK *****
Zimbra Collaboration Suite Web Client
Copyright (C) 2006, 2007, 2010, 2013, 2014, 2015, 2016 Synacor, Inc.

This program is free software: you can redistribute it and/or modify it under
the terms of the GNU General Public License as published by the Free Software Foundation,
version 2 of the License.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
See the GNU General Public License for more details.
You should have received a copy of the GNU General Public License along with this program.
If not, see <https://www.gnu.org/licenses/>.
***** END LICENSE BLOCK *****
-->

<%@ page language="java" 
         import="java.lang.*, java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<%
		String contextPath = request.getContextPath();
		if(contextPath.equals("/")) {
			contextPath = "";
		}
	%>
    <title>Package Test</title>
    <jsp:include page="../../public/Messages.jsp"/>
    <jsp:include page="../../public/Boot.jsp"/>
    <jsp:include page="../../public/Ajax.jsp"/>
    <script>
    	appContextPath = "<%=contextPath %>";
    	scriptLoadStart = (new Date()).getTime();
    </script>
	<script src="LoadTest.js">
  </head>
    <body>
<p>This test jsp measures how long it takes to load a sample js file. The sample file
LoadTest.js is a copy of ZimbraMail_all.js, which is 3.1M and 94K lines. A reload
is needed between tests since the package system recognizes when a resource has
already been loaded.</p>
<p>Load time via simple script tag: <span id="sltSpan"></span></p>
    <script>   	
    	scriptLoadTime = (new Date()).getTime() - scriptLoadStart;
		AjxPackage.setBasePath("<%=contextPath %>");
		function loadTestA() {
			var s = (new Date()).getTime();
			AjxPackage.require("test.jstest.LoadTest");
			var e = (new Date()).getTime();
			var t = e - s;
			var el = document.getElementById("resultsDivA");
			el.innerHTML = "That took " + t + "ms";
		}
		function loadTestB() {
			loadStart = (new Date()).getTime();
			AjxInclude(["/zimbra/test/jstest/LoadTest.js"], null, new AjxCallback(null, loadTestB_done));
		}
		function loadTestB_done() {
			var e = (new Date()).getTime();
			var t = e - loadStart;
			var el = document.getElementById("resultsDivB");
			el.innerHTML = "That took " + t + "ms";
		}
		document.getElementById("sltSpan").innerHTML = scriptLoadTime;
    </script>
    <button onclick="loadTestA();">AjxPackage</button>
    <div id="resultsDivA"></div>
    <button onclick="loadTestB();">AjxInclude</button>
    <div id="resultsDivB"></div>
    </body>
</html>
