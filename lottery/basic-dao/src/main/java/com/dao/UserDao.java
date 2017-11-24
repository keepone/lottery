package com.dao;

import java.util.List;

import com.model.User;

public interface UserDao {
	/**
	 * 增
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	
	/**
	 * 查
	 * @return
	 */
	public List<User> findAll();
	
}
