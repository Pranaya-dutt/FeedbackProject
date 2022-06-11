package com.pranaya;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.pranaya.dao.RequestDao;
import com.pranaya.model.Request;

public class DashboardServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		if(session.getAttribute("username")==null){
			response.sendRedirect("login");
		} else {
			request.setAttribute("requests", new RequestDao().getRequests());
			RequestDispatcher rd = request.getRequestDispatcher("dashboard.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int reqId = Integer.parseInt(request.getParameter("reqId"));
		
		Request req = new Request(reqId);
		RequestDao rDao = new RequestDao();
		
		try {
			rDao.toggle(req);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
