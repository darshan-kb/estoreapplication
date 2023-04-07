package com.estore.estoreapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estore.estoreapplication.entities.User;
import com.estore.estoreapplication.service.LoginService;
import com.estore.estoreapplication.service.UserService;

import ch.qos.logback.core.model.Model;

@Controller
public class LoginController {
	@Autowired
	UserService UserService;
	@Autowired
	LoginService LoginService;
	@RequestMapping("/login")
	public String Login() {
		return "login.html";
	}
	@PostMapping(path="/login",consumes="application/json")
	public String LoginValidation(@RequestBody  User u) {
		
		//System.out.println(u.getName());
		
		  boolean loginsuccessfull = LoginService.LoginValidation(u.getEmail(),u.getPassword());
		  if(loginsuccessfull==true) { 
			  System.out.println("10");
			  return "login.html";
		  } 
		  
		  return "home.html";
	}
}
