package com.pgr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Servlet10Demo
 */

@WebServlet("/hello")
public class Servlet10Demo implements Servlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("Hello Destroy");

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Hello Init(-)");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		System.out.println("in service method...");
		PrintWriter pw = res.getWriter();
		pw.println("<html><body><span style='color: red'>Hello, my first servlet program</span></body></html>");
		pw.close();
	}
}
