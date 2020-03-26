package com.app.service;

import com.app.pojo.User;

public interface UserService {

	public User login(User user);

	public User register(User user);
	
	public User addUser(User user);

	public User getUserById(int userId);
}
