package day092702J2EE06servlet05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test5 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("test5");
		
		System.out.println(req.getAttribute("name"));
		
		System.out.println(req.getSession().getAttribute("name"));
		
		System.out.println(req.getServletContext().getAttribute("name"));
		
		System.out.println("==========");
		
		String content=req.getParameter("name");
		
		PrintWriter out=resp.getWriter();
		
		out.print("博为峰test5"+content);
		
		out.flush();
		out.close();

		
	}
	
	

}
