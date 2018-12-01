package com.cg.prac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.prac.dao.UserDao;
import com.cg.prac.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	@Override
	public User addUser(User user) {
		
		return userDao.addUser(user);
	}

	@Override
	public User getUserByID(String userId) {
		
		return userDao.getUserByID(userId);
	}

	@Override
	public List<User> getAllUsers() {
		
		return userDao.getAllUsers();
	}

	@Override
	public User updateUser(User user) {
	
		return userDao.updateUser(user);
	}

	@Override
	public User deleteUser(String userId) {
		
		return userDao.deleteUser(userId);
	}

	
	
}
