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

import tech.hyhy.bean.HomeRecycler;
import tech.hyhy.bean.Student;
import tech.hyhy.dao.HomeRecyclerDao;
import tech.hyhy.dao.UserDao;

@WebServlet(name = "HomeRecycler", value = "/HomeRecycler")
public class HomeRecyclerServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		List<HomeRecycler> sList = new HomeRecyclerDao().getHRecycler();
		String sb = new Gson().toJson(sList, List.class);
		out.println(sb);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		doGet(req, resp);
	}

}
