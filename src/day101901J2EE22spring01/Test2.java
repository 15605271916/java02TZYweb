package day101901J2EE22spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"applicationContext2.xml"});
		
		User4 u1=context.getBean("u1",User4.class);
		
		System.out.println(u1);
		System.out.println(u1.getName());
		System.out.println(u1.getDog());
		
		u1.setName("张三");
		u1.setDog(context.getBean(Dog.class));
		
		System.out.println(u1.getName());
		System.out.println(u1.getDog());
		
		u1.getDog().setName("旺财");
		System.out.println(u1.getDog().getName());
		
		System.out.println("==========");
		
		User4 u2=context.getBean("u2",User4.class);
		System.out.println(u2);
		System.out.println(u2.getName());
		System.out.println(u2.getDog());
		
		
		
		
		
		
		
		
		
		
		
	}

}
