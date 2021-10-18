package day101401J2EE18mybatis01;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test1 {

	public static void main(String[] args) throws  Exception {


		
		SqlSession session=null;
		SqlSessionFactory ssf=null;
		SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
		InputStream in=Resources.getResourceAsStream("mybatis.cfg.xml");
		ssf=ssfb.build(in);
		
		session=ssf.openSession();
		
		System.out.println(session);
		
		//session.insert("save2");
		
		User user=new User();
		user.setId(7);
		user.setName("lisi");
	
		
		//session.insert("save",user);
		
		//session.insert("save2",user);
		
		
		//session.insert("day13.User.save1",user);
		
		//session.delete("del1",user);
		
		//session.delete("del1",3);
		
		//Map map=new HashMap();
	//	map.put("id", 6);
	//	map.put("name", "51testing");
		
		//session.delete("del1",map);
		
		//user.setName("wangwu");
		//session.update("up1", user);
		//session.update("up1",map);
		
		
		//System.out.println("查询");
		
		
	/*	User u= session.selectOne("find1", 7);
		System.out.println(u);
		System.out.println(u.getName());*/
		
		
		List<User> users= session.selectList("find2");
		
		System.out.println(users.size());
		
		for (User u2 : users) {
			System.out.println(u2.getId()+"---"+u2.getName());
		}
		
		
		
		//System.out.println("==============");
		
		//User u2=session.selectOne("find3");
		
		//System.out.println(u2.getId());
		//System.out.println(u2.getName());
		
		
		session.commit();
		
		
	}

}
