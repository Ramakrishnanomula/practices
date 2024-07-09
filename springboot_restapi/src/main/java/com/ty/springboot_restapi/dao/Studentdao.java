package com.ty.springboot_restapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.springboot_restapi.entity.Student;
import com.ty.springboot_restapi.repository.Student_Repository;

@Repository
public class Studentdao {
	
	@Autowired
Student_Repository repo;
	
	 
	public Student saveStudent(Student student) {
		
		return repo.save(student);
		
	}
	public Student getByID(int id) {
		
		return repo.findById(id).get();
		
	}
	public String deleteStudent(int id) {
	
	 repo.deleteById(id);
	 return "deleted";
	
}
	public Student updateStudent(int id) {
	
	 Student student =repo.findById(id).get();
	 student.setName(null);
	 student.setLoc(null);
	 repo.save(student);
	 return student;
	 
}

		public List<Student> getStudents(){
		
			List<Student>student=repo.findAll();
		return student;
		
	}

}
