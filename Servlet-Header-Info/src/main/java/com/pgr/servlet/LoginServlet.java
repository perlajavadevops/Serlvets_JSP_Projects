package com.pgr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */

@WebServlet("/login")
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

		HashMap<String, String> map = new HashMap<String, String>();
		Enumeration<String> enu = request.getHeaderNames();
		while (enu.hasMoreElements()) {
			String key = enu.nextElement();
			map.put(key, request.getHeader(key));
		}
		
		map.forEach((key, value) ->{
			System.out.println(key+": "+value);
		});
		/*
		 * System.out.println("============================"); Enumeration<?> reqRanges
		 * = request.getHeaders("Remote Address"); if (reqRanges == null ||
		 * !reqRanges.hasMoreElements()) { while (enu.hasMoreElements()) {
		 * System.out.println(enu.nextElement()); }
		 * 
		 * }
		 */
		out.close();
	}

}
