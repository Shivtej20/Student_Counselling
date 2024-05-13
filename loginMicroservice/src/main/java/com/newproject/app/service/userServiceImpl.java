package com.newproject.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.newproject.app.entity.userDetails;
import com.newproject.app.repo.userRepository;

@Service
public class userServiceImpl implements userService {
	
	@Autowired
	private userRepository userRepo;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncode;

	@Override
	public userDetails createUser(userDetails user) {
		user.setPassword(passwordEncode.encode(user.getPassword()));
		user.setRole("ROLE_USER");

		return userRepo.save(user);

	}

	@Override
	public boolean checkEmail(String email) {
		return userRepo.existsByEmail(email);

		}

}
