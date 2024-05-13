package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.collegeData;


@Repository
public interface collegeDataRepo extends JpaRepository<collegeData, Long> {
	
	
	@Query(value = "select * from college_data  where college_data.location =:locaion and college_data.xiith_cutoff_percent <=:xiithPercent and college_data.xth_cutoff_percent <=:xthPercent " , nativeQuery = true)
	List<collegeData> findMatchingColleges(String locaion,String xiithPercent, String xthPercent);
	
	

}
