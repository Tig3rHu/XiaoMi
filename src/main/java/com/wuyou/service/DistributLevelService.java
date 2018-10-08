package com.wuyou.service;

import com.wuyou.entity.DistributLevel;
import com.wuyou.entity.DistributLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DistributLevelService {
    int countByExample(DistributLevelExample example);

    int deleteByExample(DistributLevelExample example);

    int deleteByPrimaryKey(Byte levelId);

    int insert(DistributLevel record);

    int insertSelective(DistributLevel record);

    List<DistributLevel> selectByExample(DistributLevelExample example);

    DistributLevel selectByPrimaryKey(Byte levelId);

    int updateByExampleSelective(@Param("record") DistributLevel record, @Param("example") DistributLevelExample example);

    int updateByExample(@Param("record") DistributLevel record, @Param("example") DistributLevelExample example);

    int updateByPrimaryKeySelective(DistributLevel record);

    int updateByPrimaryKey(DistributLevel record);
}