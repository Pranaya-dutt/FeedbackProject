package com.pranaya;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.pranaya.dao.RequestDao;
import com.pranaya.model.Request;


public class ContactUsServlet extends HttpServlet {
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		RequestDispatcher rd = request.getRequestDispatcher("contactus.jsp");
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String rname = request.getParameter("rname");
		String remail = request.getParameter("remail");
		String rmessage = request.getParameter("rmessage");
		
		Request req = new Request(rname, remail, rmessage);
		
		RequestDao rdao = new RequestDao();
		String result = rdao.insert(req);
		response.getWriter().print(result);
		
	}

}
