package com.project.onlineshopping.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.onlineshopping.dao.UserRepository;
import com.project.onlineshopping.model.User;
import com.project.onlineshopping.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Qualifier("userRepository")
	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean saveUser(User user) {

		userRepository.saveAndFlush(user);
		return true;
	}

	@Override
	public User findUserByEmail(String email) {

		return userRepository.findUserByEmail(email);
	}

}
