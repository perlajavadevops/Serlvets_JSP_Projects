<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

Integer	 num3 = (Integer)session.getAttribute("v1");
Integer	 num4 = (Integer)session.getAttribute("v2");

out.println("Addion of 2 numbers is ? "+(num3+num4));

%>

</body>
</html>