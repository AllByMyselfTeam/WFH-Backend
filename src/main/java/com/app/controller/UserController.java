package com.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.User;
import com.app.pojo.Team;
import com.app.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserService userService;

	
	@PostMapping("/login")
	public User login(@RequestBody User user) {
		return userService.login(user);
	}
	
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return userService.register(user);
	}
	
	@GetMapping("/user/{id}")
	public User getUseById(@PathVariable("id") int userId) {
		return userService.getUserById(userId);
	}
	
	@PutMapping("/addTeam")
	public List<Team> addTeam(@PathVariable("id") int id, @RequestBody Team team) {
		return userService.addTeam(id, team);
	}
	
}
