package com.pranaya.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.pranaya.model.User;

public class UserDao {
	
	String sql = "select * from users where uname=? and pass=?";
	String url = "jdbc:postgresql://localhost:5432/feedbackProjectDB";
	String username = "postgres";
	String password = "Pranaya@11";
	
	
	public boolean check(User user) {
		
		try {
			
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getUname());
			ps.setString(2, user.getPass());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
