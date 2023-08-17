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
	String uname = request.getParameter("uname");
	out.println("user name " + uname);
	/* Cookie cookie = new Cookie("uname", uname);
	out.println("user name " + uname);
	response.addCookie(cookie); */
	//session.setAttribute("uname", uname);
	 pageContext.setAttribute("uname", uname, PageContext.APPLICATION_SCOPE);
	 /*application.setAttribute("uname", uname); */
    //session.setMaxInactiveInterval(60);//seconds
	//response.sendRedirect("https://www.oracle.com/");
	%>

	<form action='second.jsp' method='post'>
		<input type='submit' value='go'>
	</form>

</body>
</html>