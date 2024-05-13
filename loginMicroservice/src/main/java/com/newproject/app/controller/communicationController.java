package com.newproject.app.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newproject.app.entity.userDetails;
import com.newproject.app.service.communicationInterface;
import com.newproject.app.service.userService;

@Controller
public class communicationController {
	

	@Autowired
	private userService userService;
	Logger logger= org.slf4j.LoggerFactory.getLogger(communicationController.class);
	
	@GetMapping("/")
	public String index() {
		logger.info("Index Page Will Apperar");
		return "index";
	}

	@GetMapping("/signin")
	public String login() {
		logger.info("Login Page Will Appear");
		return "login";
	}
	
	@GetMapping("/enquiryform")
	public String enquiryform() {

		logger.info("Enquiry Form Will Appear");
		return "enquiryform";
	}
	

	@GetMapping("/register")
	public String register() {
		
		logger.info("Register page will appear");
		return "register";
	}

	@PostMapping("/createUser")
	public String createuser(@ModelAttribute userDetails user, HttpSession session) {

		// System.out.println(user);
	
		boolean f = userService.checkEmail(user.getEmail());

		if (f) {
			session.setAttribute("msg", "Email Id alreday exists");
		}

		else {
			userDetails userDtls = userService.createUser(user);
			if (userDtls != null) {
				session.setAttribute("msg", "Register Sucessfully");
			} else {
				session.setAttribute("msg", "Something wrong on server");
			}
		}

		return "redirect:/register";
	}

		
	

}
