<%@page import="com.pgr.dao.UserDao"%>
<jsp:useBean id="u" class="com.pgr.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u" />

<%
	UserDao.delete(u);
	//request.setAttribute("success", true);
	response.sendRedirect("viewusers.jsp");
%>