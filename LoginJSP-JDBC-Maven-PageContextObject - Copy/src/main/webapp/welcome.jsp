<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	String userName = (String) pageContext.getAttribute("userName1", PageContext.SESSION_SCOPE);
	String password = (String) pageContext.getAttribute("password1", PageContext.SESSION_SCOPE);
	out.println("<html><body style='color:red'>User Name is " + userName + " password is " + password + "</body></html>");
	%>
</body>
</html>