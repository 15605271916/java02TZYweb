package day102001J2EE23spring02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"applicationContext5.xml"});
		
		User1 user1=context.getBean("user1",User1.class);
		
		System.out.println(user1.getName());
		
		System.out.println(user1.getList());
		System.out.println(user1.getList().size());
		
		System.out.println(user1.getSet());
		System.out.println(user1.getSet().size());
		
		System.out.println(user1.getMap());
		
		System.out.println(user1.getPro());
		
		/*System.out.println(user1.getArray());
		System.out.println(user1.getArray().length);*/
		
		
		

		
		
		
	}

}
