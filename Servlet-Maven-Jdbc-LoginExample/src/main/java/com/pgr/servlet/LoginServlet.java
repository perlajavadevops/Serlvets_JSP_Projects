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
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Request");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		LoginDao loginDao = new LoginDao();
		boolean valid = loginDao.validateLoginDetails(userName, password);

		if (valid) {
			request.getRequestDispatcher("/welcome").forward(request, response);
		} else {
			out.print("Invalid User Details");
			request.getRequestDispatcher("index.html").include(request, response);
		}

		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Request");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		LoginDao loginDao = new LoginDao();
		boolean valid = loginDao.validateLoginDetails(userName, password);
		if (valid) {
			out.println("<html><body style='color:red'>User Name is " + userName + " password is " + password
					+ "</body></html>");
		} else {
			out.print("Invalid User Details");
		}

		out.close();
	}

}
