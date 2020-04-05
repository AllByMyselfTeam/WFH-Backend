package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Notification;
import com.app.service.NotificationService;


@RestController
@RequestMapping("/notification")
@CrossOrigin(origins = "http://localhost:4200")
public class NotificationController {
	@Autowired
	NotificationService notificationService;
	
	@PostMapping("/add")
	public Notification addNotification(@RequestBody Notification notification) {
		return notificationService.addNotification(notification);
	}
	
	@GetMapping("/team/{tid}")
	public List<Notification> getAllNotification(@PathVariable("tid") int team){
		return notificationService.getAllNotification(team);
	}
}
