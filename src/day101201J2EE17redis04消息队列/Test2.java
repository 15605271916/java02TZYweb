package day101201J2EE17redis04消息队列;

import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

public class Test2 extends JedisPubSub{
	
	Service service=new Service();
	
	public static void main(String[] args) {
		
		Service service2=new Service();

		//开始在 后台独立处理
		Jedis client=new Jedis();
		
		//发布者
		//Test2 test=new Test2();
		//System.out.println("正在接收消息1..........");
		//client.subscribe(test, "c1");
		
		//生产者
		System.out.println("正在接收消息2");
		while (true){
			List num=client.brpop(0, "list");
			service2.doing(Integer.parseInt((String)num.get(1)));
		}
		
	}

	@Override
	public void onMessage(String channel, String message) {

		System.out.println("渠道"+channel+"消息发布了");
		
		service.doing(Integer.parseInt(message));
		
	}
	
}
