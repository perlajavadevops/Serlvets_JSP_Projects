<%@ page errorPage="error.jsp" %>
<%
	String num1 = request.getParameter("firstnum");
	String num2 = request.getParameter("secondnum");
	
	
	int v1 = Integer.parseInt(num1);
	int v2 = Integer.parseInt(num2);
	
	session.setAttribute("v1", v1);
	session.setAttribute("v2", v2);
	float res = v1 / v2;//10/0==//12/21
	out.print("Output is: " + res);
	
	out.println("======================");
%>

<%@ include file="welcome.jsp"%>