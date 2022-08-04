package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.UserBean;

@RestController
@RequestMapping("/users")
public class SessionController {
	
	@PostMapping
	public String getMapping(UserBean userBean) {
		return "Hello(Testing Of rest api)";
	}
	
	@GetMapping("/abc")
	public String getMapping1() {
		return "Signup";
	}
	
}
