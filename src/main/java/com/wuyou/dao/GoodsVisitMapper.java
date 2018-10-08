package com.wuyou.dao;

import com.wuyou.entity.GoodsVisit;
import com.wuyou.entity.GoodsVisitExample;
import com.wuyou.entity.GoodsVisitKey;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsVisitMapper {
    int countByExample(GoodsVisitExample example);

    int deleteByExample(GoodsVisitExample example);

    int deleteByPrimaryKey(GoodsVisitKey key);

    int insert(GoodsVisit record);

    int insertSelective(GoodsVisit record);

    List<GoodsVisit> selectByExample(GoodsVisitExample example);

    GoodsVisit selectByPrimaryKey(GoodsVisitKey key);

    int updateByExampleSelective(@Param("record") GoodsVisit record, @Param("example") GoodsVisitExample example);

    int updateByExample(@Param("record") GoodsVisit record, @Param("example") GoodsVisitExample example);

    int updateByPrimaryKeySelective(GoodsVisit record);

    int updateByPrimaryKey(GoodsVisit record);
}