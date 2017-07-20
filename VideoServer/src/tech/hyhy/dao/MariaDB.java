package tech.hyhy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MariaDB {
	public static final String dbClassName = "org.mariadb.jdbc.Driver";

	public static final String CONNECTION = "jdbc:mariadb://107.173.10.164:3306/person";

	public static Statement connSate() throws ClassNotFoundException, SQLException {
//		System.out.println(dbClassName);
		Class.forName(dbClassName);
		Properties p = new Properties();
		p.put("user", "root");
		p.put("password", "123456");
		Connection c = DriverManager.getConnection(CONNECTION, p);
		Statement st = c.createStatement();
//		c.close();
		return st;
	}
}
