package servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.map.HashedMap;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DataImple;
import dao.Doughnut;
import daomain.Data;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {

	String resources = "spring/workspring.xml";
	String resources1 = "tools/mybatis-config.xml";
	String[] level = { "良好", "中等", "对敏感人群不健康", "不健康", "非常不健康", "有毒害" };
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Test
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		List<DataImple> list = new ArrayList<DataImple>();
		List<Doughnut> list2 = new ArrayList<Doughnut>();
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(resources);
		InputStream inputStream = Resources.getResourceAsStream(resources1);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = factory.openSession();
		for (int a = 1; a <= 6; a++) {
			DataImple data = applicationContext.getBean("data", DataImple.class);
			Doughnut doughnut = new Doughnut();
			int b = sqlSession.selectOne("mapper.allwork.aqi" + a, "1");
			data.setName(level[a - 1]);
			data.setData(b);
			doughnut.setData(b);
			list.add(a - 1, data);
			list2.add(doughnut);
		}
		System.out.println("doughnut" + list2.toString());
		System.out.println("main" + list.toString());
		request.setAttribute("data", list);
		request.setAttribute("number", list2);
		request.getRequestDispatcher("jsp/tubiao.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
