package in.ineuron.bean;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sudent
 */
@WebServlet("/student")
public class Sudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   private Integer Sid;
   private String sname;
   private Integer sage;
}
