package com.internousdev.login.action;


import java.sql.SQLException;

import com.internousdev.login.dao.LoginDAO;
import com.internousdev.login.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport{

	private String name;
	private String password;

	public String execute()throws SQLException{
		String ret=ERROR;
		LoginDTO dto=new LoginDTO();
		LoginDAO dao= new LoginDAO();

dto=dao.select
		if(name.equals(dto.getName())){
			if(name.equals(dto.getName()))
			{
				ret=SUCCESS;
			}
		}
				return ret;

	}












			public String getName(){
			return name;
		}

			public void setName(String name){
				this.name=name;
			}
			public String getPassword(){
				return password;
			}
			public void setPassword(String password){
				this.password=password;

			}
		}


