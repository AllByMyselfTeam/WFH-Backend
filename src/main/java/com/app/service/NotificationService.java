package com.app.service;

import java.util.List;

import com.app.pojo.Notification;

public interface NotificationService {
	public Notification addNotification(Notification notify);
	public Notification updateNotification(Notification notify);
	public void deleteNotification(int notifyId);
	public List<Notification> getAllNotification(int team);
}
