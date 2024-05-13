package com.example.repoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.SpringbootrestApplication;
import com.example.demo.entity.collegeData;
import com.example.demo.repo.collegeDataRepo;

@SpringBootTest(classes = SpringbootrestApplication.class)
@AutoConfigureTestDatabase(replace = Replace.NONE)
class RepositoryTest {

	@Autowired
	private collegeDataRepo repo;
	
	
	
	
	
	@Test
	void testGetCollegeByNameRepoTest() {
		long id=1;
		String collegeName="Mumbai University";
		Optional<collegeData> college=repo.findById(id);
		assertEquals(collegeName, college.get().getUniversityName());
	}
     

	
	@Test
	void testGetCollegeLocationBYIdRepoTest() {

		long id = 1;
		String collegeLocation = "Mumbai";
		Optional<collegeData> college = repo.findById(id);
		assertEquals(collegeLocation, college.get().getLocation());
	}
}