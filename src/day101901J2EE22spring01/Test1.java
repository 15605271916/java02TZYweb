package day101901J2EE22spring01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		
		//主动创建
		User u1=new User();
		System.out.println(u1);
		
		//从容器中获取
		User u2=(User)context.getBean("User");
		System.out.println(u2);
		
		User u3=context.getBean(User.class);
		System.out.println(u3);
		
		User3 u4=context.getBean("User3",User3.class);
		System.out.println(u4);
		
		User3 u5=context.getBean("User3",User3.class);
		System.out.println(u5);
		
		
		
	}

}
