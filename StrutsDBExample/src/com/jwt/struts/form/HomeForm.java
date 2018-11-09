package com.jwt.struts.form;

import org.apache.struts.action.ActionForm;

public class HomeForm extends ActionForm{

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}
