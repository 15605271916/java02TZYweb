package day092401J2EE03servlet02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test1 extends HttpServlet {

	public Test1() {

		System.out.println("第二天Test1被实例化......");

	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		System.out.println("请求过来了......");

		PrintWriter out=resp.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<head><link href='my.css' rel='stylesheet'/></head>");
		out.print("<div>qwer</div>");
		out.print("</br>");
		out.print("qwer");
		out.print("</body>");
		out.print("</html>");
		
		out.flush();
		out.close();

	}

}
