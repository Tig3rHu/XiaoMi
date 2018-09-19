package com.wuyou.dao;

import com.wuyou.entity.ExpenseLog;
import com.wuyou.entity.ExpenseLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpenseLogMapper {
    int countByExample(ExpenseLogExample example);

    int deleteByExample(ExpenseLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExpenseLog record);

    int insertSelective(ExpenseLog record);

    List<ExpenseLog> selectByExample(ExpenseLogExample example);

    ExpenseLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExpenseLog record, @Param("example") ExpenseLogExample example);

    int updateByExample(@Param("record") ExpenseLog record, @Param("example") ExpenseLogExample example);

    int updateByPrimaryKeySelective(ExpenseLog record);

    int updateByPrimaryKey(ExpenseLog record);
}