package com.example.collegeService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.SpringbootrestApplication;
import com.example.demo.entity.collegeData;
import com.example.demo.repo.collegeDataRepo;
import com.example.demo.service.collegeDataService;

@AutoConfigureTestDatabase(replace=Replace.NONE)
@SpringBootTest(classes=SpringbootrestApplication.class)
class CollegeServiceTest {

	@Autowired
    private collegeDataService service;

 

    @Mock
    private collegeDataRepo repo;

    
    @Test
    public void testCollegeLocationByName() {
        Long id=1L;
        String collegeLocation="Mumbai";
        collegeData college=service.getCollegeById(id);
        assertEquals(collegeLocation, college.getLocation());
    }

     @Test
        public void testCreateCollege() {
            collegeData college = new collegeData("Mumbai University", "BPharm", 1000, "Mumbai", 87, 89, "https://mu.ac.in/");
            when(repo.save(college)).thenReturn(college);

 

            collegeData createdCollege = service.addCollege(college);
            assertEquals(college, createdCollege);
        }

     @Test
        public void testListOfCollege() {
            when(repo.findMatchingColleges("Mumbai", "87", "89")).thenReturn(
                Arrays.asList(new collegeData("Mumbai University", "BPharm", 1000, "Mumbai", 89, 87, "https://mu.ac.in/")));

 

            List<collegeData> colleges = service.listofcollege("Mumbai", "90", "90");
           // assertEquals(1, colleges.size());
            assertEquals("Mumbai University", colleges.get(0).getUniversityName());

        }
}
