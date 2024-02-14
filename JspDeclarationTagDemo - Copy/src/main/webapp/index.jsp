<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
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

	<!-- decleration tag -->
	<%!public List<Integer> getValuesList() {

		return Arrays.asList(12, 11, 13, 14);
	}

	class Demo {
		public void testM() {
			System.out.println("Test");
		}
	}%>

	<!-- Scriptlet tag -->
	<%
	int a = 90;
	int b = 80;

	out.println(10 + 10);
	out.println(a + b);
	out.println(new Date());

	Demo demo = new Demo();
	demo.testM();
	%>

	<p>
		<%
		//out.print(getValuesList());
		for (int i = 0; i < getValuesList().size(); i++) {
		%>
	
	<p>
		<%
		out.println(getValuesList().get(i));
		}
		%>
	</p>
</body>
</html>