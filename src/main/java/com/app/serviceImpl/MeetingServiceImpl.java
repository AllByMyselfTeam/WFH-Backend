package com.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojo.Meeting;
import com.app.repository.MeetingRepository;
import com.app.service.MeetingService;

@Service
public class MeetingServiceImpl implements MeetingService {

	@Autowired
	MeetingRepository meetingRepo;
	
	@Override
	public Meeting addMeeting(Meeting meeting) {
		return meetingRepo.save(meeting);
	}

	@Override
	public Meeting updateMeeting(Meeting meeting) {
		return meetingRepo.save(meeting);
	}

	@Override
	public List<Meeting> getAllMeeting() {
		return meetingRepo.findAll();
	}

}
