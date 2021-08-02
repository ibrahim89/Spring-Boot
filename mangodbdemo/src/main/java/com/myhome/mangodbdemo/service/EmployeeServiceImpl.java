package com.myhome.mangodbdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhome.mangodbdemo.doc.Employee;
import com.myhome.mangodbdemo.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepo employeeRepo;
	
	@Override
	public Long saveEmployee(Employee employee) {
		return employeeRepo.save(employee).getEmpId();
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employeeRepo.findAll();
	}

	
	
}
