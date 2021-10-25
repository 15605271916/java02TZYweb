package day102501J2EE29spring08;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test1Controller {

	@RequestMapping("test1")
	public String test1() {
		
		System.out.println("2021.10.25 Happy birthday tzy！！");
		
		System.out.println("==========");
		
		return "test1";
		
	}
	
	@RequestMapping("test2")
	@ResponseBody
	public User test2() {
		
		System.out.println("==========");
		
		User user=new User();
		
		user.setId(1);
		
		user.setName("qwer");
		
		return user;
		
	}
	
}
