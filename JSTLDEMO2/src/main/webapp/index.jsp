<%@page import="com.pgr.jsp.EmployeeList"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!EmployeeList el = new EmployeeList();
	ArrayList al = el.list();
	
	%>
	<c:out value="${al}"></c:out>

	<c:forEach var="number" begin="5" end="10">
		<c:out value="${number}"></c:out>
	</c:forEach>

	<%
	out.println(el.list());
	request.setAttribute("list", al);
	%>
	<table>
		<c:forEach var="item" items="${list}">
			<tr>${item}
			</tr>
		</c:forEach>
	</table>
</body>
</html>