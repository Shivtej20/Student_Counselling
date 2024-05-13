package com.newproject.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.newproject.app.entity.userDetails;
import com.newproject.app.repo.userRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private userRepository userRepo;

	

	@Override
	public UserDetails loadUserByUsername(String username) throws
	UsernameNotFoundException {
		userDetails user = userRepo.findByEmail(username);

		if (user != null) {
			return new customerUserDetails(user);
		}

		throw new UsernameNotFoundException("user not available");
		
	}

}
