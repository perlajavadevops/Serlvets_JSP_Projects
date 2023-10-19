<%@page import="com.pgr.dao.LoginDao, java.util.*;"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
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


	if(userName.isEmpty()){
		throw new NullPointerException("Hi The username is empty");
	}
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