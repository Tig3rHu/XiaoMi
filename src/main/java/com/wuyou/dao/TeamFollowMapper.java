package com.wuyou.dao;

import com.wuyou.entity.TeamFollow;
import com.wuyou.entity.TeamFollowExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TeamFollowMapper {
    int countByExample(TeamFollowExample example);

    int deleteByExample(TeamFollowExample example);

    int deleteByPrimaryKey(Integer followId);

    int insert(TeamFollow record);

    int insertSelective(TeamFollow record);

    List<TeamFollow> selectByExample(TeamFollowExample example);

    TeamFollow selectByPrimaryKey(Integer followId);

    int updateByExampleSelective(@Param("record") TeamFollow record, @Param("example") TeamFollowExample example);

    int updateByExample(@Param("record") TeamFollow record, @Param("example") TeamFollowExample example);

    int updateByPrimaryKeySelective(TeamFollow record);

    int updateByPrimaryKey(TeamFollow record);
}