package com.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojo.Team;
import com.app.repository.TeamRepository;
import com.app.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService {
	
	@Autowired
	TeamRepository teamRepo;
	@Override
	public Team addTeam(Team team) {
		return teamRepo.save(team);
	}

}
