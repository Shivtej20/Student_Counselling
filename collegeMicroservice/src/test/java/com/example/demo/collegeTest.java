package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.entity.collegeData;
import com.example.demo.repo.collegeDataRepo;
import com.example.demo.service.collegeDataServiceImpl;

@SpringBootTest
class collegeTest {


	@Autowired
	private collegeDataServiceImpl collegeService;
	
	@MockBean
	collegeDataRepo collegeRepo;
	
	@BeforeEach
	void setUp() {
		
		Optional<collegeData> collegeData = Optional.of( new collegeData("ABC", "MBA", 1000,"Pune", 90, 90, "abc.com"));
		Mockito.when(collegeRepo.findById(1l)).thenReturn(collegeData);
		
	}

	@Test
	void getCollegeById() {
		
		String collegeName="ABC";
		collegeData college=collegeService.getCollegeById(1l);

		assertEquals(collegeName,college.getUniversityName());
		
	}
	
	
	
	

}
