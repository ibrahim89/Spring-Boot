package com.myhome.couchbasedemo.service;

import java.util.List;
import java.util.Optional;

import com.myhome.couchbasedemo.model.Student;

public interface StudentService {

	Student saveStudent(Student student);

	List<Student> getAllStudents();

	Optional<Student> getStudentById(Long id);

	void deleteStudent(Long id);

}
