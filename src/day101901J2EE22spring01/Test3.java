package day101901J2EE22spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"applicationContext3.xml"});
		
		User4 u1=context.getBean("u1",User4.class);
		System.out.println(u1.getName());
		
		System.out.println("==========");
		
		User4 u2=context.getBean("u2",User4.class);
		System.out.println(u2.getName());
		
		System.out.println("==========");
		
		User4 u3=context.getBean("u3",User4.class);
		System.out.println(u3.getName());
		System.out.println(u3.getDog());
		
		System.out.println("==========");
		
		User4 u4=context.getBean("u4",User4.class);
		System.out.println(u4.getName());
		System.out.println("在内部的狗"+u4.getDog());
		System.out.println(u4.getDog().getName());
		
		System.out.println("=====获取dog2=====");
		
		Dog dog2=context.getBean("dog1",Dog.class);
		System.out.println("在外部的狗"+dog2);
		
		System.out.println("=====构造函数内部注入=====");
		
		User4 u5=context.getBean("u5",User4.class);
		System.out.println(u5.getName());
		System.out.println("构造函数的内部注入"+u5.getDog());
		System.out.println(u5.getDog().getName());
		
		
		
		
		
		
		
	}

}
