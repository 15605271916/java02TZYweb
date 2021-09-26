package day092401J2EE03servlet02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test6 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doPost(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		resp.setCharacterEncoding("utf-8");
		
		resp.setContentType("text/html;charset=utf-8");
		
		System.out.println(req.getCharacterEncoding());
		
		String name=req.getParameter("name");
		
		System.out.println(name);
		
		PrintWriter out=resp.getWriter();
		
		out.print(name);
		
		out.flush();
		out.close();
		
	}

}
