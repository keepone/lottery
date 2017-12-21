package com.dao;

import java.util.List;

import com.model.News;

public interface NewsDao {
	/**
	 * 增
	 * @param user
	 * @return
	 */
	public int insertNews(News news);
	
	/**
	 * 查
	 * @return
	 */
	public List<News> findAll();
	
}
