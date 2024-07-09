package com.ty.springboot_restapi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.springboot_restapi.dao.Studentdao;
import com.ty.springboot_restapi.entity.Student;


@RestController
public class Studentcontroller {
	@Autowired
	Studentdao dao;
	
	@PostMapping("/save")
	
	public Student saveStudent(@RequestBody Student student)
	{
		return dao.saveStudent(student);
		
	}
	@GetMapping("/get/{id}")
	public Student getById(@PathVariable int id)
	{
		return dao.getByID(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		return dao.deleteStudent(id);
	}
	@GetMapping("/getAll")
	public List<Student> getStudents()
	{
		
		return dao.getStudents();
	}
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable int id)
	{
		
		return dao.updateStudent(id);
	}
}
