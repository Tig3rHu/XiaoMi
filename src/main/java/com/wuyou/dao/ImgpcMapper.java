package com.wuyou.dao;

import com.wuyou.entity.Imgpc;
import com.wuyou.entity.ImgpcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImgpcMapper {
    int countByExample(ImgpcExample example);

    int deleteByExample(ImgpcExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Imgpc record);

    int insertSelective(Imgpc record);

    List<Imgpc> selectByExample(ImgpcExample example);

    Imgpc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Imgpc record, @Param("example") ImgpcExample example);

    int updateByExample(@Param("record") Imgpc record, @Param("example") ImgpcExample example);

    int updateByPrimaryKeySelective(Imgpc record);

    int updateByPrimaryKey(Imgpc record);
}