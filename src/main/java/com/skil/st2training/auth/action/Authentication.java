package com.skil.st2training.auth.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.dispatcher.Parameter.Request;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.skil.st2training.auth.model.User;

public class Authentication extends ActionSupport implements ModelDriven<User>, SessionAware{

	private User user = new User();
	private Map<String, Object> sessionMap;

	public String verifyUser() {
		if(user.getUserId().equals("gopal") &&
				user.getPassword().equals("password")) {
			sessionMap.put("authorized", "Yes");
			//System.out.println((String)sessionMap.get("authorized"));
			return SUCCESS;
		}
		return LOGIN;
	}
	
	
	@Override
	public User getModel() {
		return user;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}
	
	

}
