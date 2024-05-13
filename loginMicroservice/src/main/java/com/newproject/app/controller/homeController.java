package com.newproject.app.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.newproject.app.dto.collegeDTO;
import com.newproject.app.dto.studentDTO;
import com.newproject.app.entity.collegeData;

import com.newproject.app.entity.userDetails;
//import com.newproject.app.repo.collegeDataRepo;
//import com.newproject.app.service.collegeDataService;
import com.newproject.app.service.communicationInterface;
import com.newproject.app.service.userService;

import net.bytebuddy.asm.Advice.Enter;

@RestController
@RequestMapping("/check")
public class homeController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	private userService userService;
	

	
    Logger logger= org.slf4j.LoggerFactory.getLogger(homeController.class);

	
	
	@Autowired
	communicationInterface communication;
	
	
	@GetMapping("/getEnquiryform")
	public String getEnq() {
		logger.info("inside postmapping of /getEnquiryform");

		return communication.enquiryform();
	}
	
	@GetMapping("/myList")
	public String getMyListPage() {
		logger.info("inside getmapping of mylist");
		return communication.getlist();
	}
	
	@ModelAttribute("student")
    public studentDTO studentDTO() {

        return new studentDTO();
    }
	
		
	@GetMapping("/hellopage")
	public String helloPage() {
		return communication.getHipage();
	}
		
	

}
