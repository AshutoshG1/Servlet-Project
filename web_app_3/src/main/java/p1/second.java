package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/secondServlet")
public class second extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

    public second() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("second servlet Get");
		String name = (String)request.getAttribute("x");		
		String city = (String)request.getAttribute("y");
		
		//Access Session variables
		HttpSession session = request.getSession();
		String xSession = (String)session.getAttribute("xSession");
		String ySession = (String)session.getAttribute("ySession");
		System.out.println(name);
		System.out.println(city);
		System.out.println(xSession);
		System.out.println(ySession);
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = (String)request.getAttribute("x");		
		String city = (String)request.getAttribute("y");
		
		//Access Session variables
		HttpSession session = request.getSession();
		String xSession = (String)session.getAttribute("xSession");
		String ySession = (String)session.getAttribute("ySession");
		System.out.println(name);
		System.out.println(city);
		System.out.println(xSession);
		System.out.println(ySession);
	}

}
