package com.app.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.service.UserService;
import com.app.repository.UserRepository;
import com.app.pojo.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User login(User user) {
		User compUser = userRepository.findByUsername(user.getUsername());
		if(compUser != null) {
			if(user.getPassword().equals(compUser.getPassword())) {
				return compUser;
			} else {
				return null;
			}
		}else {
			return null;
		}
		
	}

	@Override
	public User register(User user) {
//		User compUser = userRepository.findByUsername(user.getUsername());
//		if(compUser != null) {
//			user.setUsername("taken");
//			return user;
//		}else {
//			userRepository.save(user);
//			return user;
//		}
		userRepository.save(user);
		return user;
		
	}
}
