package com.myhome.mangodbdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myhome.mangodbdemo.doc.Employee;
import com.myhome.mangodbdemo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee){
		Long employeeId = employeeService.saveEmployee(employee);
		return new ResponseEntity<String>("Employee Successfully Added with Id:"+employeeId, HttpStatus.OK);
	}
	
	@GetMapping("employeeList")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> employeeList = employeeService.findAllEmployees();
		return new ResponseEntity<List<Employee>>(employeeList, HttpStatus.OK);
	}
	
	
	
}
