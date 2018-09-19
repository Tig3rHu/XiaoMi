package com.wuyou.dao;

import com.wuyou.entity.UserSign;
import com.wuyou.entity.UserSignExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSignMapper {
    int countByExample(UserSignExample example);

    int deleteByExample(UserSignExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserSign record);

    int insertSelective(UserSign record);

    List<UserSign> selectByExampleWithBLOBs(UserSignExample example);

    List<UserSign> selectByExample(UserSignExample example);

    UserSign selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserSign record, @Param("example") UserSignExample example);

    int updateByExampleWithBLOBs(@Param("record") UserSign record, @Param("example") UserSignExample example);

    int updateByExample(@Param("record") UserSign record, @Param("example") UserSignExample example);

    int updateByPrimaryKeySelective(UserSign record);

    int updateByPrimaryKeyWithBLOBs(UserSign record);

    int updateByPrimaryKey(UserSign record);
}