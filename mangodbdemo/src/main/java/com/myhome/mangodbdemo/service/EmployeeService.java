package com.myhome.mangodbdemo.service;

import java.util.List;

import com.myhome.mangodbdemo.doc.Employee;

public interface EmployeeService {

	Long saveEmployee(Employee employee);

	List<Employee> findAllEmployees();
	
}
