package com.kousoft.food.authservice;

import com.kousoft.food.authexception.AuthorizationException;
import com.kousoft.food.authmodel.LogInModel;

public interface LogInModelService {
	
	public String LogIn(LogInModel login) throws AuthorizationException;
	
	public String LogOut(String key) throws AuthorizationException;

}
