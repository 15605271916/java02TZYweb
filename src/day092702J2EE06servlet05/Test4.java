package day092702J2EE06servlet05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test4 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doPost(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("test4");

		req.setAttribute("name", "zhangsan");

		req.getSession().setAttribute("name", "lisi");

		getServletContext().setAttribute("name", "wangwu");

		req.getRequestDispatcher("/test45").forward(req, resp);

//		resp.sendRedirect("test45");

		System.out.println("转发之后继续执行............");
		
		System.out.println("==========");
		
		String content=req.getParameter("content");
		
		PrintWriter out = resp.getWriter();

		out.print("博为峰test4"+content);

		out.flush();
		out.close();

	}

}
