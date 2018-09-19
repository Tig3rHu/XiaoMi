package com.wuyou.dao;

import com.wuyou.entity.Payment;
import com.wuyou.entity.PaymentExample;
import com.wuyou.entity.PaymentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentMapper {
    int countByExample(PaymentExample example);

    int deleteByExample(PaymentExample example);

    int deleteByPrimaryKey(Byte payId);

    int insert(PaymentWithBLOBs record);

    int insertSelective(PaymentWithBLOBs record);

    List<PaymentWithBLOBs> selectByExampleWithBLOBs(PaymentExample example);

    List<Payment> selectByExample(PaymentExample example);

    PaymentWithBLOBs selectByPrimaryKey(Byte payId);

    int updateByExampleSelective(@Param("record") PaymentWithBLOBs record, @Param("example") PaymentExample example);

    int updateByExampleWithBLOBs(@Param("record") PaymentWithBLOBs record, @Param("example") PaymentExample example);

    int updateByExample(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByPrimaryKeySelective(PaymentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PaymentWithBLOBs record);

    int updateByPrimaryKey(Payment record);
}