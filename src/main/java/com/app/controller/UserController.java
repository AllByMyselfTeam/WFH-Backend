package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.User;
import com.app.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserService userService;

	
	@PostMapping("/login")
	public User login(@RequestBody User user, HttpSession session) {
		session.setAttribute("user", user);
		return userService.login(user);
	}
	
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return userService.register(user);
	}

}
