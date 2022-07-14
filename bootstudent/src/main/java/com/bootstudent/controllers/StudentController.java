package com.bootstudent.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootstudent.model.Student;
import com.bootstudent.services.StudentService;


//@RestController
//public class StudentController {
//	@GetMapping("/getDetails")
//	public String getDetails() {
//	return "hey this is my details";
//		
//	}
//	
//}


// @RestController
// public class StudentController{
//	
//	 Student student=new Student();
//	 @GetMapping("/studentDetails")
//	 public Student getDetails() {
//		 student.setId(123);
//		 student.setName("debashis");
//		 return student;
//	 }

@RestController
public class StudentController{
	@Autowired
	private StudentService student;
	
	@GetMapping("/studentDetails")
	public List<Student> getallStudentDetails() {
		return this.student.getallStudentDetails();
		
	}
	
	@PostMapping("/studentDetails")
	public List<Student> addStudentDetails(@RequestBody Student student) {
		this.student.addStudentDetails(student);
		System.out.println("Student detail added successfully:");
		return this.student.getallStudentDetails();
	}
	
	@DeleteMapping("/studentDetails/{Id}")
	public List<Student> deletStudentDetail(@PathVariable("Id") int Id){
		this.student.deletStudentDetail(Id);
		System.out.println("Deleted successfully:");
		return this.student.getallStudentDetails();
		
		
	}
		
	

	 
 }