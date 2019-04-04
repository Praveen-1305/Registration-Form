

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
   	{
	
   		{
   			response.setContentType("text/html");
   			PrintWriter out=response.getWriter();
   			
   			String name = request.getParameter("Name");
   			String address = request.getParameter("address");
   			String email = request.getParameter("Email.id");
   			String number = request.getParameter("Contact no.");
   			
   			out.print("<b>Registered Successfully</b><br/><br/>");
   			out.print("<b>Name:</b>" + name);
   			out.print(" <br/><b>Address:</b>" + address);
   			out.print("<br/><b> Email id:</b>" + email);
   			out.print("<br/> <b>Mobile no:</b>" + number);
   			
   		}
    }
}