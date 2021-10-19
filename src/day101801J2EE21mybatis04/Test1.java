package day101801J2EE21mybatis04;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.naming.resources.Resource;

import day100801J2EE13jsp04.User;

public class Test1 {

	public static void main(String[] args) throws Exception {
		
		SqlSession session=null;
		SqlSessionFactory ssf=null;
		SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
		
		InputStream in=Resources.getResourceAsStream("mybatis.cfg04.xml");
		ssf=ssfb.build(in);
		
		session=ssf.openSession();
		
		List<User> users=session.selectList("find1","zhangsan");
		
		System.out.println(users.size());
		
		System.out.println("==========");
		
		Map map2=new HashMap();
		
		map2.put("name", "zhangsan2");
		map2.put("sex", "0");
		map2.put("id", "4");
		
		users=session.selectList("find4",map2);
		System.out.println(users.size());
		
		session.update("up",map2);
		System.out.println(users.size());
		
		Map map4=new HashMap();
		
		map2.put("name", "zhangsan2");
		map2.put("sex", "0");
		map2.put("id", "4");
		
		users=session.selectList("find6",map4);
		System.out.println(users.size());
		
		
		
		session.commit();
		session.close();
		
	}	
	
}
