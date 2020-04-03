package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.pojo.Team;
import com.app.pojo.User;

@Repository
public interface TeamRepository extends JpaRepository<Team,Integer> {
	
//	@Query("SELECT t.USERID FROM USER_TEAM t where t.TEAMID  = :teamid") 
//	public List<Integer> getAllUsersInTeam(@Param("teamid") int teamid);
}
