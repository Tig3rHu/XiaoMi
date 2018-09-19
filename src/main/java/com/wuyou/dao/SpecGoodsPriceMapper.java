package com.wuyou.dao;

import com.wuyou.entity.SpecGoodsPrice;
import com.wuyou.entity.SpecGoodsPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecGoodsPriceMapper {
    int countByExample(SpecGoodsPriceExample example);

    int deleteByExample(SpecGoodsPriceExample example);

    int deleteByPrimaryKey(Long itemId);

    int insert(SpecGoodsPrice record);

    int insertSelective(SpecGoodsPrice record);

    List<SpecGoodsPrice> selectByExample(SpecGoodsPriceExample example);

    SpecGoodsPrice selectByPrimaryKey(Long itemId);

    int updateByExampleSelective(@Param("record") SpecGoodsPrice record, @Param("example") SpecGoodsPriceExample example);

    int updateByExample(@Param("record") SpecGoodsPrice record, @Param("example") SpecGoodsPriceExample example);

    int updateByPrimaryKeySelective(SpecGoodsPrice record);

    int updateByPrimaryKey(SpecGoodsPrice record);
}