package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Team;
import com.app.pojo.User;
import com.app.service.TeamService;
import com.app.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TeamController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private TeamService teamService;
	
	@GetMapping("/getTeam/{teamid}")
	public Team getUseById(@PathVariable("teamid") int teamid) {
		return teamService.getTeamById(teamid);
	}

}
