package com.wuyou.dao;

import com.wuyou.entity.WxKeyword;
import com.wuyou.entity.WxKeywordExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WxKeywordMapper {
    int countByExample(WxKeywordExample example);

    int deleteByExample(WxKeywordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxKeyword record);

    int insertSelective(WxKeyword record);

    List<WxKeyword> selectByExample(WxKeywordExample example);

    WxKeyword selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxKeyword record, @Param("example") WxKeywordExample example);

    int updateByExample(@Param("record") WxKeyword record, @Param("example") WxKeywordExample example);

    int updateByPrimaryKeySelective(WxKeyword record);

    int updateByPrimaryKey(WxKeyword record);
}