package com.Registration.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Registration.model.DAOServiceImpl;

@WebServlet("/deleteRegistration")
public class DeleteRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DeleteRegistrationController() {
        super();
        
    }	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("emailId");
		DAOServiceImpl service = new DAOServiceImpl();
		service.connectDB();
		service.deleteRegistration(email);
		
		ResultSet result = service.readAllRegistrations();
		request.setAttribute("result", result);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/all_registrations.jsp");
		rd.forward(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
