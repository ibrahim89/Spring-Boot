package com.igenesys.springbootapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igenesys.springbootapp.dao.UserDao;
import com.igenesys.springbootapp.model.BaseReturn;

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
}
