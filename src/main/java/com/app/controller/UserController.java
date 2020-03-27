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
import com.app.service.TeamService;
import com.app.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private TeamService teamService;

	
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
	
	@PutMapping("/addTeam/{id}")
	public List<Team> addTeam(@PathVariable("id") int id, @RequestBody Team team) {
		return userService.addTeam(userService.getUserById(id), team);
	}
	
	@PutMapping("/addTeam/{userid}/{teamid}")
	public List<Team> addTeam(@PathVariable("userid") int userid, @PathVariable("teamid") int teamid) {
		return userService.addTeam(userService.getUserById(userid), teamService.getTeamById(teamid));
	}
	
}
