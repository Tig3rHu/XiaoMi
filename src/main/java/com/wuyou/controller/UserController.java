package com.wuyou.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.wuyou.entity.User;
import com.wuyou.service.UserService;




@RestController
public class UserController {
     
	@Autowired
	private UserService userService;
    
	@RequestMapping("/hello")
	@ResponseBody
	public String index(){
		System.out.println("ss");
		 return "hello world!";
	}
	
	@GetMapping("/get/{id}")
	@ResponseBody
	public String get(@PathVariable("id") Integer id){
		User u=userService.findById(id);
	     
	    return JSONObject.toJSONString(u);
	}
	@RequestMapping("/freemarker1")
	public String login(HttpServletRequest request){
		return "freemarker";
	}
	
}
