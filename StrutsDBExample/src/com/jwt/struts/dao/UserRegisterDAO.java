package com.jwt.struts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRegisterDAO extends BaseDao{
	public void insertData(String firstName, String lastName, String userName,
		String password, String email, String phone) throws Exception {
		Connection con = getDbConnection();
		try {
			try {
				String sql = "INSERT INTO USER_DETAILS VALUES (?,?,?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, firstName);
				ps.setString(2, lastName);
				ps.setString(3, userName);
				ps.setString(4, password);
				ps.setString(5, email);
				ps.setString(6, phone);
				int value = ps.executeUpdate();
				System.out.println("1 row affected" + value);
			} catch (SQLException ex) {
				System.out.println("Prepared statement is not executed!" + ex);
			}finally{
				con.close();	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
