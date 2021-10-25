package day092703J2EE07servlet06;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Test6 implements Filter{
	
	public Test6() {

		System.out.println("test6被实例化了");
		
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		System.out.println("初始化过滤器1");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("开始过滤");
		
		chain.doFilter(request, response);
		
		System.out.println("过滤结束");
		
	}
	
	@Override
	public void destroy() {

		System.out.println("过滤器1销毁");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
