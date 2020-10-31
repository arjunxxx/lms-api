package com.lms.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.api.enums.Gender;
import com.lms.api.model.Address;
import com.lms.api.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {


	
	@GetMapping("/{studentId}")
	public Student getStudentProfile(@PathVariable String studentId) {		
		Student student = getDummyStudent(studentId);		
		return student;
		
	}

	private Student getDummyStudent(String studentId) {
		
		List <Student> dummyStudentList= new ArrayList<>();
		Address address= new Address("poomangalam", "vadasserikonam PO", "varkala", "victory body workshop", "trivandrum", "kerala", "India", "695143");		
		Student student = new Student("2019CSE01", "Arjun", "Rajeev", 29, Gender.MALE, address);
		dummyStudentList.add(student);
		return dummyStudentList.stream().filter(stud->stud.getStudentId().equals(studentId)).findFirst().orElse(null);
	}
	
}
