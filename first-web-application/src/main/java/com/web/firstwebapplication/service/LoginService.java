package com.web.firstwebapplication.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	public boolean validateUser(String userid, String password) {
		
		return userid.equalsIgnoreCase("Hari")
				&& password.equalsIgnoreCase("ram");
	
	}

}
