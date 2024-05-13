package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.studentDTO;
import com.example.demo.entity.collegeData;
import com.example.demo.repo.collegeDataRepo;
import com.example.demo.service.collegeDataServiceImpl;

@Controller
public class collegeDataCheckController {


	@Autowired
	collegeDataRepo collegeDataRepo;
	
	@Autowired
	com.example.demo.service.collegeDataService collegeService;
	
    Logger logger= org.slf4j.LoggerFactory.getLogger(collegeDataCheckController.class);
	

	
	@GetMapping("/enquiry")
	public String enquiryform() {
		logger.info("Enquiry Form Will Appear");
		return "enquiryform";
	}
	
	@GetMapping("/myList")
	public String myCollegeList() {
		logger.info("My List page will appear");
		return "myList";
	}
	
	
	@GetMapping("/hi")
	public String getHipageo() {
		return "hi";
	}

	
	
	@PostMapping("/myList")
	public String filterCollegeData( @ModelAttribute("student") studentDTO studentDTO , Model model) {
		
		System.out.println("inside filterCollegeData");
		logger.info("satyam"+studentDTO.getLocaion()+ studentDTO.getXiithPercent()+ studentDTO.getXthPercent());
		List<collegeData> collegeData=collegeService.listofcollege(studentDTO.getLocaion(), studentDTO.getXiithPercent(), studentDTO.getXthPercent());
		
		//List<collegeData> collegeData=collegeService.listofcollege("USA", 90.12f, 85.5f);
		if(collegeData.isEmpty()) {
			collegeData = null;
			return "noCollege";
		}
		
		
		
		System.out.println(collegeData);
		logger.info("Colleges are",collegeData);

		model.addAttribute("collegeData",collegeData);
		model.addAttribute("studentDTO", studentDTO);
	    return "myList";
	}
	
	
	@GetMapping("/helloworld")
	public String getHi() {
		return "Helloworld";
	}
	
}
