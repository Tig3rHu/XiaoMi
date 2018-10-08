package com.wuyou.dao;

import com.wuyou.entity.GoodsCouponExample;
import com.wuyou.entity.GoodsCouponKey;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsCouponMapper {
    int countByExample(GoodsCouponExample example);

    int deleteByExample(GoodsCouponExample example);

    int deleteByPrimaryKey(GoodsCouponKey key);

    int insert(GoodsCouponKey record);

    int insertSelective(GoodsCouponKey record);

    List<GoodsCouponKey> selectByExample(GoodsCouponExample example);

    int updateByExampleSelective(@Param("record") GoodsCouponKey record, @Param("example") GoodsCouponExample example);

    int updateByExample(@Param("record") GoodsCouponKey record, @Param("example") GoodsCouponExample example);
}