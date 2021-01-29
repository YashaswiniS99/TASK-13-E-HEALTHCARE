package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/EditController")

public class EditController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	   public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
		{
			   DoctorController controller = new DoctorController();
			
			   int id= Integer.parseInt(request.getParameter("id"));
			   String name = request.getParameter("name");
			   String specialization = request.getParameter("specialization");
		     Double d=Double.parseDouble(request.getParameter("contactnumber"));
		        long contactnumber =d.longValue();
		        controller.editDoctor(id, name, specialization, contactnumber);
		          
		     response.sendRedirect("Login");
	}
	}

