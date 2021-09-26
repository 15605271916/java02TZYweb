package day092601J2EE04servlet03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Test2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("通过ajax请求的 get");
		
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("通过ajax请求的 post");
		
		/*String name=req.getParameter("name");
		String age=req.getParameter("age");
		
		System.out.println(name);
		System.out.println(age);
		
		PrintWriter out= resp.getWriter();
		out.print("name="+name.toUpperCase());*/
		
		//out.print("{\"name\":"+"\""+name.toUpperCase()+"\"}");
		
		BufferedReader reader= req.getReader();
		StringBuffer sb=new StringBuffer();
		
		String line=reader.readLine();
		while(line!=null) {
			sb.append(line);
			line=reader.readLine();
			
		}
		
		System.out.println(sb);
		
		User user= JSON.parseObject(sb.toString(), User.class);
		
		System.out.println("姓名："+user.getName());
		System.out.println("年龄："+user.getAge());
		
		user.setName(user.getName().toUpperCase());
		user.setAge(String.valueOf(Integer.parseInt(user.getAge())+1));
		String u=JSONObject.toJSONString(user);
		System.out.println(u);
		PrintWriter out= resp.getWriter();
		out.print(u);
		out.flush();
		out.close();
	
		/*InputStream in=  req.getInputStream();
		Reader r=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(r);
		String l=br.readLine();
		while(l!=null) {
			
			System.out.println(l);
			l=br.readLine();
		}*/
		
	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		ServletContext context= config.getServletContext();
		System.out.println(context);
		
		System.out.println(context.getContextPath());
		System.out.println(context.getInitParameter("a")); 
		System.out.println(context.getRealPath(""));
		System.out.println("当前test2 servlet 参数："+config.getInitParameter("a"));
		
	}
	
}
