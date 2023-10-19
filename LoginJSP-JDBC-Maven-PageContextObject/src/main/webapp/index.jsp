<%@page import="com.pgr.dao.LoginDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" %>
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
		
		pageContext.setAttribute("userName1", userName, PageContext.APPLICATION_SCOPE);
		pageContext.setAttribute("password1", password, PageContext.APPLICATION_SCOPE);
		out.print("<a href='welcome.jsp'>second jsp page</a>");
	} else {
		out.println("Invalid user name....");
	}
	%>

</body>
</html>