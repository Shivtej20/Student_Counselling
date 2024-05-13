package com.newproject.app.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newproject.app.repo.userRepository;

@Controller
@RequestMapping("/user")
public class userController {
	
	@Autowired
	private userRepository userRepo;

	@ModelAttribute
	private void userDetails(Model m, Principal p) {
		String email = p.getName();
		
		com.newproject.app.entity.userDetails user=userRepo.findByEmail(email);


		m.addAttribute("user", user);

	}
	

//	@GetMapping("/")
//	public String home() {
//		return "hi";
//	}


}
