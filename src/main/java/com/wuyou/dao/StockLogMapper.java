package com.wuyou.dao;

import com.wuyou.entity.StockLog;
import com.wuyou.entity.StockLogExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StockLogMapper {
    int countByExample(StockLogExample example);

    int deleteByExample(StockLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockLog record);

    int insertSelective(StockLog record);

    List<StockLog> selectByExample(StockLogExample example);

    StockLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockLog record, @Param("example") StockLogExample example);

    int updateByExample(@Param("record") StockLog record, @Param("example") StockLogExample example);

    int updateByPrimaryKeySelective(StockLog record);

    int updateByPrimaryKey(StockLog record);
}