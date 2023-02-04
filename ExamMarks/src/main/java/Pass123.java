

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Pass123")
public class Pass123 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int maths=Integer.parseInt(request.getParameter("subject1"));
		int sci=Integer.parseInt(request.getParameter("subject2"));
		int his=Integer.parseInt(request.getParameter("subject3"));
		
		int total=maths+sci+his;
		float per=total/3;
		char grade='A';
				
		out.println("Maths: "+maths+"<br/>");
		out.println("Science: "+sci+"<br/>");
		out.println("History: "+his+"<br/><br/>");
		out.println("Total: "+total+"<br/>");
		out.println("Per: "+per+"<br/>");
		out.println("Grade: "+grade+"<br/>");
	}

}
