<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="my" uri="MyTag.tld" %>
<html>
<head>
    <title>Laba 13</title>
</head>
<body>

<form action="core.jsp">
    <input type="submit" value="core">
</form>

<form action="formated.jsp">
    <input type="submit" value="formated">
</form>

<form action="xml.jsp">
    <input type="submit" value="xml">
</form>

<form action="functions.jsp">
    <input type="submit" value="functions">
</form>

<form action="Result.jsp" method="post">
    <my:EKALabledTextField label="Name: " name="Firstname"/><br/>
    <my:EKALabledTextField label="Surname: " name="Surname"/><br/>
    <my:EKALabledTextField label="Fathername: " name="FatherName"/><br/>
    <my:EKALabledTextField label="City: " name="City"/><br/>
    <my:EKALabledTextField label="Street: " name="Street"/><br/><br/>
   <%-- <my:KirilTag label="Kiril: " name="Kiril"/><br/><br/>--%>
    <my:EKAsubmit/>
</form>
</body>
</html>
