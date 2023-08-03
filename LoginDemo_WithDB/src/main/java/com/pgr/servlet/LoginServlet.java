package com.pgr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DBConnection DBconnection = new DBConnection();
	Connection con = null;

	@Override
	public void init() throws ServletException {

		con = DBconnection.getMysqlConnection();

	}

	public User getLoginDetails(String username) {

		User user = new User();
		String sqlQuery = "select * from users where username=?";
		try {
			PreparedStatement ps = con.prepareStatement(sqlQuery);
			ps.setString(1, username);

			ResultSet set = ps.executeQuery();
			while (set.next()) {
				user.setUserName(set.getString("username"));
				user.setPassword(set.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.println("in service method...");
		PrintWriter pw = response.getWriter();

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		boolean flag = validatLogin(userName, password);
		
		ServletContext context = getServletContext();
		
		context.setAttribute("uName", userName);
		context.setAttribute("pass", password);
		ServletConfig config = getServletConfig();
		int val = Integer.parseInt(config.getInitParameter("val"));
		System.out.println("val "+val);

		if (flag) {
			RequestDispatcher rd = request.getRequestDispatcher("welcome");// serlvets, jsp, html
			rd.forward(request, response);
		} else {
			pw.println("<html><body>Please provide valid username and password");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");// serlvets, jsp, html
			rd.include(request, response);
			pw.println("</body></html>");

		}
		pw.close();

	}

	private boolean validatLogin(String userName, String password) {
		System.out.println("validatLogin() -- validatLogin Entering");
		User user = getLoginDetails(userName);
		if (userName.equals(user.getUserName()) && password.equals(user.password)) {
			System.out.println("validatLogin() -- Uesrname and password validated; Existing");
			return true;
		} else {
			System.out.println("Uesrname and password are Invalid; Existing");
			return false;
		}
	}

}
