package com.wuyou.dao;

import com.wuyou.entity.UserDistribution;
import com.wuyou.entity.UserDistributionExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDistributionMapper {
    int countByExample(UserDistributionExample example);

    int deleteByExample(UserDistributionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDistribution record);

    int insertSelective(UserDistribution record);

    List<UserDistribution> selectByExample(UserDistributionExample example);

    UserDistribution selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserDistribution record, @Param("example") UserDistributionExample example);

    int updateByExample(@Param("record") UserDistribution record, @Param("example") UserDistributionExample example);

    int updateByPrimaryKeySelective(UserDistribution record);

    int updateByPrimaryKey(UserDistribution record);
}