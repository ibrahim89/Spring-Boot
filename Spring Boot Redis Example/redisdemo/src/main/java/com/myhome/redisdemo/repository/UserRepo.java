package com.myhome.redisdemo.repository;

import java.util.List;

import com.myhome.redisdemo.model.User;

public interface UserRepo {

	boolean  save(User user);
	
	List<User> findAllUsers();
	
	boolean deleteUser(Long id);
}
