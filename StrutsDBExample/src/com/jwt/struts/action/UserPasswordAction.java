package com.jwt.struts.action;

import javax.imageio.spi.RegisterableService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.jwt.struts.dao.BaseDao;
import com.jwt.struts.form.UserRegisterForm;

public class UserPasswordAction extends Action {

	BaseDao baseDao;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		HttpSession ses = request.getSession(true);
		UserRegisterForm usp= (UserRegisterForm) form;
		UserRegisterForm urf= new UserRegisterForm();
		urf.get
		
		String userName=usp.getUserName();
		String passWord=usp.getPassword();
	
		if(urf.getUserName() != usp.getUserName() || urf.getPassword() != usp.getPassword()){
			
			
			return "errorloginin";
		}
		
		
		
		
		return mapping.findForward("success");
	
}
}
