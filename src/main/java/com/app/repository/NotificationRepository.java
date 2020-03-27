package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojo.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification,Integer> {
	public List<Notification> findAllByTeam(int team);
}
