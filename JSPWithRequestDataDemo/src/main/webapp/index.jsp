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
	String userName = request.getParameter("username");
	String password = request.getParameter("password");

	if (userName.equals("admin")) {
		out.println("Welcome Admin Page");
	} else {
		out.println("Wrong username");
	}
	%>
	
	<%=request.getParameter("username")  %>
	<%=request.getParameter("password")  %>
</body>
</html>