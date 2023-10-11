package com.kousoft.food.authservice;

import com.kousoft.food.authexception.AuthorizationException;
import com.kousoft.food.authmodel.SignUpModel;

public interface SignUpModelService {
	
	public SignUpModel newSignUp(SignUpModel signUp) throws AuthorizationException;;
	
	public SignUpModel updateSignUp(SignUpModel signUp, String key) throws AuthorizationException;;

}
