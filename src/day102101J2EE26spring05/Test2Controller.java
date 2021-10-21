package day102101J2EE26spring05;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class Test2Controller extends MultiActionController {

	public String add(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("请求的add............");

		return "test1";

	}

	public ModelAndView show(HttpServletRequest request, HttpServletResponse response, User user) {

		System.out.println("请求的show............");
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("test1");
		
		mv.addObject("user", user);

		return mv;

	}

}
