package com.jwt.struts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jwt.struts.model.User;

public class LoginDAO extends BaseDao {

	public User validateLogin(String userName, String password) throws Exception {
		Connection con = getDbConnection();
		User user = null;
		try {
			try {
				String sql = "SELECT * FROM USER_DETAILS WHERE USER_NAME = ? AND PASSWORD = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, userName);
				ps.setString(2, password);
				
				ResultSet rs = ps.executeQuery();
				if(rs.next()){
					user = new User();
					user.setEmail(rs.getString("EMAIL"));
					user.setFirstName(rs.getString("FIRST_NAME"));
					user.setPhone(rs.getString("PHONE"));
				}
			} catch (SQLException ex) {
				System.out.println("Prepared statement is not executed!" + ex);
			}finally{
				con.close();	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

}
