
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		if (password.equals("admin")) {
			out.print("Welcome, " + name);

			out.print("<form action='ProfileServlet' method='post'> ");
			out.print("<input type='text' name='name' value='" + name + "'>");
			out.print("<input type='submit' value='go'/> ");

			out.print("</form>");

			out.close();
		} else {
			out.print("Sorry, username or password error!");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		out.close();
	}

}
