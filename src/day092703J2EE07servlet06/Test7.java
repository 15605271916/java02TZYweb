package day092703J2EE07servlet06;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Test7 implements Filter {
	
	private String encode="";
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

		encode=filterConfig.getInitParameter("encode");

	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("过滤的是编码");
		
		response.setCharacterEncoding(encode);
		response.setContentType("text/html");
		
		chain.doFilter(request, response);
		
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}




}
