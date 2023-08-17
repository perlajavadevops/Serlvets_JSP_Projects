<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello, my first jsp example</h1>
	<h1>Hello, my first jsp example</h1>
	<h1>Hello, my first jsp example</h1>
	<h1>Hello, my first jsp example</h1>
	<h1>Hello, my first jsp example</h1>
	<h1>Hello, my first jsp example</h1>

	<%!class A {
		public int m() {
			return 10 + 10;
		}
	}%>

	<%
	int a = 90;
	int b = 90;
	out.print(a + b);

	A aa = new A();
	out.println(aa.m());
	%>
</body>
</html>