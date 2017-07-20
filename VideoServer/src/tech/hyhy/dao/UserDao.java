package tech.hyhy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;

import tech.hyhy.bean.Student;

public class UserDao {

	/**
	 * 查询用户信息
	 * 
	 * @return
	 */
	public List<Student> queryUser() {
		List<Student> sList = new LinkedList<>();
		Connection conn;

		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			String sql = "select * from student";
			conn = MariaDB.connSate();
			st = conn.prepareStatement(sql);
			rs = st.executeQuery();

			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + String.valueOf(rs.getObject(2)) + rs.getInt("birth") + rs.getString("img"));
				Student stu = new Student(rs.getInt(1), String.valueOf(rs.getObject(2)), rs.getInt(3), rs.getString(4));
				sList.add(stu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();
				rs.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sList;

	}

	public static void main(String[] args) {
		List<Student> sList = new UserDao().queryUser();
		HashMap<String, List<Student>> map = new HashMap<>();
		map.put("data", sList);
		String sb = new Gson().toJson(map, HashMap.class);
		System.out.println(sb);
	}

}
