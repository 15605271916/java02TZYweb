package day102502J2EE30spring09;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="c/")
public class Test3Controller {
	
	@RequestMapping("test1")
	public String test1() {
		
		System.out.println("test1............");
		
		return "test1";
		
	}

}
