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

	LoginDao loginDao = new LoginDao();
	boolean valid = loginDao.validateLoginDetails(userName, password);

	if (valid) {
		
		session.setMaxInactiveInterval(60);
		session.setAttribute("userName1", userName);
		session.setAttribute("password1", password);
		request.getRequestDispatcher("welcome.jsp").forward(request, response);

	} else {
		out.println("Invalid user name....");
	}
	%>

</body>
</html>