package com.pgr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pgr.util.DBConnection;

public class LoginDao {

	public boolean validateLoginDetails(Login login) {
		boolean flag = false;
		try {
			
			System.out.println(login.getUserName());
			System.out.println(login.getPassword());
			Connection con = DBConnection.getConnection();
			String sqlQuery = "select * from users where username=?";
			PreparedStatement ps = con.prepareStatement(sqlQuery);
			ps.setString(1, login.getUserName());

			ResultSet rs = ps.executeQuery();
			String usernameFromDB = null;
			String passwordFromDB = null;
			while (rs.next()) {
				int userId = rs.getInt(1);
				usernameFromDB = rs.getString(2);
				passwordFromDB = rs.getString(5);

			}

			if (login.getUserName().equalsIgnoreCase(usernameFromDB)
					&& login.getPassword().equalsIgnoreCase(passwordFromDB)) {
				flag = true;
			} else {
				flag = false;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return flag;
	}

}
