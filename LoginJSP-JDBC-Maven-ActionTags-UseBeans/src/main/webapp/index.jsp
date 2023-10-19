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

	<jsp:useBean id="loginObj" class="com.pgr.dao.Login">
	</jsp:useBean>
	<jsp:setProperty property="userName" name="loginObj" />
	<jsp:setProperty property="password" name="loginObj" />

	${param.userName} ${param.password}
	<%
	/* String userName = request.getParameter("userName");
	String password = request.getParameter("password");
	*/

	LoginDao loginDao = new LoginDao();
	boolean valid = loginDao.validateLoginDetails(loginObj);

	if (valid) {

		/* session.setMaxInactiveInterval(60);
		session.setAttribute("userName1", userName);
		session.setAttribute("password1", password); */
		/* 	request.getRequestDispatcher("welcome.jsp").forward(request, response); */
		out.println("Hi");
	%>
	<%-- <%@ include file="welcome.jsp"%> --%>

	<jsp:include page="welcome.jsp"></jsp:include>
	<%-- 	<jsp:forward page="welcome.jsp">
		<jsp:param value="<%=userName%>" name="userName1" />
		<jsp:param value="<%=password%>" name="password1" />
	</jsp:forward> --%>
	<%
	} else {

	out.println("Invalid username,,,,,");
	}
	%>

</body>

</html>