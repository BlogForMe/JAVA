package tech.hyhy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;

import com.google.gson.Gson;

import tech.hyhy.bean.Student;
import tech.hyhy.dao.UserDao;
@WebServlet(name = "DemoServlet", value = "/DemoServlet")
public class DemoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.setHeader("Content-type", "text/html;charset=UTF-8");// 告知浏览器编码格式
//		resp.setCharacterEncoding("UTF-8"); // 一般将字符编码设置成国际编码
		PrintWriter out = resp.getWriter();
		List<Student> sList = new UserDao().queryUser();
        String sb = new Gson().toJson(sList,List.class);
        out.println(sb);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		doGet(req, resp);
	}
	
	
}
