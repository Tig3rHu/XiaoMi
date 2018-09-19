package com.wuyou.dao;

import com.wuyou.entity.Admin;
import com.wuyou.entity.AdminExample;
import com.wuyou.entity.AdminWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    int countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Short adminId);

    int insert(AdminWithBLOBs record);

    int insertSelective(AdminWithBLOBs record);

    List<AdminWithBLOBs> selectByExampleWithBLOBs(AdminExample example);

    List<Admin> selectByExample(AdminExample example);

    AdminWithBLOBs selectByPrimaryKey(Short adminId);

    int updateByExampleSelective(@Param("record") AdminWithBLOBs record, @Param("example") AdminExample example);

    int updateByExampleWithBLOBs(@Param("record") AdminWithBLOBs record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(AdminWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AdminWithBLOBs record);

    int updateByPrimaryKey(Admin record);
}