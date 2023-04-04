package com.estore.estoreapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@RequestMapping("/")
	public String home() {
		return "5"; // temporary testing purpose
	}
}
