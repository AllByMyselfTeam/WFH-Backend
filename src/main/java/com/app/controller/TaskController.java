package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.TaskService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TaskController {
	@Autowired
	TaskService taskService;
}
