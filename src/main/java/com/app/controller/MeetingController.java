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

import com.app.pojo.Meeting;
import com.app.service.MeetingService;

@RestController
@RequestMapping("/meeting")
@CrossOrigin(origins = "http://localhost:4200")
public class MeetingController {
	@Autowired
	MeetingService meetingService;
	
	@PostMapping("/add")
	public Meeting addMeeting(@RequestBody Meeting meeting) {
		return meetingService.addMeeting(meeting);
	}
	
	@GetMapping("/team/{tid}")
	public List<Meeting> getAllMeeting(@PathVariable("tid") int team){
		return meetingService.getAllMeeting(team);
	}
}
