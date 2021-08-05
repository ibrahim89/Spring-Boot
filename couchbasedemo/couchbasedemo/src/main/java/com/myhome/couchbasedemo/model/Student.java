package com.myhome.couchbasedemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
public class Student {
	@Id
	private Long studentId;
	private String name;
	private String address;
	
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student(Long studentId, String name, String address) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.address = address;
	}
	public Student() {
		
	}
	
	
}
