<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error
{
color:red;
}</style>
</head>
<body>
<form:form action="reg" method="post" commandName="user">
Name:-<form:input type="text" path="uname"/><br>
<form:errors path="uname" cssClass="error"></form:errors><br>
ID:-<form:input type="text" path="id"/><br>
<form:errors path="id" cssClass="error"></form:errors><br>
<input type="submit" value="submit">
</form:form>
</body>
</html>