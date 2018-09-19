package com.wuyou.dao;

import com.wuyou.entity.GroupBuy;
import com.wuyou.entity.GroupBuyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupBuyMapper {
    int countByExample(GroupBuyExample example);

    int deleteByExample(GroupBuyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GroupBuy record);

    int insertSelective(GroupBuy record);

    List<GroupBuy> selectByExampleWithBLOBs(GroupBuyExample example);

    List<GroupBuy> selectByExample(GroupBuyExample example);

    GroupBuy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GroupBuy record, @Param("example") GroupBuyExample example);

    int updateByExampleWithBLOBs(@Param("record") GroupBuy record, @Param("example") GroupBuyExample example);

    int updateByExample(@Param("record") GroupBuy record, @Param("example") GroupBuyExample example);

    int updateByPrimaryKeySelective(GroupBuy record);

    int updateByPrimaryKeyWithBLOBs(GroupBuy record);

    int updateByPrimaryKey(GroupBuy record);
}