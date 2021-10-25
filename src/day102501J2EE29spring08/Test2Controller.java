package day102501J2EE29spring08;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
@RequestMapping("b/")
public class Test2Controller {
	
	
	@RequestMapping("test1")
	public String test1(String name,String img) {
		
		System.out.println("==========");
		System.out.println(name);
		System.out.println(img);
		return "test1";
		
	}
	
	@RequestMapping("test2")
	public String test1(HttpServletRequest request) {
		
		System.out.println("==========");
		MultipartResolver mr=(MultipartResolver) new MultiActionController();
		MultipartHttpServletRequest mrequest=mr.resolveMultipart(request);
		
		String name=mrequest.getParameter("name");
		System.out.println(name);
		
		MultipartFile mf=mrequest.getFile("img");
		
		String pathName="C:\\myfiles\\a";
		File file=new File(pathName);
		try {
			mf.transferTo(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "test1";
		
	}

	
}
