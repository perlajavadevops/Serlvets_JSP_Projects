<%@page import="com.pgr.jsp.EmployeeList"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!EmployeeList el = new EmployeeList();
	ArrayList al = el.list();%>

	<c:forEach var="number" begin="5" end="10">
		<c:out value="${number}"></c:out>
	</c:forEach>

	<%
	/* 	out.println(el.list()); */
	request.setAttribute("list", al);
	%>
	<table>
		<c:forEach var="item" items="${list}">
			<tr>${item}
			</tr>
		</c:forEach>
	</table>

	<c:catch var="exe">
		<%
		int a = 10 / 0;
		%>
	</c:catch>

	<c:if test="${exe!=null}">
	   ${exe}
	</c:if>

	<%-- ${exe} --%>

	<c:set var="testString" value="Hello this is a JSTL function example." />
	<c:if test="${fn:startsWith(testString, 'Hello')}">
		<h4>String starts with Hello.</h4>
	</c:if>
	
	
</body>
</html>