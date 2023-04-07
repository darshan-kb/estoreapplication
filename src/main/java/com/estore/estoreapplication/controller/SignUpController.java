package com.estore.estoreapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.estore.estoreapplication.entities.User;
import com.estore.estoreapplication.service.UserService;

@Controller
public class SignUpController {
	@Autowired
	UserService userService;
	@PostMapping(path="/signup",consumes="application/json")
	public String SignUpUser(@RequestBody  User u) {
	BCryptPasswordEncoder encodePassword = new BCryptPasswordEncoder();
	u.setPassword(encodePassword.encode(u.getPassword()));
	userService.addUser(u);
	return "abcd";
	}
}
