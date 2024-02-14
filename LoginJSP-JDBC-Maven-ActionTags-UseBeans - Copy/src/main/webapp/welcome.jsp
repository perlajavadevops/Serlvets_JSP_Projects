<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="color: blue">

	<%
	/* 	String userName1 = request.getParameter("userName1");
		String password1 = request.getParameter("password1"); */
	out.println("User Name is");
	%>
	${param.userName1}
	<%
	out.println(" password is ");
	%>
	${param.password1}
	<%

	%>
</body>
</html>