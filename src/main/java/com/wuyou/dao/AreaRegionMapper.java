package com.wuyou.dao;

import com.wuyou.entity.AreaRegion;
import com.wuyou.entity.AreaRegionExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AreaRegionMapper {
    int countByExample(AreaRegionExample example);

    int deleteByExample(AreaRegionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AreaRegion record);

    int insertSelective(AreaRegion record);

    List<AreaRegion> selectByExample(AreaRegionExample example);

    AreaRegion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AreaRegion record, @Param("example") AreaRegionExample example);

    int updateByExample(@Param("record") AreaRegion record, @Param("example") AreaRegionExample example);

    int updateByPrimaryKeySelective(AreaRegion record);

    int updateByPrimaryKey(AreaRegion record);
}