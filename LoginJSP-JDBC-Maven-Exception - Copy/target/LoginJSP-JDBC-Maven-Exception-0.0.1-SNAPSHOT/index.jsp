<%@page import="com.pgr.dao.LoginDao"%>
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
	String userName = request.getParameter("userName");
	String password = request.getParameter("password");

	out.println(userName);
	out.println(password);
	LoginDao loginDao = new LoginDao();
	
	boolean valid = loginDao.validateLoginDetails(userName, password);

	if (valid) {
		out.println("Welcome Admin...." + userName);
	} else {
		out.println("Invalid user name....");
	}
	%>

</body>
</html>