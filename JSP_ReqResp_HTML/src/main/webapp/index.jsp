<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Hello First JSP Programm</p>
	<h3>JSP Demo</h3>
	
	<%! /* int a =5;
		int b =5; */
		
		public int addition(int a, int b){
			return a+b;
		}
	%>
	<%	
	
	String userName = request.getParameter("username");
	String password = request.getParameter("password");
	out.println("User Name " + userName);
	out.println("Password " + password);
	response.sendRedirect("https://www.google.com");
	
	/* String n = (String)config.getInitParameter("JdbcUsername");
	out.println("JdbcUsername "+n);
	//out.print("Addition of 2 numbers is "+(addition(12, 12))); 
	
	String studentName = (String)application.getInitParameter("student");
	out.println("studentName "+studentName);  */
	%>
	
	
	
	<%= addition(12, 23) %>
</body>
</html>