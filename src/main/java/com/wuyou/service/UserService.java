package com.wuyou.service;

import org.springframework.stereotype.Service;

import com.wuyou.entity.User;

@Service
public interface UserService {
   
	
	
	
	public User findById(Integer id);
}
