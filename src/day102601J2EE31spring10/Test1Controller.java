package day102601J2EE31spring10;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="a/")
public class Test1Controller {
	
	@RequestMapping("test1")
	public String test1() {
		
		System.out.println("a      test1............");
		
		return "test1";
		
	}
	
	@RequestMapping("test2")
	public ModelAndView test2() {
		
		System.out.println("a      test2............");
		
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("test1");
		mv.addObject("name","qwer");
		
		return mv;
	}
	
	@RequestMapping("test3")
	public ModelAndView test3() {
		
		System.out.println("a      test3............");
		
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("test1");
		mv.addObject("name","qwer");
		mv.addObject("id",100);
		
        List<User> users=new ArrayList<>();
		
		User user1=new User();
		user1.setId(1);
		user1.setName("zhangsan");
		
		User user2=new User();
		user1.setId(2);
		user1.setName("lisi");
		
		User user3=new User();
		user1.setId(3);
		user1.setName("wangwu");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		mv.addObject("users",users);
		
		return mv;
	}
	
	

}
