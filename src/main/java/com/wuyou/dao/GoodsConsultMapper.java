package com.wuyou.dao;

import com.wuyou.entity.GoodsConsult;
import com.wuyou.entity.GoodsConsultExample;
import com.wuyou.entity.GoodsConsultVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface GoodsConsultMapper {
    int countByExample(GoodsConsultExample example);

    int deleteByExample(GoodsConsultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsConsult record);

    int insertSelective(GoodsConsult record);

    List<GoodsConsult> selectByExample(GoodsConsultExample example);
    
    List<GoodsConsultVo> goodsConsultAndgoods();

    GoodsConsult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsConsult record, @Param("example") GoodsConsultExample example);

    int updateByExample(@Param("record") GoodsConsult record, @Param("example") GoodsConsultExample example);

    int updateByPrimaryKeySelective(GoodsConsult record);

    int updateByPrimaryKey(GoodsConsultVo record);

	
}