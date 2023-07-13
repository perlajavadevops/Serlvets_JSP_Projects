package com.pgr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
/*@WebServlet("/login")
*/public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DBConnection DBconnection = new DBConnection();
	Connection con = null;

	@Override
	public void init() throws ServletException {

		con = DBconnection.getMysqlConnection();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	public User getLoginDetails(String username){
		
		User user = new User();
		String sqlQuery = "select * from user905 where name=?";
		try {
			PreparedStatement ps = con.prepareStatement(sqlQuery);
			ps.setString(1, username);
			
			ResultSet set = ps.executeQuery();
			while(set.next()){
				user.setUserName(set.getString("name"));
				user.setPassword(set.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user;
	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("User Name " + userName);
		System.out.println("Password " + password);
		
		boolean flag = validatLogin(userName, password);
		if (flag) {
			out.println("<html><body>Welocome " + userName + "</body></html>");
		} else {
			out.println("<html><body>Please provide valid username and password");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
			out.println("</body></html>");
		}
	}

	private boolean validatLogin(String userName, String password) {
		System.out.println("validatLogin Entering");
		User user = getLoginDetails(userName);
		if(userName.equals(user.getUserName()) && password.equals(user.password)){
			System.out.println("Uesrname and password validated; Existing");
			return true;
		}else{
			System.out.println("Uesrname and password are Invalid; Existing");
			return false;
		}
		
	}

}
