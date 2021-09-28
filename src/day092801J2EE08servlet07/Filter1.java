package day092801J2EE08servlet07;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class Filter1 implements Filter {
	
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("开始过滤...........");
		
		MyResponse myResp=new MyResponse((HttpServletResponse)response);
		
		chain.doFilter(request, myResp);
		
		String data=myResp.getCharArrayWriter().toString();
		
		data=data.replace("bwf", "***");
		
		PrintWriter out=response.getWriter();
		
		out.print(data);
		
		out.flush();
		
		out.close();
		
		System.out.println("过滤结束...........");

	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
