package com.app.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.service.UserService;
import com.app.service.TeamService;
import com.app.repository.UserRepository;
import com.app.pojo.Team;
import com.app.pojo.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private TeamService teamService;
	
	@Override
	public User login(User user) {
		User compUser = userRepository.findByUsername(user.getUsername());
		if(compUser != null) {
			if(user.getPassword().equals(compUser.getPassword())) {
				return compUser;
			} else {
				return null;
			}
		}else {
			return null;
		}
		
	}

	@Override
	public User register(User user) {
//		User compUser = userRepository.findByUsername(user.getUsername());
//		if(compUser != null) {
//			user.setUsername("taken");
//			return user;
//		}else {
//			userRepository.save(user);
//			return user;
//		}
		userRepository.save(user);
		return user;
		
	}

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUserById(int userId) {
		return userRepository.getOne(userId);
	}

	@Override
	public List<Team> addTeam(User user, Team team) {
		if(user.getTeams() == null) {
			List new_teams = new ArrayList<Team>();
			new_teams.add(team);
			user.setTeams(new_teams);
			userRepository.save(user);
			return new_teams;
		} else {
			List new_teams = user.getTeams();
			new_teams.add(team);
			user.setTeams(new_teams);
			userRepository.save(user);
			return user.getTeams();
		}
	}
//
//	@Override
//	public List<Team> addTeamByTeamId(int userid, int teamid) {
//
//		User user = getUserById(userid);
//		Team team = teamService.getTeamById(teamid);
//		
//		user.addTeams(team);
//		userRepository.save(user);
//		return user.getTeams();
//	}
//	
	
}
