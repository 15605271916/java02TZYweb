package day102102J2EE27spring06;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test3Controller {

	@RequestMapping("/test1")
	public void test1() {

		System.out.println("test1............");
		
	}
	
	@RequestMapping("/test2")
	public String test2() {
		
		System.out.println("test2..........");
		
		return "test1";
		
	}
	
}
