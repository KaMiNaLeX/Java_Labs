<%--
  Created by IntelliJ IDEA.
   User: Vokamrecom
  Date: 27.05.2018
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%@include file="Header.jsp"%><br>
<body>
<H4>${hello}</H4><br>
<form action="addInf.jsp">
    <input type="submit" value="Add Information">
</form>
</body>
<%@include file="Footer.jsp"%><br>
</html>
