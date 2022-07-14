package com.bootstudent.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.bootstudent.model.Student;

@Service
public class StudentService {
	public static List<Student> list = new ArrayList<>();
	static {
		list.add(new Student(1233, "Debu"));
		list.add(new Student(1234, "sipu"));
		list.add(new Student(1235, "acharya"));

	}

	public List<Student> getallStudentDetails() {
		return list;
	}

	public List<Student> addStudentDetails(Student st) {
		list.add(st);
		return list;
	}
	
	public List<Student> deletStudentDetail(int Id){
		list=list.stream().filter(student -> student.getId() != Id ).collect(Collectors.toList());
		return list;
	}

}
