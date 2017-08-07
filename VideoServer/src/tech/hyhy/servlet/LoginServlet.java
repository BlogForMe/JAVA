package tech.hyhy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("un");
		String userPass = req.getParameter("pwd");
		PrintWriter out = resp.getWriter();
		if ("zh".equals(userName) && "123456".equals(userPass)) {
			resp.getWriter().write(
					 "{\"code\":0, \"message\":\"获取用户成功！\", \"data\":[{\"name\":\"张三\",\"age\":23},{\"name\":\"李四\", \"age\":28}]}");
			System.out.println(userName + "密码" + userPass);
		}
		else
			out.write("登录失败");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		doGet(req, resp);
	}

}
