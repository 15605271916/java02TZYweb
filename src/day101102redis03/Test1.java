package day101102redis03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class Test1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Jedis client = new Jedis();

		System.out.println(client.ping());

		// client.sadd("set", "zhangsan","lisi","wangwu");

		long num = client.scard("set");

		System.out.println(num);

		for (int i = 0; i < 10; i++) {

			System.out.println(client.srandmember("set"));

		}

		System.out.println("==========");

		client.sadd("set", "zhangsan2");

		num = client.scard("set");

		System.out.println(num);

		System.out.println("==========");

		//client.zadd("set2", 5, "zhangsan");

		//client.zadd("set2", 6, "lisi2");

		//client.zadd("set2", 7, "wangwu2");

		Map map = new HashMap();

		map.put("lisi", Double.parseDouble("6"));

		map.put("wangwu", Double.parseDouble("7"));

		client.zadd("set2", map);

		System.out.println(client.zrange("set2", 0, -1));

		Set<String> set = client.zrange("set2", 0, -1);

		for (String v : set) {

			System.out.println(v);

		}

		User u1 = new User();
		u1.setId(1);
		u1.setName("zhangsan");

		// client.sadd("u1", u1.toString());

		// client.set("a".getBytes(),"A".getBytes());

		ByteArrayOutputStream bout = new ByteArrayOutputStream();

		ObjectOutputStream ow = new ObjectOutputStream(bout);

		ow.writeObject(u1);

		System.out.println(bout.toByteArray());

		// client.set("user1".getBytes(),bout.toByteArray());

		// 反序列化
		byte[] b2 = client.get("user1".getBytes());

		System.out.println(b2);

		ByteArrayInputStream bin = new ByteArrayInputStream(b2);

		ObjectInputStream oin = new ObjectInputStream(bin);

		User u2 = (User) oin.readObject();

		System.out.println(u2);

		System.out.println(u2.getId());

		System.out.println(u2.getName());
		
		System.out.println("==========");

	}

}
