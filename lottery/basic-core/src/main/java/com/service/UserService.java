package com.service;

import java.util.List;

import com.model.User;

public interface UserService {
	public int insertUser(User user);
	public User findUserBy(int userId);
	public List<User> findAll();
}
