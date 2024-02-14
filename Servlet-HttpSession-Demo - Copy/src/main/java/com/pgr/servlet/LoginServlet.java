package com.pgr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.pgr.dao.LoginDao;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		if (valid) {

			HttpSession httpSession = request.getSession(true);
			httpSession.setMaxInactiveInterval(60);//seconds
			httpSession.setAttribute("userName", userName);
			httpSession.setAttribute("password", password);
			out.println("<b>User logged in success and user is </b>"+userName);
			
		} else {
			out.print("Invalid User Details");
			request.getRequestDispatcher("login.html").include(request, response);
		}

		out.close();
	}

}
