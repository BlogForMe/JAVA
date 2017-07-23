package tech.hyhy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MariaDB {
	public static final String dbClassName = "org.mariadb.jdbc.Driver";

	public static final String CONNECTION = "jdbc:mariadb://107.173.10.164:3306/vandroid";

	public static Connection connSate() {
		Connection c = null;
		try {
			Class.forName(dbClassName);
			Properties p = new Properties();
			p.put("user", "user_name");
			p.put("password", "123456");
			c = DriverManager.getConnection(CONNECTION, p);
			// Statement st = c.createStatement();
			// c.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
}
