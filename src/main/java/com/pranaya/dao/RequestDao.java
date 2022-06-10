package com.pranaya.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pranaya.model.Request;

public class RequestDao {
	
	public String insert(Request req) {
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/feedbackProjectDB", "postgres", "Pranaya@11");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String result = "Data Inserted Successfully";
		String sql = "insert into requests(rname, remail, rmessage) values(?,?,?)";
		
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, req.getFname());
			ps.setString(2, req.getFemail());
			ps.setString(3, req.getFmessage());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			result = "Data not entered";
		}
		
		return result;
	}

}
