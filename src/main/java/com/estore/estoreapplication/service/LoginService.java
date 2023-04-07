package com.estore.estoreapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.estore.estoreapplication.entities.User;
import com.estore.estoreapplication.repository.LoginInterface;

@Service
public class LoginService {
	@Autowired
	LoginInterface LoginInterface;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	public boolean LoginValidation(String Email,String password) {
		User user = LoginInterface.findByEmail(Email);
		
		return passwordEncoder.matches(password, user.getPassword());
	}
	public boolean LoginValidation(String Email) {
		User user = LoginInterface.findByEmail(Email);
		System.out.println(user.getEmail());
		if(user.getEmail()!=null) {
			return true;
		}
		return false;
	}
}
