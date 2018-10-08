package com.wuyou.dao;

import com.wuyou.entity.OauthUsers;
import com.wuyou.entity.OauthUsersExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OauthUsersMapper {
    int countByExample(OauthUsersExample example);

    int deleteByExample(OauthUsersExample example);

    int deleteByPrimaryKey(Integer tuId);

    int insert(OauthUsers record);

    int insertSelective(OauthUsers record);

    List<OauthUsers> selectByExample(OauthUsersExample example);

    OauthUsers selectByPrimaryKey(Integer tuId);

    int updateByExampleSelective(@Param("record") OauthUsers record, @Param("example") OauthUsersExample example);

    int updateByExample(@Param("record") OauthUsers record, @Param("example") OauthUsersExample example);

    int updateByPrimaryKeySelective(OauthUsers record);

    int updateByPrimaryKey(OauthUsers record);
}