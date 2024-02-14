package com.pgr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.pgr.dao.LoginDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPostRequestDemo
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		LoginDao loginDao = new LoginDao();
		boolean valid = loginDao.validateLoginDetails(userName, password);
		if (valid) {
			RequestDispatcher rd = request.getRequestDispatcher("/success");
			rd.forward(request, response);
		} else {
			out.print("Invalid User Details");

			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);

		}
		out.close();
	}

}
