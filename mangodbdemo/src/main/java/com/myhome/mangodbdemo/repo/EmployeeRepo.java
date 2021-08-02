package com.myhome.mangodbdemo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.myhome.mangodbdemo.doc.Employee;

public interface EmployeeRepo extends MongoRepository<Employee, Long>{

}
