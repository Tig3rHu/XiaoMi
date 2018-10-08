package com.wuyou.dao;

import com.wuyou.entity.UserExtend;
import com.wuyou.entity.UserExtendExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserExtendMapper {
    int countByExample(UserExtendExample example);

    int deleteByExample(UserExtendExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserExtend record);

    int insertSelective(UserExtend record);

    List<UserExtend> selectByExample(UserExtendExample example);

    UserExtend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserExtend record, @Param("example") UserExtendExample example);

    int updateByExample(@Param("record") UserExtend record, @Param("example") UserExtendExample example);

    int updateByPrimaryKeySelective(UserExtend record);

    int updateByPrimaryKey(UserExtend record);
}