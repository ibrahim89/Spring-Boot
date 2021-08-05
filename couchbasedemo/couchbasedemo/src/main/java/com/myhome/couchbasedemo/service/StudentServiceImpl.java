package com.myhome.couchbasedemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhome.couchbasedemo.model.Student;
import com.myhome.couchbasedemo.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired 
	StudentRepo studentRepo;
	
	
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepo.save(student);
	}
	@Override
	public List<Student> getAllStudents() {
		
		return studentRepo.findAll();
	}
	@Override
	public Optional<Student> getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id);
	}
	@Override
	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		  studentRepo.deleteById(id);
		
	}

	
	
	
	
}
