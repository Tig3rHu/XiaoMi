package com.wuyou.dao;

import org.apache.ibatis.annotations.Mapper;

import com.wuyou.entity.User;


@Mapper
public interface UserMapper {
    
	/**
	 * 根据id查找用户信息
	 */
	public User findById(Integer id);
	
	
}
