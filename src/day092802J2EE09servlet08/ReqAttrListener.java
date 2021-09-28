package day092802J2EE09servlet08;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class ReqAttrListener implements ServletRequestAttributeListener {

	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		
		System.out.println("增加了一个属性");

		String name=srae.getName();
		
		System.out.println(name);
		
		String value=(String)srae.getValue();
		
		System.out.println(value);
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		
		System.out.println("移除一个属性");

	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		
		System.out.println("替换一个属性");

	}

}
