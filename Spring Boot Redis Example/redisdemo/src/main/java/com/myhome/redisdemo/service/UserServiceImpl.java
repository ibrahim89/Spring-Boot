package com.myhome.redisdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhome.redisdemo.model.User;
import com.myhome.redisdemo.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	@Override
	public boolean SaveUser(User user) {
		
		return userRepo.save(user);
	}
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAllUsers();
	}
	@Override
	public boolean deleteUser(Long id) {
		// TODO Auto-generated method stub
		return userRepo.deleteUser(id);
	}

}
