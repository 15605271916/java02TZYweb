package day101901J2EE22spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"applicationContext4.xml"});
		
		User5 u1=context.getBean(User5.class);
		System.out.println(u1);
		System.out.println(u1.getDog());
		


		
		
		
		
	}

}
