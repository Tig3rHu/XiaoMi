package com.wuyou.dao;

import com.wuyou.entity.Cart;
import com.wuyou.entity.CartExample;
import com.wuyou.entity.CartVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CartMapper {
    int countByExample(CartExample example);

    int deleteByExample(CartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    List<Cart> selectByExample(CartExample example);

    Cart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cart record, @Param("example") CartExample example);

    int updateByExample(@Param("record") Cart record, @Param("example") CartExample example);

    int updateByPrimaryKeySelective(Cart record);
    List<CartVo> selectfromCartAndPromOrder();
    int updateByPrimaryKey(Cart record);
}