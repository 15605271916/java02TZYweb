package day092302J2EE02servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test2 extends HttpServlet {

	public Test2() {

		System.out.println("Test2被实例化......");

	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("请求过来了......");

		PrintWriter out=resp.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("<head><link href='my.css' rel='stylesheet'/></head>");
		out.print("<b>hello</b>");
		out.print("</br>");
		out.print("hello");
		out.print("</body>");
		out.print("</html>");
		
		
		out.flush();
		out.close();
		
	}

}
