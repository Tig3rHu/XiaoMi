package com.wuyou.dao;

import com.wuyou.entity.SpecItem;
import com.wuyou.entity.SpecItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecItemMapper {
    int countByExample(SpecItemExample example);

    int deleteByExample(SpecItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SpecItem record);

    int insertSelective(SpecItem record);

    List<SpecItem> selectByExample(SpecItemExample example);

    SpecItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SpecItem record, @Param("example") SpecItemExample example);

    int updateByExample(@Param("record") SpecItem record, @Param("example") SpecItemExample example);

    int updateByPrimaryKeySelective(SpecItem record);

    int updateByPrimaryKey(SpecItem record);
}