package com.wuyou.dao;

import com.wuyou.entity.Suppliers;
import com.wuyou.entity.SuppliersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuppliersMapper {
    int countByExample(SuppliersExample example);

    int deleteByExample(SuppliersExample example);

    int deleteByPrimaryKey(Short suppliersId);

    int insert(Suppliers record);

    int insertSelective(Suppliers record);

    List<Suppliers> selectByExampleWithBLOBs(SuppliersExample example);

    List<Suppliers> selectByExample(SuppliersExample example);

    Suppliers selectByPrimaryKey(Short suppliersId);

    int updateByExampleSelective(@Param("record") Suppliers record, @Param("example") SuppliersExample example);

    int updateByExampleWithBLOBs(@Param("record") Suppliers record, @Param("example") SuppliersExample example);

    int updateByExample(@Param("record") Suppliers record, @Param("example") SuppliersExample example);

    int updateByPrimaryKeySelective(Suppliers record);

    int updateByPrimaryKeyWithBLOBs(Suppliers record);

    int updateByPrimaryKey(Suppliers record);
}