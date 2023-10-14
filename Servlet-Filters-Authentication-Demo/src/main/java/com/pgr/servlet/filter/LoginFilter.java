package com.pgr.servlet.filter;

import java.io.IOException;
import java.io.PrintWriter;

import com.pgr.dao.LoginDao;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class LoginFilter
 */

//@WebFilter("/loginFilter")
public class LoginFilter implements Filter {

	/**
	 * @see HttpFilter#HttpFilter()
	 */
	public LoginFilter() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("Filter Destroyed is invoked....");

	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("Filter is invoked Before Login....");
		PrintWriter pw = response.getWriter();
		// pw.println("Filter is invoked Before Login....");

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		LoginDao loginDao = new LoginDao();
		boolean valid = loginDao.validateLoginDetails(userName, password);
		RequestDispatcher rd = request.getRequestDispatcher("/index.html");
		if (valid) {
			// pass the request along the filter chain
			chain.doFilter(request, response);
		} else {
			//pw.print("Invalid User Details");
			rd.include(request, response);
		}

		System.out.println("Filter is invoked After Login....");
		// pw.println("Filter is invoked After Login....");

		pw.close();
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter init is invoked....");
	}

}
