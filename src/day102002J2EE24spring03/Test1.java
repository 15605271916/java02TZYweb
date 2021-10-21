package day102002J2EE24spring03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import day102001J2EE23spring02.IUserService;

public class Test1 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext6.xml" });

		IUserService userService = context.getBean("userService", IUserService.class);
		System.out.println(userService);
		userService.show();

	}

}
