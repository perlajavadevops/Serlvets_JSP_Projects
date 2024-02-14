<%-- <%
if (request.getAttribute("error") != null) {
	out.print("Not valid user! Try again<hr>");
}
%> --%>

<form action="login" method="post">
	Name:<input type="text" name="name"><br> Password:<input
		type="password" name="password"><br> <input type="submit"
		value="login">
</form>
