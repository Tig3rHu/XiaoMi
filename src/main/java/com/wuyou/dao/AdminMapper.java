package com.wuyou.dao;

import com.wuyou.entity.Admin;
import com.wuyou.entity.AdminExample;
import com.wuyou.entity.AdminWithBLOBs;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdminMapper {
    int countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    int deleteByPrimaryKey(Short adminId);

    int insert(Admin admin);

    int insertSelective(AdminWithBLOBs record);

    List<AdminWithBLOBs> selectByExampleWithBLOBs(AdminExample example);

    List<Admin> selectByExample(AdminExample example);
    
    Admin findAdminByUserName(String userName);

    AdminWithBLOBs selectByPrimaryKey(Short adminId);

    int updateByExampleSelective(@Param("record") AdminWithBLOBs record, @Param("example") AdminExample example);

    int updateByExampleWithBLOBs(@Param("record") AdminWithBLOBs record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(AdminWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AdminWithBLOBs record);

    int updateByPrimaryKey(Admin record);
}