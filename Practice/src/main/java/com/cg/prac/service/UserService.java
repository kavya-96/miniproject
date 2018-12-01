package com.cg.prac.service;

import java.util.List;

import com.cg.prac.entity.User;

public interface UserService {

	public User addUser(User user);
	public User getUserByID(String userId);
	public List<User> getAllUsers();
	public User updateUser(User user);
	public User deleteUser(String userId);
}
