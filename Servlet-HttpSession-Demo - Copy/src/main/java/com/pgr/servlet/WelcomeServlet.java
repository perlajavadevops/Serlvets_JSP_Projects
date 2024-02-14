package com.pgr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// out.println("<html><body style='color:red'>Welcome User.... </body></html>");
		request.getRequestDispatcher("link.html").include(request, response);

		HttpSession httpSession = request.getSession(false);
		
		
		
		if (httpSession != null) {
			String userName = (String) httpSession.getAttribute("userName");
			String password = (String) httpSession.getAttribute("password");
			
			out.println("<html><body style='color:red'>User Name is " + userName + " password is " + password
					+ "</body></html>");
		} else {
			out.print("<br/>Session got expired and Please login again");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		
		out.close();
		
	}

}
