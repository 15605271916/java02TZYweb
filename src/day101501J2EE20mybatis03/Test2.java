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

public class Test2 {

	public static void main(String[] args) throws Exception {

		SqlSession session = null;
		SqlSessionFactory ssf = null;
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();

		InputStream in = Resources.getResourceAsStream("mybatis.cfg03.xml");
		ssf = ssfb.build(in);

		session = ssf.openSession();

		/*
		 * Category c1=session.selectOne("day101501J2EE20mybatis03.Category.find4",1);
		 * System.out.println(c1); System.out.println(c1.getName());
		 */

		List<Category> cs = session.selectList("day101501J2EE20mybatis03.Category.find4");
		for (Category c : cs) {
			System.out.println(c);
			List<Product> ps = c.getProductList();
			for (Product p : ps) {
				System.out.println("\t" + p);
			}
		}

		session.commit();
		session.close();

	}

}
