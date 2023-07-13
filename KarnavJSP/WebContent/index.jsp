<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>Hi Hello First JSP Program</div>
	<div>Hello JSP Modified Message</div>
	
	<%!
	
	public int cub(int a, int b){
		return a*b;
	}
	
	
	%>
	
	<%
	
	 int a =90;
	
	out.println(cub(10, 10));
	out.print(a);
	
	
	
	%>
	
	<%=cub(20, 20) %>
</body>
</html>