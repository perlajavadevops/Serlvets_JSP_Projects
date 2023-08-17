<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	/* Cookie ck[] = request.getCookies();
	out.print("Hello, " + ck[1].getValue()); */
	
	//session.getAttribute("uname");
	
	
	
	%>
	
	<%= pageContext.getAttribute("uname", PageContext.PAGE_SCOPE) %>
		
		
		<%-- <%= application.getAttribute("uname") %> --%>
	
	<%-- <%=session.getAttribute("uname") %> --%>


</body>
</html>