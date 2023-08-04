package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(response);
		
		
		String studentName = "Naveen";
		String studenAage = "22";
		String studentAddress = "Gurugram";
		System.out.println();
		
		PrintWriter out = response.getWriter();
		PrintWriter out2 = response.getWriter();
		 
		
		
	}

	private void doProcess(HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<html></html>");
		PrintWriter out2 = response.getWriter();
	}

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
