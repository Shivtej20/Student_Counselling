package com.newproject.app.service;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.newproject.app.dto.studentDTO;
import com.newproject.app.entity.collegeData;

@FeignClient(value="CollegeMicroservice", url="http://localhost:8081") 
public interface communicationInterface {

	@GetMapping("/enquiry")
	public String enquiryform() ;
	
	@GetMapping("/myList")
	public String getlist();
	
	
	@GetMapping("/hi")
	public String getHipage();
}
