<!-- 
***** BEGIN LICENSE BLOCK *****
Zimbra Collaboration Suite Web Client
Copyright (C) 2005, 2006, 2007, 2010, 2013, 2014, 2015, 2016 Synacor, Inc.

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

<%@ page language="java" import="java.lang.*, java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>Memory Leak tests</title>

		<jsp:include page="../../public/Messages.jsp"/>
        <jsp:include page="../../public/Boot.jsp"/>
		<jsp:include page="../../public/Ajax.jsp"/>
		<jsp:include page="../../public/jsp/Zimbra.jsp"/>
		<jsp:include page="../../public/jsp/ZimbraCore.jsp"/>

		<script type="text/javascript" src="MemLeakTests.js"></script>

		<script language="JavaScript">   	
			function launch() {
				DBG = new AjxDebug(AjxDebug.NONE);
				MemLeakTests.run(document.domain);
			};
			AjxCore.addOnloadListener(launch);
		</script>

	</head>

	<body>
	</body>

</html>