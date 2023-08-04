package in.ineuron.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/jpeg");
		
		File file = new File("D:/octbatchservletpgms/ResponseInfoApp/Naveen60.jpg");
		FileInputStream fis = new FileInputStream(file);
		
		byte[] b = new byte[(int)file.length()];
		fis.read(b);//reading into byte[] through inputStream
		
		ServletOutputStream stream = response.getOutputStream();
		stream.write(b);
		stream.flush();
		stream.close();
		fis.close();
	}

}
