package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.collegeData;
import com.example.demo.repo.collegeDataRepo;

@Service
public class collegeDataServiceImpl implements collegeDataService {

	@Autowired
	collegeDataRepo collegeRepo;
	
	public collegeData addCollege(collegeData collegeData) {
		 return collegeRepo.save(collegeData);
	}

	
		
	public List<collegeData> listofcollege(String locaion, String xiithPercent, String xthPercent){
		
		 List<collegeData> clgList= collegeRepo.findMatchingColleges(locaion, xiithPercent, xthPercent);
		 
		 return clgList;
	}


    @Override
	public collegeData getCollegeById(Long id) {
		
		return collegeRepo.findById(id).get();
	}


	}
