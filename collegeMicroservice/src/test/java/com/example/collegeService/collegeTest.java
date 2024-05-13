package com.example.collegeService;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.SpringbootrestApplication;
import com.example.demo.entity.collegeData;
import com.example.demo.repo.collegeDataRepo;
import com.example.demo.service.collegeDataServiceImpl;

@AutoConfigureTestDatabase(replace=Replace.NONE)
@SpringBootTest(classes=SpringbootrestApplication.class)
class collegeTest {

	
	
	@Autowired
	collegeDataServiceImpl collegeService;
	
	@MockBean
	collegeDataRepo collegeRepo;
	
	@BeforeEach
	void setup() {
		
    List<collegeData> allCollegs = new ArrayList<collegeData>();
    
	Optional<collegeData> listOfCollege = Optional.of(new collegeData("Pune University", "MBA", 1000,"Pune", 90, 90, "abc.com"));
	Mockito.when(collegeRepo.findById(1l)).thenReturn(listOfCollege);
	}
	
	
	@Test
	void collegeByiD() {
		
		String universityName="Pune University";
		collegeData college=collegeService.getCollegeById(1l);
		assertEquals(universityName, college.getUniversityName());
		
	}
	
	
	@Test
	void collegeByName() {
		String universityName="Mumbai University";
		collegeData college=collegeService.getCollegeById(1L);
		assertNotEquals(universityName, college.getUniversityName());
		
	}
	
	
	@Test
	void collegeLocation() {
		String location="Mumbai";
		collegeData college=collegeService.getCollegeById(1L);
		assertEquals(location, college.getLocation());
	}

}
