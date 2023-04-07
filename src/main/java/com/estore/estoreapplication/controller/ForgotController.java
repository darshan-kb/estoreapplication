package com.estore.estoreapplication.controller;

import javax.sound.midi.SysexMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.estore.estoreapplication.entities.User;
import com.estore.estoreapplication.service.ForgotService;
import com.estore.estoreapplication.service.LoginService;

@Controller
public class ForgotController {
	@Autowired
	ForgotService forgotservice;
	@Autowired
	LoginService loginservice;
	@RequestMapping("/forgotpassword")
	public String ForgotPassword() {
		return "forgot.html";
	}
	@PostMapping(path="/forgotpassword",consumes="application/json")
	public String SetNewPassword(@RequestBody User u) throws Exception {
		System.out.println(u.getEmail());
		if(u == null) {
			System.out.println("Please do not enter null value");
		}else {
			System.out.println(loginservice.LoginValidation(u.getEmail()));
			if(loginservice.LoginValidation(u.getEmail())) {
			String otp=forgotservice.generateOtp();
			System.out.println(forgotservice.sendOtp(u.getEmail(), otp));
			}else {
				System.out.println("3");
				return "email is not present value";
			}
		}
		System.out.println("4");
		return "New passsword id set now";
	}
}
