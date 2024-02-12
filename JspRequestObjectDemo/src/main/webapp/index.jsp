<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<b>Hello First HTML With JSP...</b>

	<!-- Declarative tag -->



	<!-- Scriptlet tag -->

	<%
	String userName = request.getParameter("userName");
	String pass = request.getParameter("password");
	/* out.println(userName);
	out.print(pass); */
	
	//response.sendRedirect(location);
	%>
	<!-- Scriptlet tag -->

	<!-- Expression Tag -->
	<%=userName%>
	<%=pass%>
	<!-- Expression Tag -->

</body>
</html>