package com.wuyou.dao;

import com.wuyou.entity.VrOrderCode;
import com.wuyou.entity.VrOrderCodeExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VrOrderCodeMapper {
    int countByExample(VrOrderCodeExample example);

    int deleteByExample(VrOrderCodeExample example);

    int deleteByPrimaryKey(Integer recId);

    int insert(VrOrderCode record);

    int insertSelective(VrOrderCode record);

    List<VrOrderCode> selectByExample(VrOrderCodeExample example);

    VrOrderCode selectByPrimaryKey(Integer recId);

    int updateByExampleSelective(@Param("record") VrOrderCode record, @Param("example") VrOrderCodeExample example);

    int updateByExample(@Param("record") VrOrderCode record, @Param("example") VrOrderCodeExample example);

    int updateByPrimaryKeySelective(VrOrderCode record);

    int updateByPrimaryKey(VrOrderCode record);
}