package tech.hyhy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import tech.hyhy.bean.HomeRecycler;

public class HomeRecyclerDao {

	private PreparedStatement pstm;
	private Connection conn;

	public boolean insertHRecyler() {
		boolean flag = false;
		conn = MariaDB.connSate();
		String sql = "insert into  home_recycler (h_title,h_describe,h_imgurl) value(?,?,?)";
		for (int i = 0; i < 15; ++i) {
			try {
				pstm = conn.prepareStatement(sql);
				pstm.setString(1, "春风十里不如你   " + i);
				pstm.setString(2, "平儿生日致函助攻一家团聚  " + i);
				pstm.setString(3, "/VideoServer/img/recycler_" + i + ".jpg");
				int ff = pstm.executeUpdate();
				System.out.println(ff + "  " + i);
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

		return false;
	}

	/**
	 * 查询数据库，返回数据集合
	 * 
	 * @return
	 */
	public List<HomeRecycler> getHRecycler() {
		List<HomeRecycler> hList = new LinkedList<>();
		conn = MariaDB.connSate();
		HomeRecycler hRecycler = null;
		String sql = "SELECT h_title,h_describe,h_imgurl FROM  home_recycler";
		try {
			pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				String hTitle = rs.getString(1);
				String hDescribe = rs.getString(2);
				String hImgurl = rs.getString(3);
				hRecycler = new HomeRecycler(hTitle, hDescribe, hImgurl);
				hList.add(hRecycler);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hList;
	}

	public static void main(String[] args) {
//		new HomeRecyclerDao().insertHRecyler();
		List<HomeRecycler> ghList = new HomeRecyclerDao().getHRecycler();
		System.out.println(ghList);
		
	}

}
