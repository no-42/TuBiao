package test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class DataTest {
	String resource = "tools/mybatis-config.xml";

	@Test
	public void main() throws Exception {
//		InputStream inputStream= Resources.getResourceAsStream(resource);
//		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//		SqlSession sqlSession = factory.openSession();
//		int list = sqlSession.selectOne("mapper.allwork.aqi3", "1");
		int[] number=new int[6];
		System.out.println(number.toString());

	}
}
