package com.igenesys.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igenesys.springbootapp.dao.UserDao;
import com.igenesys.springbootapp.model.BaseReturn;
import com.igenesys.springbootapp.model.User;

@RestController
public class HomeController {
	@Autowired
	UserDao userDao;

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot Tutorials";
	}
	@GetMapping
	@RequestMapping("/getallusers")
	
	public BaseReturn getAllUsers() {
		return userDao.getAllUser();
	}
	// Save User
	@PostMapping
	@RequestMapping("/user")
	public BaseReturn saveUser(@RequestBody User getParamters){
		return userDao.saveUSer(getParamters);
	}
	// Update User
	@PutMapping
	@RequestMapping("/updateuser")
	public BaseReturn updateUser(@RequestBody User getParamters){
		return userDao.updateUser(getParamters);
	}
	
}
