package com.Registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Registration.model.DAOServiceImpl;

@WebServlet("/saveRegistration")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public RegistrationController() {
        super();
        
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/create_registration.jsp");	
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String course = request.getParameter("course");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		HttpSession session = request.getSession(false);
		if(session.getAttribute("email")!=null) {
		
		DAOServiceImpl service = new DAOServiceImpl();
		service.connectDB();
		service.createRegistration(name, course, email, mobile);
		
		request.setAttribute("msg", "Record is saved");
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/create_registration.jsp");	
		rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");	
			rd.forward(request, response);
		}
	}
}
