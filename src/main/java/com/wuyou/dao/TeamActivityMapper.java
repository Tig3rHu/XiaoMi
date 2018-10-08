package com.wuyou.dao;

import com.wuyou.entity.TeamActivity;
import com.wuyou.entity.TeamActivityExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TeamActivityMapper {
    int countByExample(TeamActivityExample example);

    int deleteByExample(TeamActivityExample example);

    int deleteByPrimaryKey(Integer teamId);

    int insert(TeamActivity record);

    int insertSelective(TeamActivity record);

    List<TeamActivity> selectByExample(TeamActivityExample example);

    TeamActivity selectByPrimaryKey(Integer teamId);

    int updateByExampleSelective(@Param("record") TeamActivity record, @Param("example") TeamActivityExample example);

    int updateByExample(@Param("record") TeamActivity record, @Param("example") TeamActivityExample example);

    int updateByPrimaryKeySelective(TeamActivity record);

    int updateByPrimaryKey(TeamActivity record);
}