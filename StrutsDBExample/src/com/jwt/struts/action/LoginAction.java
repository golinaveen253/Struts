package com.jwt.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.jwt.struts.dao.LoginDAO;
import com.jwt.struts.form.LoginForm;
import com.jwt.struts.model.User;

public class LoginAction extends Action{
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		LoginForm loginForm = (LoginForm) form;
		String userName = loginForm.getUsername();
		String password = loginForm.getPassword();
		
		LoginDAO dao = new LoginDAO();
		
		User user = dao.validateLogin(userName, password);
		
		if(user != null){
			HttpSession session = request.getSession();
			session.setAttribute("uu", user.getFirstName());
		}else{
			ActionErrors errors = new ActionErrors();
			//errors.GLOBAL_MESSAGE;
			//errors.add("Usr", new ActionMessage("Usrename or password is incorrect"));
			return mapping.findForward("error");
		}
		
		
		
		return mapping.findForward("success");

	}

}
