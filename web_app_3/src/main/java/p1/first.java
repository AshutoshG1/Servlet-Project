package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/firstServlet")
public class first extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public first() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("hello.html");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		request.setAttribute("x", name);		
		request.setAttribute("y", city);
		
		//Session variables
		HttpSession session = request.getSession();
		session.setAttribute("xSession", name);
		session.setAttribute("ySession", city);
		
		//inter servlet communication
		RequestDispatcher rd = request.getRequestDispatcher("secondServlet");
		rd.forward(request, response);
	}

}
