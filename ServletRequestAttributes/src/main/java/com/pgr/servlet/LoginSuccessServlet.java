package com.pgr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginSuccessServlet
 */
public class LoginSuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		out.println("<html><body style='color:blue'>User is logged in success....</body></html>");

		// request object get Attribute method
		String userName = (String) req.getAttribute("u");
		String password = (String) req.getAttribute("p");

		// sevlet context object get Attribute method
		ServletContext context = req.getServletContext();
		String userName1 = (String) context.getAttribute("uC");
		String password1 = (String) context.getAttribute("pC");

		out.println("<html><body><span style='color:blue'>User Name and password from servlet request(request scope) "
				+ userName + " password is " + password+"</span><br/>");

		out.println("<span style='color:red'>User Name and password from servlet context(application scope) "
				+ userName1 + " password is " + password1 + "</span></body></html>");

	}
}
