package day101201J2EE17redis04消息队列;

public class Test1 {
	
	public static void main(String[] args) {
		
		Service service=new Service();
		
		long start=System.currentTimeMillis();
		
		for (int i = 0; i <50; i++) {
			
			//①直接处理业务
			//service.doing(i);
			
			//②加入消息队列
			service.addMsg(i);
			
		}
		
		long end=System.currentTimeMillis();
		
		System.out.println("耗时："+(end-start)/1000+"秒");
		
	}

}
