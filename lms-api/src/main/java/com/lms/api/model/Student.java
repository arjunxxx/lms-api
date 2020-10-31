package com.lms.api.model;

import com.lms.api.enums.Gender;

import lombok.Data;

@Data
public class Student {
	
	
	public Student(String studentId, String firstName, String lastName, Integer age, Gender gender, Address address) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	private String studentId;
	private String firstName;
	private String lastName;
	private Integer age;
	private Gender gender;
	private Address address;
	
	
}
