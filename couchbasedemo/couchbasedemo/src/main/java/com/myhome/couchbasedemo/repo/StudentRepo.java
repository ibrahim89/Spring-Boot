package com.myhome.couchbasedemo.repo;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.myhome.couchbasedemo.model.Student;

@Repository
public interface StudentRepo extends CouchbaseRepository<Student, Long> {

}
