package day092401J2EE03servlet02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

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

		System.out.println("day2 test4 ");

		System.out.println(req);

		String name = req.getParameter("a");

		System.out.println("参数：" + name);

		String[] aihao = req.getParameterValues("aihao");

		for (String ah : aihao) {

			System.out.println(ah);
			
		}

		Enumeration<String> paramName = req.getParameterNames();

		while (paramName.hasMoreElements()) {

			String n = paramName.nextElement();

			System.out.println(n);
			
			break;

		}

		System.out.println("===============");
		
		Map map= req.getParameterMap();
		
		System.out.println(map);
		
		System.out.println(map.keySet());
		
		Set<String> key=map.keySet();
		
		for (String k : key) {
			
			String[] v=(String[]) map.get(k);
			
			for (String value : v) {
				
				System.out.println("参数名字："+k+" 值："+value);
				
			}
		}
		
		System.out.println("===============");
		
		String query=req.getQueryString();
		
		System.out.println(query.split("&")[0].split("=")[0]);
		
		System.out.println(query.split("&")[0].split("=")[1]);
		
		resp.setContentType("text/html");
		
		//在页面上输出所有的爱好
		PrintWriter out= resp.getWriter();
	
		out.print("<ul>");
		
		String[] ahs=req.getParameterValues("aihao");
		
		for (String ah : ahs) {
			
		out.print("<li>");
		
			out.print(ah);
		
		out.print("</li>");
		
		}
		
		out.print("</ul>");
		
		out.flush();
		out.close();
		
	}

}
