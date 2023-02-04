

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Pass")
public class Pass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int maths=Integer.parseInt(request.getParameter("subject1"));
		int sci=Integer.parseInt(request.getParameter("subject2"));
		int his=Integer.parseInt(request.getParameter("subject3"));
		
		if(maths>40 && sci>40 && his>40) {
			RequestDispatcher rd = request.getRequestDispatcher("Pass123");
			rd.forward(request, response);			
		}else {
			out.print("You are Fail. Please enter value again.");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
	}

}
