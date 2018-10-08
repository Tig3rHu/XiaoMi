package com.wuyou.dao;

import com.wuyou.entity.GoodsImages;
import com.wuyou.entity.GoodsImagesExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsImagesMapper {
    int countByExample(GoodsImagesExample example);

    int deleteByExample(GoodsImagesExample example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(GoodsImages record);

    int insertSelective(GoodsImages record);

    List<GoodsImages> selectByExample(GoodsImagesExample example);

    GoodsImages selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") GoodsImages record, @Param("example") GoodsImagesExample example);

    int updateByExample(@Param("record") GoodsImages record, @Param("example") GoodsImagesExample example);

    int updateByPrimaryKeySelective(GoodsImages record);

    int updateByPrimaryKey(GoodsImages record);
}