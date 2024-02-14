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

		out.println("Hi");
	%>
	<%-- <%@ include file="welcome.jsp"%> --%>
	<%-- 
	<jsp:include page="welcome.jsp">
		<jsp:param value="<%=userName%>" name="userName1" />
		<jsp:param value="<%=password%>" name="password1" />
	</jsp:include> --%>
	<jsp:forward page="welcome.jsp">
		<jsp:param value="<%=userName%>" name="userName1" />
		<jsp:param value="<%=password%>" name="password1" />
	</jsp:forward>
	<%
	} else {

	out.println("Invalid username,,,,,");
	}
	%>

</body>

</html>