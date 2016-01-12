package com.mahmut.jba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahmut.jba.entity.User;
import com.mahmut.jba.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
		
	}

	public Object findOne(int id) {
		// TODO Auto-generated method stub
		return userRepository.findOne(id);
	}
}
