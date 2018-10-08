package com.wuyou.dao;

import com.wuyou.entity.FlashSale;
import com.wuyou.entity.FlashSaleExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FlashSaleMapper {
    int countByExample(FlashSaleExample example);

    int deleteByExample(FlashSaleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FlashSale record);

    int insertSelective(FlashSale record);

    List<FlashSale> selectByExampleWithBLOBs(FlashSaleExample example);

    List<FlashSale> selectByExample(FlashSaleExample example);

    FlashSale selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FlashSale record, @Param("example") FlashSaleExample example);

    int updateByExampleWithBLOBs(@Param("record") FlashSale record, @Param("example") FlashSaleExample example);

    int updateByExample(@Param("record") FlashSale record, @Param("example") FlashSaleExample example);

    int updateByPrimaryKeySelective(FlashSale record);

    int updateByPrimaryKeyWithBLOBs(FlashSale record);

    int updateByPrimaryKey(FlashSale record);
}