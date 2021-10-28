package day102701J2EE32spring11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path="a/")
public class Test1Controller {
	
	@RequestMapping("test2")
	public ModelAndView test1() {
		
		System.out.println("a      test2............");
		
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("test2");
		
		mv.addObject("img","b.jpg");
		
		return mv;
		
	}
	
	@RequestMapping("test3")
	public ModelAndView test2() {
		
		System.out.println("a      test3............");
		
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("test2");
		
		User user=new User();
		user.setName("qwer");
		user.setCheck(0);
		user.setIndex(2);
		
		Map map=new HashMap();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
		mv.addObject("user",user);
		mv.addObject("map",map);
		
		mv.addObject("name","zhangsan");
		mv.addObject("b","2");
		mv.addObject("c","qwertyuiop");
		mv.addObject("d",user);
		
		List list2=new ArrayList<>();
		list2.add("zhangsan");
		list2.add("lisi");
		list2.add("wangwu");
		
		Map map2=new HashMap();
		//map2.put(1, value);
		
		return mv;
		
	}
	
}
