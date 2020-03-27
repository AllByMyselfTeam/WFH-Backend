package com.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojo.Team;
import com.app.pojo.User;
import com.app.repository.TeamRepository;
import com.app.service.TeamService;
import com.app.service.UserService;

@Service
public class TeamServiceImpl implements TeamService {
	
	@Autowired
	TeamRepository teamRepo;
	
	@Autowired
	UserService userService;
	
	@Override
	public Team addTeam(Team team) {
		return teamRepo.save(team);
	}
	@Override
	public Team getTeamById(int id) {
		return teamRepo.findById(id).get();
	}
	
//	public void addUser(int teamid, int userid) {
//		User user = userService.getUserById(userid);
//		Team team = getTeamById(teamid);
//		
//		List new_users = team.getUsers();
//		new_users.add(user);
//		
//		team.setUsers(new_users);
//		
//		teamRepo.save(team);
//	}

}
