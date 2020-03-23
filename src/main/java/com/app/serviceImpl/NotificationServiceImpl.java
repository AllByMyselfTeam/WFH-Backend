package com.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojo.Notification;
import com.app.repository.NotificationRepository;
import com.app.service.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	NotificationRepository notifyRepo;
	
	@Override
	public Notification addNotification(Notification notify) {
		return notifyRepo.save(notify);
	}

	@Override
	public Notification updateNotification(Notification notify) {
		return notifyRepo.save(notify);
	}

	@Override
	public void deleteNotification(int notifyId) {
		notifyRepo.deleteById(notifyId);
		
	}

}
