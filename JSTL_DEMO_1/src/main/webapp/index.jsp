<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.pgr.jstl.Employee"%>

  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!Employee employee = new Employee();%>

	<%
	ArrayList<String> names = employee.getNames();

	for (String name : names) {
		out.println(name);
	}
	%>
	
	<c:out value="${Hi}"/>


</body>
</html>