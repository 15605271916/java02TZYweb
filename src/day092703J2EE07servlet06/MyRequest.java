package day092703J2EE07servlet06;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.http.HttpServletRequest;

public class MyRequest extends ServletRequestWrapper {
	
	private HttpServletRequest req;

	public MyRequest(HttpServletRequest request) {
		
		super(request);
		
		this.req=request;
		
	}

	@Override
	public String getParameter(String name) {

		if(name.equals("content")) {
			
			String value=req.getParameter("name");
			
			if(value.contains("bwf")) {
				
				return "***";
				
			}
			
		}

		return super.getParameter(name);
	}

}
