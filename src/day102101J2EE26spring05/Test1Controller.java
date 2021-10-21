package day102101J2EE26spring05;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class Test1Controller implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
	
		System.out.println("test1请求............");
		
		String name=arg0.getParameter("name");
		
		User user=new User();
		
		user.setName(name);
		
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("test1");
		
		mv.addObject("user",user);
		
		return mv;
		
	}

}
