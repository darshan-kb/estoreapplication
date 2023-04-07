package com.estore.estoreapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estore.estoreapplication.entities.User;
import com.estore.estoreapplication.repository.LoginInterface;
import com.estore.estoreapplication.repository.UserInterface;

@Service
public class UserService {

	@Autowired
	UserInterface UserInterface;
	
	public User addUser(User user) {
		UserInterface.save(user);
		return user;
	}
}
