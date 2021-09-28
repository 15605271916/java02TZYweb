package day092701J2EE05servlet04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import day092601J2EE04servlet03.User;

public class Test2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doPost(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name=req.getParameter("name");
		
		System.out.println(name);
		
		name=(String) req.getAttribute("name");
		
		System.out.println(name);
		
		req.setAttribute("name", "qwer");
		
		name=(String) req.getAttribute("name");
		
		System.out.println(name);
		
		req.setAttribute("name", 100);
		
		int num=(int) req.getAttribute("name");
		
		System.out.println(num);
		
		System.out.println("==========");
		
		User u=new User();
		
		u.setName("zhangsan");
		
		u.setAge("25");
		
		req.setAttribute("user", u);
		
		User u2=(User) req.getAttribute("user");
		
		System.out.println(u2.getName());
		
		System.out.println("==========");
		
		String n="qwerasdf";
		
		int a=199;
		
		User u3=new User();
		
		u3.setName("李四");
		
		System.out.println(n);
		
		System.out.println(a);
		
		System.out.println(u3.getName());
		
		System.out.println("==========");
		
		req.setAttribute("name", "zhangsan");
		
		HttpSession session=req.getSession();
		
		session.setAttribute("name", "lisi");
		
		System.out.println("test2");
		
		System.out.println(req.getAttribute("name"));
		
		System.out.println(session.getAttribute("name"));
		
		System.out.println("==========");
		
		ServletContext application=getServletContext();
		
		application.setAttribute("name", "wangwu");
		
		System.out.println("test2");
		
		System.out.println(req.getAttribute("name"));
		
		System.out.println(session.getAttribute("name"));
		
		System.out.println(application.getAttribute("name"));
		
		System.out.println("==========");
		
		
		if(req.getAttribute("count")==null) {
			req.setAttribute("count", 1);
		}else {
			req.setAttribute("count", (int)req.getAttribute("count")+1);
		}
		
		
		if(session.getAttribute("count")==null) {
			session.setAttribute("count", 1);
		}else {
			session.setAttribute("count", (int)session.getAttribute("count")+1);
		}
		
		
		if(application.getAttribute("count")==null) {
			application.setAttribute("count", 1);
		}else {
			application.setAttribute("count", (int)application.getAttribute("count")+1);
		}
		
		
		PrintWriter out=resp.getWriter();
		
		out.print("<html>");
		out.print("requst:"+req.getAttribute("count"));
		out.print("<br/>");
		out.print("session:"+session.getAttribute("count"));
		out.print("<br/>");
		out.print("application:"+application.getAttribute("count"));
		out.print("<br/>");
		out.print("</html>");
		
		out.flush();
		out.close();
		
	}
	
}
