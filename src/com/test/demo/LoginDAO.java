package com.test.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	
	public boolean check(String userName , String userPassword) {
		String className = "org.mariadb.jdbc.Driver";
		try {
			Class.forName(className);
			
			String url = "jdbc:mariadb://localhost:3306/test";
			String user = "temp1";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from login_table where user_name=? and user_password=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, userName);
			st.setString(2, userPassword);
			ResultSet rs = st.executeQuery();
			if( rs.next() ) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
}
