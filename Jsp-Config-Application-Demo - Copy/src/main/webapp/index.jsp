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
	String dbUserName = config.getInitParameter("dbUser");
	out.println(dbUserName);

	String contextName = application.getInitParameter("contextName");
	out.println(contextName);
	%>
</body>
</html>