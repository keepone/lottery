package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.NewsDao;
import com.model.News;
import com.service.NewsService;
@Service("newsService")
public class NewsServiceImpl implements NewsService{
	@Resource
	private NewsDao newsDao;
	public int insertNews(News news) {
		// TODO Auto-generated method stub
		return newsDao.insertNews(news);
	}

}
