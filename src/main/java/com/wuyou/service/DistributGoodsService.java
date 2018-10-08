package com.wuyou.service;

import com.wuyou.entity.DistributGoods;
import com.wuyou.entity.DistributGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DistributGoodsService {
    int countByExample(DistributGoodsExample example);

    int deleteByExample(DistributGoodsExample example);

    int insert(DistributGoods record);

    int insertSelective(DistributGoods record);

    List<DistributGoods> selectByExample(DistributGoodsExample example);

    int updateByExampleSelective(@Param("record") DistributGoods record, @Param("example") DistributGoodsExample example);

    int updateByExample(@Param("record") DistributGoods record, @Param("example") DistributGoodsExample example);
}