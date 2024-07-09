package com.ty.springboot_restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ty.springboot_restapi.entity.Student;

public interface Student_Repository extends JpaRepository<Student, Integer> {
	
	
}