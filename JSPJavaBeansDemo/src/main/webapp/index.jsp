<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	index.jsp file
	<jsp:useBean id="obj" class="com.pgr.jsp.javabean.Employee" />
	<jsp:setProperty property="id" name="obj" value="5" />
	<jsp:setProperty property="name" name="obj" value="reddy"/>
	<%
	/* obj.setId(5);
	obj.setName("Reddy"); */

	out.print("cube of 5 is " + obj.getId());
	out.print("cube of 5 is " + obj.getName());
	%>
	<jsp:getProperty property="id" name="obj"/>
	<jsp:getProperty property="name" name="obj"/>
	
	<strong>${obj.getId() le 2}</strong>
</body>
</html>