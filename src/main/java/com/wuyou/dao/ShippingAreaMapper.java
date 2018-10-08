package com.wuyou.dao;

import com.wuyou.entity.ShippingArea;
import com.wuyou.entity.ShippingAreaExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShippingAreaMapper {
    int countByExample(ShippingAreaExample example);

    int deleteByExample(ShippingAreaExample example);

    int deleteByPrimaryKey(Short shippingAreaId);

    int insert(ShippingArea record);

    int insertSelective(ShippingArea record);

    List<ShippingArea> selectByExampleWithBLOBs(ShippingAreaExample example);

    List<ShippingArea> selectByExample(ShippingAreaExample example);

    ShippingArea selectByPrimaryKey(Short shippingAreaId);

    int updateByExampleSelective(@Param("record") ShippingArea record, @Param("example") ShippingAreaExample example);

    int updateByExampleWithBLOBs(@Param("record") ShippingArea record, @Param("example") ShippingAreaExample example);

    int updateByExample(@Param("record") ShippingArea record, @Param("example") ShippingAreaExample example);

    int updateByPrimaryKeySelective(ShippingArea record);

    int updateByPrimaryKeyWithBLOBs(ShippingArea record);

    int updateByPrimaryKey(ShippingArea record);
}