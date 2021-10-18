package day101201J2EE17redis04消息队列;

import redis.clients.jedis.Jedis;

public class Service {
	
	public void doing(int i) {
		
		System.out.println("第"+i+"个用户请求");
		
		System.out.println("正在处理业务..........");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("处理业务结束..........");
		
	}
	
	/**
	 * 加入到消息队列
	 */
	
	public void addMsg(int i) {
		
		Jedis client=new Jedis();
		
		//发布者
		//client.publish("c1", String.valueOf(i));
		
		//生产者
		client.lpush("list", String.valueOf(i));
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


}
