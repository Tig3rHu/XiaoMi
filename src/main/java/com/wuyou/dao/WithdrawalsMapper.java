package com.wuyou.dao;

import com.wuyou.entity.Withdrawals;
import com.wuyou.entity.WithdrawalsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WithdrawalsMapper {
    int countByExample(WithdrawalsExample example);

    int deleteByExample(WithdrawalsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Withdrawals record);

    int insertSelective(Withdrawals record);

    List<Withdrawals> selectByExample(WithdrawalsExample example);

    Withdrawals selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Withdrawals record, @Param("example") WithdrawalsExample example);

    int updateByExample(@Param("record") Withdrawals record, @Param("example") WithdrawalsExample example);

    int updateByPrimaryKeySelective(Withdrawals record);

    int updateByPrimaryKey(Withdrawals record);
}