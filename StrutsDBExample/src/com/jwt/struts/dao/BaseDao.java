package com.jwt.struts.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDao {
	
	public static Connection getDbConnection() throws Exception {
		try {
			System.out.println("Initializing JDBC Connection");
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ravi_db", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
