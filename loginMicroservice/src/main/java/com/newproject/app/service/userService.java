package com.newproject.app.service;

import com.newproject.app.entity.userDetails;

public interface userService {
	
	public userDetails createUser(userDetails user);

	public boolean checkEmail(String email);


}
