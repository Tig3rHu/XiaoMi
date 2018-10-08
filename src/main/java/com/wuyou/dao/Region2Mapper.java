package com.wuyou.dao;

import com.wuyou.entity.Region2;
import com.wuyou.entity.Region2Example;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Region2Mapper {
    int countByExample(Region2Example example);

    int deleteByExample(Region2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Region2 record);

    int insertSelective(Region2 record);

    List<Region2> selectByExample(Region2Example example);

    Region2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Region2 record, @Param("example") Region2Example example);

    int updateByExample(@Param("record") Region2 record, @Param("example") Region2Example example);

    int updateByPrimaryKeySelective(Region2 record);

    int updateByPrimaryKey(Region2 record);
}