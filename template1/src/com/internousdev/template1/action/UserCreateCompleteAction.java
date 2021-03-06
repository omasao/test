package com.internousdev.template1.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template1.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginUserPassword;
	private String userName;
	private Map<String,Object>session;


	public String execute()throws SQLException{

	UserCreateCompleteDAO userCreateCompleteDAO=new UserCreateCompleteDAO();

	userCreateCompleteDAO.createUser(session.get("loginUserId").toString(),
			session.get("loginPassword").toString(),
			session.get("userName").toString());

	String result=SUCCESS;

	return result;

	}


	public String getLoginUserId() {
		return loginUserId;
	}


	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}


	public String getLoginUserPassword() {
		return loginUserPassword;
	}


	public void setLoginUserPassword(String loginUserPassword) {
		this.loginUserPassword = loginUserPassword;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
