package day092803J2EE10jsp01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test5 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html");
		
		String name=req.getParameter("name");
		
		PrintWriter out=resp.getWriter();
		
		out.print("<html>");
		
		out.print("<body>");
		
		out.print("<b>qwer</b>");
		
		out.print(name.toUpperCase());
		
		out.print("</body>");
		
		out.print("</html>");
		
		out.flush();
		out.close();
		
		

		
	}
	
	

}
