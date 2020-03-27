package com.app.service;

import java.util.List;

import com.app.pojo.Meeting;

public interface MeetingService {
	public Meeting addMeeting(Meeting meeting);
	public Meeting updateMeeting(Meeting meeting);
	public List<Meeting> getAllMeeting(int team);
	
}
