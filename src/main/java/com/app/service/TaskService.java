package com.app.service;

import com.app.pojo.Task;

public interface TaskService {
	public Task getTaskById(int taskId);
	public Task addTask(Task task);
	public Task updateTask(Task task);
}
