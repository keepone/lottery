package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.lottery.spider.GetNews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.fastjson.JSONObject;
import com.model.News;
import com.model.User;
import com.service.NewsService;
import com.service.UserService;



@Controller
@RequestMapping("/news")
public class NewsController{

 
	
	@Resource
	private NewsService newsService;

	/**
	 * 新增用户
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/addNews")
	public String addNews(HttpServletRequest request, Model model) {
		List<JSONObject> list = GetNews.getNewsBy310();
		for (JSONObject json : list) {
			News news = new News();
			news.setName(json.getString("name"));
			news.setContent(json.getString("content"));
			int count=newsService.insertNews(news);
			System.out.println(count);
		}

		return "showUser";
	}
	
	
	
   
   
}