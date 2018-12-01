package com.cg.prac.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.cg.prac.entity.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public User addUser(User user) {
		mongoTemplate.insert(user);
		return user;
	}

	@Override
	public User getUserByID(String userId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));		
		return mongoTemplate.findOne(query, User.class);
	}

	@Override
	public List<User> getAllUsers() {
		
		return mongoTemplate.findAll(User.class);
	}

	@Override
	public User updateUser(User user) {
		mongoTemplate.save(user);
		return user;
	}

	@Override
	public User deleteUser(String userId) {
		User user = getUserByID(userId);
		if(user!=null){
			mongoTemplate.remove(user);
		}
		return user;
	}

}
