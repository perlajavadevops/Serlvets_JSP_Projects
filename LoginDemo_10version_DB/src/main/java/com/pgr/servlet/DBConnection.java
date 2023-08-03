package com.pgr.servlet;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public Connection getMysqlConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/demo", "root", "root");
			System.out.println("DB connection is established Successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;

	}
}
