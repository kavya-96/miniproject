package com.cg.prac.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.prac.entity.User;
import com.cg.prac.service.UserService;

@RestController
@RequestMapping(value="/kavya")
public class ClientController {
	private final Logger logger =LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/create",method = RequestMethod.POST)
	public User addUser(@Valid@RequestBody User user){
		logger.info("saving user data...");
		return userService.addUser(user);
	}
	@RequestMapping(value="/readById{userId}",method=RequestMethod.GET)
	public User getUserByID(@PathVariable String userId){
		logger.info("Getting user with id: ",userId);
		User user = userService.getUserByID(userId);
		/*if(user==null){
			
		}*/
		return user;
	}
	
	@RequestMapping(value="/readAll",method=RequestMethod.GET)
	public List<User> getAllUsers(){
		logger.info("Getting all users");
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="/update/{userId}",method=RequestMethod.PUT)
	public User updateUser(@Valid@RequestBody User user){
		User user1 = userService.updateUser(user);
		return user1;
	}
	
	@RequestMapping(value="/delete/{userId}",method=RequestMethod.DELETE)
	public User deleteUser(@PathVariable String userId){
		logger.info("Deleting user..");
		return userService.deleteUser(userId);
	}
	
	
			

}
