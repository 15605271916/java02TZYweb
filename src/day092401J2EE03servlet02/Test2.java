package day092401J2EE03servlet02;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test2 extends HttpServlet {
	
	public Test2() {
		
		System.out.println("day2 test2被实例化");
		
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("每次请求都会调用一个方法");

	}

	@Override
	public void init() throws ServletException {

		System.out.println("day2中的test2初始化");

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("day2中的test2 get请求");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("day2中的test2 post请求");
	}

	@Override
	public void destroy() {

		System.out.println("day2中的test2 对象被销毁");
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	

}
