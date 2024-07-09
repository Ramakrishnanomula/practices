package com.ty.springboot_restapi.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.ty.springboot_restapi.entity.Student;
import com.ty.springboot_restapi.exception.IDNotfoundexception;
import com.ty.springboot_restapi.exception.MandatoryFieldMissingException;
import com.ty.springboot_restapi.repository.Student_Repository;

@Repository
public class Studentdao1<StudentRepository> {
	@Autowired
	Student_Repository repo;
	
	public <repo> ResponseEntity<Student> saveStudent(Student student)
	{
		if(student.getName().isEmpty())
		{
			throw new MandatoryFieldMissingException("Mandatory Field name is missing");
		}
		Student newStudent=repo.save(student);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(newStudent);
	}
	public Student getById(int id)
    {
    	
    	Optional<Student>student=repo.findById(id);
    	if(student.isPresent())
    	{
    		return student.get();
    	}
    	else
    	{
    		throw new IDNotfoundexception("Student id is not present in the system");
    	}

    }
}
