package com.pgr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet implementation class FirstDemo
 */
//@WebServlet("/first")
public class FirstDemo implements Servlet {

	@Override
	public void destroy() {
		System.out.println("Destroyed");
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
		System.out.println("Initialized");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Request");

		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		pw.print("Hi Hello....");

		pw.close();

	}

}
