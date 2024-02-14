package com.pgr;

import java.io.IOException;
import java.io.PrintWriter;

import com.pgr.beans.LoginBean;
import com.pgr.bs.ValidateLoginDetails;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class ControllerServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		LoginBean bean = new LoginBean();
		bean.setName(name);
		bean.setPassword(password);
		
		ValidateLoginDetails validateLoginDetails = new ValidateLoginDetails();
		boolean status = validateLoginDetails.validate(name, password);

		if (status) {
			RequestDispatcher rd = request
					.getRequestDispatcher("login-success.jsp");
			request.setAttribute("bean", bean);
			rd.forward(request, response);
		} else {
			/*
			 * request.setAttribute("error", true); RequestDispatcher rd = request
			 * .getRequestDispatcher("index.jsp");
			 */
			
			RequestDispatcher rd = request
					.getRequestDispatcher("login-error.jsp");
			rd.forward(request, response);
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	
	

}