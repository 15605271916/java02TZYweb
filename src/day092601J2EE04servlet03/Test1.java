package day092601J2EE04servlet03;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test1 extends HttpServlet {

	private String encode = null;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doPost(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		System.out.println("带参数的初始化");

		System.out.println(config);

		System.out.println(config.getServletName());

		System.out.println(config.getInitParameter("a"));

		System.out.println(config.getInitParameter("b"));

		System.out.println(config.getInitParameterNames());

		Enumeration<String> names = config.getInitParameterNames();

		while (names.hasMoreElements()) {

			String name = names.nextElement();

			System.out.println(name+":"+config.getInitParameter(name));

		}
		
		encode=config.getInitParameter(encode);
		
	}

	@Override
	public void init() throws ServletException {

		System.out.println("无参数的初始化");

	}

}
