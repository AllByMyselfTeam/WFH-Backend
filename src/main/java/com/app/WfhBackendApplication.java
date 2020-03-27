package com.app;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.app.pojo.Checklist;
import com.app.pojo.Meeting;
import com.app.pojo.Notification;
import com.app.pojo.Task;
import com.app.pojo.Team;
import com.app.pojo.User;
import com.app.serviceImpl.CheckServiceImpl;
import com.app.serviceImpl.MeetingServiceImpl;
import com.app.serviceImpl.NotificationServiceImpl;
import com.app.serviceImpl.TaskServiceImpl;
import com.app.serviceImpl.TeamServiceImpl;
import com.app.serviceImpl.UserServiceImpl;

@SpringBootApplication
public class WfhBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WfhBackendApplication.class, args);
	}
	@Bean
	public CommandLineRunner wfhData(
			CheckServiceImpl checkService,
			TaskServiceImpl taskService,
			UserServiceImpl userService,
			TeamServiceImpl teamService,
			MeetingServiceImpl meetingService,
			NotificationServiceImpl notificationService){
		return args->{
			
			Team team1 = new Team();
			team1.setTeamId(1);
			team1.setTeamName("WorkFromHome");
			team1.setManagerId(1);
			teamService.addTeam(team1);
			
			User user1 = new User();
			user1.setUserId(1);
			user1.setUsername("demo");
			user1.setPassword("demo");
			user1.setEmail("demo@abc.com");
			user1.setPhone("17131236547");
			user1.setTeam(1);
			user1.setFname("demo");
			user1.setLname("test");
			//missing title
			//create user team should not be require
			userService.addUser(user1);
			
//			User user2 = new User();
//			user1.setUserId(1);
//			user1.setUsername("demo2");
//			user1.setPassword("demo2");
//			user1.setEmail("demo2@abc.com");
//			user1.setPhone("17131236547");
//			user1.setTeam(team1);
//			user1.setFname("demo2");
//			user1.setLname("test2");
//			//missing title
//			//create user team should not be require
//			userService.addUser(user1);
			
			
			Checklist check = new Checklist();
			check.setCheckId(1);
			check.setCheckTitle("Demo Checklist");
			check.setCheckDescription("Welcome to new Checklist");
			check.setUid(1);
			checkService.addNewChecklist(check);
			
			Checklist check2 = new Checklist();
			check2.setCheckId(2);
			check2.setCheckTitle("Demo Checklist Two");
			check2.setCheckDescription("Welcome to Checklist2");
			check2.setUid(1);
			checkService.addNewChecklist(check2);
			
			Date date = new Date();
			
			Task task1 = new Task();
			task1.setTaskId(1);
			task1.setTaskNumber(1);
			task1.setCid(1);
			task1.setStatus(0);
			task1.setTaskTitle("Task one");
			task1.setTaskDescription("Task one");
			task1.setBeginDate(date);
			taskService.addTask(task1);
			
			Task task2 = new Task();
			task2.setTaskId(2);
			task2.setTaskNumber(2);
			task2.setCid(1);
			task2.setStatus(0);
			task2.setTaskTitle("Task two");
			task2.setTaskDescription("Task two");
			task2.setBeginDate(date);
			taskService.addTask(task2);
			
			Task task3 = new Task();
			task3.setTaskId(3);
			task3.setTaskNumber(1);
			task3.setCid(2);
			task3.setStatus(0);
			task3.setTaskTitle("Task three");
			task3.setTaskDescription("Task three");
			task3.setBeginDate(date);
			taskService.addTask(task3);

			Task task4 = new Task();
			task4.setTaskId(4);
			task4.setTaskNumber(2);
			task4.setCid(2);
			task4.setStatus(1);
			task4.setTaskTitle("Task four");
			task4.setTaskDescription("Task four");
			task4.setBeginDate(date);
			taskService.addTask(task4);
			
			
			
			Meeting meeting = new Meeting();
			meeting.setMeetId(0);
			meeting.setTeam(1);
			meeting.setMeetDescription("Meeting note");
			meeting.setMeetLink("www.google.com");
			meetingService.addMeeting(meeting);
			
			Notification notify = new Notification();
			notify.setNotifyId(0);
			notify.setTeam(1);
			notify.setNotifyDescription("Notification note");
			notificationService.addNotification(notify);
			
			
			
			
		};
		
	}
}
