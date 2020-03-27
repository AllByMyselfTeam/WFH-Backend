package com.app.service;

import java.util.List;

import com.app.pojo.Checklist;
import com.app.pojo.Task;


public interface TaskService {
	public Task getTaskById(int taskId);
	public Task addTask(Task task);
	public Task updateTask(Task task);
	public void deleteTask(int taskId);
	public List<Task> getAllTaskByCheck(int cid);
	
}
