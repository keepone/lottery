package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.common.json.JSON;
import com.model.User;
import com.service.UserService;



@Controller
@RequestMapping("/")
public class UserController{

	
	@Resource
	private UserService userService;
	
	/**
	 * 跳转至首页
	 * @return
	 */
   @RequestMapping("index")
   public String index(){
       return "index";
   }
   /**
    * 新增用户
    * @param request
    * @param model
    * @return
    */
   @RequestMapping("/showUser")  
   public String toIndex(HttpServletRequest request,Model model){  
       int state = Integer.parseInt(request.getParameter("state"));  
       String nickname   = request.getParameter("nickname"); 
       User user=new User();
       user.setState(state);
       user.setNickname(nickname);
       int count = this.userService.insertUser(user);
       System.out.println(count);
       return "showUser"; 
   }
   
   @RequestMapping("/findAllUser")  
   public String findAllUser(HttpServletRequest request,Model model){  
       List<User> users=userService.findAll();
       User user=users.get(1);
       System.out.println(user.getNickname());
       return "showUser"; 
   }
   
   
}