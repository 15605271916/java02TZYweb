package day092802J2EE09servlet08;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class ReqListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {

		System.out.println("request对象被销毁");

		

	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {

		System.out.println("request对象被创建");

	}

}
