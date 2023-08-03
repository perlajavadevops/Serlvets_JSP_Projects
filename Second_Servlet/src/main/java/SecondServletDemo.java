import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SecondServletDemo
 */
@WebServlet("/login")
public class SecondServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { System.out.println();
	 * 
	 * String username = request.getParameter("username"); String password =
	 * request.getParameter("password"); PrintWriter out = response.getWriter();
	 * response.setContentType("text/html");
	 * out.print("<h1>Hello First HTML With Servlets...</h1>");
	 * out.print("<span>Hello, " + username + " : " + password + "</span>");
	 * 
	 * out.close(); }
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println();

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<h1>Hello First HTML With Servlets...</h1>");
		out.print("<span>Hello, " + username + " : " + password + "</span>");

		out.close();
	}

}
