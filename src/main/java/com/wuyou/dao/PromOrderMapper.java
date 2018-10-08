package com.wuyou.dao;

import com.wuyou.entity.PromOrder;
import com.wuyou.entity.PromOrderExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PromOrderMapper {
    int countByExample(PromOrderExample example);

    int deleteByExample(PromOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PromOrder record);

    int insertSelective(PromOrder record);

    List<PromOrder> selectByExampleWithBLOBs(PromOrderExample example);

    List<PromOrder> selectByExample(PromOrderExample example);

    PromOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PromOrder record, @Param("example") PromOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") PromOrder record, @Param("example") PromOrderExample example);

    int updateByExample(@Param("record") PromOrder record, @Param("example") PromOrderExample example);

    int updateByPrimaryKeySelective(PromOrder record);

    int updateByPrimaryKeyWithBLOBs(PromOrder record);

    int updateByPrimaryKey(PromOrder record);
}