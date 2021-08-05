package com.myhome.couchbasedemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myhome.couchbasedemo.model.Student;
import com.myhome.couchbasedemo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/saveStudent")
	public ResponseEntity<String> saveStudent(@RequestBody Student student){
		Long id = studentService.saveStudent(student).getStudentId();
		return new ResponseEntity<String>("student added with id:"+id, HttpStatus.OK);
	}
	
	@GetMapping("/studentlist")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> studentList = studentService.getAllStudents();
		return new ResponseEntity<>(studentList, HttpStatus.OK);
	}
	
	@GetMapping("student/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id){
		Optional<Student> student = studentService.getStudentById(id);
		return new ResponseEntity<Student>(student.get(), HttpStatus.OK);
	}
	
	@DeleteMapping("deleteStudent/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") Long id){
		 studentService.deleteStudent(id);
		 return new ResponseEntity<String>("student deleted successfully with id:"+id, HttpStatus.OK);
	}
}
