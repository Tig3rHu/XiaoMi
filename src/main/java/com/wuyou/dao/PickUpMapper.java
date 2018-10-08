package com.wuyou.dao;

import com.wuyou.entity.PickUp;
import com.wuyou.entity.PickUpExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PickUpMapper {
    int countByExample(PickUpExample example);

    int deleteByExample(PickUpExample example);

    int deleteByPrimaryKey(Integer pickupId);

    int insert(PickUp record);

    int insertSelective(PickUp record);

    List<PickUp> selectByExample(PickUpExample example);

    PickUp selectByPrimaryKey(Integer pickupId);

    int updateByExampleSelective(@Param("record") PickUp record, @Param("example") PickUpExample example);

    int updateByExample(@Param("record") PickUp record, @Param("example") PickUpExample example);

    int updateByPrimaryKeySelective(PickUp record);

    int updateByPrimaryKey(PickUp record);
}