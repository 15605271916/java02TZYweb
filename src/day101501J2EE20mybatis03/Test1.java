package day101501J2EE20mybatis03;

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

public class Test1 {

	public static void main(String[] args) throws Exception {
		
		SqlSession session=null;
		SqlSessionFactory ssf=null;
		SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
		
		InputStream in=Resources.getResourceAsStream("mybatis.cfg03.xml");
		ssf=ssfb.build(in);
		
		session=ssf.openSession();
		
		List<Category> list1=session.selectList("day101501J2EE20mybatis03.Category.find1","c");
		
		System.out.println(list1);
		
		for (Category c : list1) {
			System.out.println(c.getName());
		}
		
	/*	Map map=new HashMap();
		
		map.put("id", 5);
		map.put("name", "c");
		
		list1=session.selectList("day101501J2EE20mybatis03.Category.find2", map);
		
		System.out.println(list1);*/
		
		
		
		session.commit();
		session.close();
		
		
		
		
	}
	
}
