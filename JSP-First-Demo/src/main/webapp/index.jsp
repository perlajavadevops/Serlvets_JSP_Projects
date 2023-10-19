<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!static int a = 90;
	static int b = 90;

	class A {
		public int add() {
			return a + b;
		}
	}%>

	<%
	A a = new A();
	out.println(a.add());
	%>

	<br />
	<b>request, response, out, session, application, page, exception,
		pageContext, config 1. scriptlet tag 2. declarative tag 3. expression
		tag </b>
</body>
</html>

