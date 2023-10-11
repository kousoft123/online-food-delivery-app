package com.kousoft.food.authservice;

import com.kousoft.food.authexception.AuthorizationException;
import com.kousoft.food.authmodel.SignUpModel;
import com.kousoft.food.authmodel.UserSession;

public interface UserSessionService {
	
	public UserSession getUserSession(String key) throws AuthorizationException;
	
	public Integer getUserSessionId(String key) throws AuthorizationException;
	
	public SignUpModel getSignUpDetails(String key) throws AuthorizationException;
	

}
