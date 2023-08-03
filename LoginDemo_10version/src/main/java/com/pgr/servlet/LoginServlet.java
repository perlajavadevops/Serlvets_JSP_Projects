package com.pgr.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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
		response.setContentType("text/html");
		System.out.println("in service method...");
		PrintWriter pw = response.getWriter();
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		pw.println("<html><body><span style='color: red'>Hello, my first servlet program</span></body></html>");
		pw.println("Username :"+userName);
		pw.println("Password :"+password);
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("in service method...");
		PrintWriter pw = response.getWriter();
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		pw.println("<html><body><span style='color: red'>Hello, my first servlet program</span></body></html>");
		pw.println("Username :"+userName);
		pw.println("Password :"+password);
		pw.close();
	}

}
