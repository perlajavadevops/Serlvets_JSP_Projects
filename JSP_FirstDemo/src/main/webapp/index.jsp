<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>First JSP Example without Java code.</h1>
   
   <%! public int a =100;
   	   public int b =100;
   	   
   	   public int addition(){
   		   return a+b;
   	   }
   	%>
   <%
   	out.println("Addition of 2 numbers is "+(2+2));
   %>
   
   <%= addition() %>
  <%--   <%= 10+10 %> --%>
</body>
</html>