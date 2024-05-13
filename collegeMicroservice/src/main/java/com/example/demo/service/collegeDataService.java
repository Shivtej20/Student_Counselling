package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.collegeData;
import com.example.demo.repo.collegeDataRepo;

@Service
public interface collegeDataService {
	

	
	public collegeData addCollege(collegeData collegeData);
	
	public List<collegeData> listofcollege(String locaion, String xiithPercent, String xthPercent);

	public collegeData getCollegeById(Long id);

	
	
}
