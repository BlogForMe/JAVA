package tech.hyhy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "getUser", value = "/getUser")
public class GetUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		System.out.println("token:" + req.getHeader("token"));

		System.out.println("id:" + req.getParameter("id"));
		System.out.println("name:" + req.getParameter("name"));

		// if (req.getHeader("token").equals("abc")) {
		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

//		resp.getWriter().write("{\"code\":0, \"message\":\"获取用户成功！\", \"data\":{\"name\":\"张三\", \"age\":23}}");
		resp.getWriter().write(
		 "{\"code\":0, \"message\":\"获取用户成功！\", \"data\":[{\"name\":\"张三\",\"age\":23},{\"name\":\"李四\", \"age\":28}]}");
		// } else {
		// resp.getWriter()
		// .write("{\"code\":1, \"message\":\"获取用户失败！\", \"data\":\"\"}");
		// }
	}
	
	

}