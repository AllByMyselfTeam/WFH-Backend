package com.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.pojo.Task;
import com.app.repository.TaskRepository;
import com.app.service.TaskService;

public class TaskServiceImpl implements TaskService {

	@Autowired
	TaskRepository taskRepo;
	
	@Override
	public Task getTaskById(int taskId) {
		return taskRepo.getOne(taskId);
	}

	@Override
	public Task addTask(Task task) {
		return taskRepo.save(task);
	}

	@Override
	public Task updateTask(Task task) {
		return taskRepo.save(task);
	}

}
