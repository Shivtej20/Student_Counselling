package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.collegeData;
import com.example.demo.service.collegeDataServiceImpl;

@RestController
public class collegeController {
	
	
	@Autowired
	collegeDataServiceImpl collegeService;
	
	
	@PostMapping("/addCollege")
	public String addStudent(@RequestBody collegeData collegeData) {
		collegeService.addCollege(collegeData);
		return "College Data Inserted Sucessfully";	
	
	}
	
	

}
