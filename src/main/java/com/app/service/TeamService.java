package com.app.service;

import java.util.List;

import com.app.pojo.Team;
import com.app.pojo.User;

public interface TeamService {
	public Team addTeam(Team team);
	public Team getTeamById(int id);
	public List<User> getAllUsersInTeam(int teamid);
}
