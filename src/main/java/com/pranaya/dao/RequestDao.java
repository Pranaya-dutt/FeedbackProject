package com.pranaya.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pranaya.model.Request;

public class RequestDao {
	
	String result = "Data Inserted Successfully";
	String sqlToInsert = "insert into requests(rname, remail, rmessage) values(?,?,?)";
	String sqlToGet = "select rid, rname, remail, rmessage, rstatus from requests order by rid";
	String sqlToToggle = "update requests set rstatus = ? where rid = ?";
	String sqlToGetStatus = "select rstatus from requests where rid = ?";
	String url = "jdbc:postgresql://localhost:5432/feedbackProjectDB";
	String username = "postgres";
	String password = "Pranaya@11";
	
	
	public List<Request> getRequests() {
		
		List<Request> requests = new ArrayList<>();
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url,username, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sqlToGet);
			while(rs.next()) {
				Request req = new Request();
				req.setRid(rs.getInt(1));
				req.setRname(rs.getString(2));
				req.setRemail(rs.getString(3));
				req.setRmessage(rs.getString(4));
				req.setRstatus(rs.getBoolean(5));
				
				requests.add(req);
			}
			
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return requests;	
	}
	
	public void toggle(Request request) {
		
		try {
			
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			
			PreparedStatement psGetStatus = con.prepareStatement(sqlToGetStatus);
			psGetStatus.setInt(1, request.getRid());
			ResultSet rs = psGetStatus.executeQuery();
			rs.next();
			boolean requestStatus = rs.getBoolean("rstatus");
			
			PreparedStatement ps = con.prepareStatement(sqlToToggle);
			if(requestStatus) {
				ps.setBoolean(1, false);
				ps.setInt(2, request.getRid());
				ps.executeUpdate();
			} else {
				ps.setBoolean(1, true);
				ps.setInt(2, request.getRid());
				ps.executeUpdate();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public String insert(Request req) {
		
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement ps = con.prepareStatement(sqlToInsert);
			ps.setString(1, req.getRname());
			ps.setString(2, req.getRemail());
			ps.setString(3, req.getRmessage());
			
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			result = "Data not entered";
		}
		return result;
	}

}
