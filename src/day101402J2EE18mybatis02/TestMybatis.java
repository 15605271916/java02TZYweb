package day101402J2EE18mybatis02;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
 
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import day101402J2EE18mybatis02.Category;
 
public class TestMybatis {
 
    public static void main(String[] args) throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
 
        Category c = new Category();
        c.setName("新增加的Category");
        session.insert("addCategory",c);
        
        Category c1 = new Category();
        c1.setId(6);
        session.delete("deleteCategory",c1);
        
        c1.setName("修改了的Category名称");
        session.update("updateCategory",c1);
         
        Category c11= session.selectOne("getCategory",2);
        System.out.println(c11.getName());
        
        List<Category> cs = session.selectList("listCategory");
        for (Category c111 : cs) {
            System.out.println(c111.getName());
        }
       
         
        session.commit();
        session.close();
 
    }
 
    private static void listAll(SqlSession session) {
        List<Category> cs = session.selectList("listCategory");
        for (Category c : cs) {
            System.out.println(c.getName());
        }
    }
}