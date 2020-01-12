package com.skil.st2training.auth.intercepter;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class AuthorizationInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		System.out.println("Inside init interceptors");
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("Inside interceptors");
		Map<String, Object> sessionAttributes = invocation.getInvocationContext().getSession();
		System.out.println("session value" + (String)sessionAttributes.get("authorized"));
		
		if(sessionAttributes == null || sessionAttributes.get("authorized") == null) {
			return "login";
			
		}else if(((String)sessionAttributes.get("authorized")).equals("Yes")) {
			return invocation.invoke();
		}
		
		return null;
	}

	
}
