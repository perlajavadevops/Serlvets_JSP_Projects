<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Hello, My First JSP...</p>
	<p>Hello, My First JSP...</p>

	<!-- Scriptlet tag -->
	<%
	int a = 90;
	int b = 80;
	
	out.println(10 + 10);
	out.println(a+b);
	out.println(new Date());
	
	%>

</body>
</html>