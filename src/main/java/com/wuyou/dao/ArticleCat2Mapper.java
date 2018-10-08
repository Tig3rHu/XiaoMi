package com.wuyou.dao;

import com.wuyou.entity.ArticleCat2;
import com.wuyou.entity.ArticleCat2Example;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ArticleCat2Mapper {
    int countByExample(ArticleCat2Example example);

    int deleteByExample(ArticleCat2Example example);

    int deleteByPrimaryKey(Integer catId);

    int insert(ArticleCat2 record);

    int insertSelective(ArticleCat2 record);

    List<ArticleCat2> selectByExample(ArticleCat2Example example);

    ArticleCat2 selectByPrimaryKey(Integer catId);

    int updateByExampleSelective(@Param("record") ArticleCat2 record, @Param("example") ArticleCat2Example example);

    int updateByExample(@Param("record") ArticleCat2 record, @Param("example") ArticleCat2Example example);

    int updateByPrimaryKeySelective(ArticleCat2 record);

    int updateByPrimaryKey(ArticleCat2 record);
}