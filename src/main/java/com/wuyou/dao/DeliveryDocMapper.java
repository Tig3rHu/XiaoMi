package com.wuyou.dao;

import com.wuyou.entity.DeliveryDoc;
import com.wuyou.entity.DeliveryDocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeliveryDocMapper {
    int countByExample(DeliveryDocExample example);

    int deleteByExample(DeliveryDocExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeliveryDoc record);

    int insertSelective(DeliveryDoc record);

    List<DeliveryDoc> selectByExampleWithBLOBs(DeliveryDocExample example);

    List<DeliveryDoc> selectByExample(DeliveryDocExample example);

    DeliveryDoc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeliveryDoc record, @Param("example") DeliveryDocExample example);

    int updateByExampleWithBLOBs(@Param("record") DeliveryDoc record, @Param("example") DeliveryDocExample example);

    int updateByExample(@Param("record") DeliveryDoc record, @Param("example") DeliveryDocExample example);

    int updateByPrimaryKeySelective(DeliveryDoc record);

    int updateByPrimaryKeyWithBLOBs(DeliveryDoc record);

    int updateByPrimaryKey(DeliveryDoc record);
}