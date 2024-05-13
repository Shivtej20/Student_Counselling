package com.web.firstwebapplication.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.firstwebapplication.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

	List<Todo> findByUser(String user);
	
	
}
