package day092801J2EE08servlet07;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class MyResponse extends HttpServletResponseWrapper {
	
	private CharArrayWriter charArrayWriter=new CharArrayWriter();

	public MyResponse(HttpServletResponse response) {
		
		super(response);
		
	}

	@Override
	public PrintWriter getWriter() throws IOException {

		charArrayWriter.append("zhangbwfsan");
		
		PrintWriter out=new PrintWriter(charArrayWriter);
		
		return out;

	}
	
	public CharArrayWriter getCharArrayWriter() {
		
		return charArrayWriter;
		
	}
	
	

}
