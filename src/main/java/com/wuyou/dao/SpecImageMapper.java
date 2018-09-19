package com.wuyou.dao;

import com.wuyou.entity.SpecImage;
import com.wuyou.entity.SpecImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecImageMapper {
    int countByExample(SpecImageExample example);

    int deleteByExample(SpecImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SpecImage record);

    int insertSelective(SpecImage record);

    List<SpecImage> selectByExample(SpecImageExample example);

    SpecImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SpecImage record, @Param("example") SpecImageExample example);

    int updateByExample(@Param("record") SpecImage record, @Param("example") SpecImageExample example);

    int updateByPrimaryKeySelective(SpecImage record);

    int updateByPrimaryKey(SpecImage record);
}