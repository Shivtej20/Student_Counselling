package com.newproject.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.newproject.app.entity.userDetails;

@Repository
public interface userRepository extends JpaRepository<userDetails, Integer> {
	

	public boolean existsByEmail(String email);

	public userDetails findByEmail(String email);


}
