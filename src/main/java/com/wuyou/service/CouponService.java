package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.Coupon;
import com.wuyou.entity.CouponExample;

/**
 * @author 吴优
 * desciption:优惠券
 * other:
 * @date 2018年9月21日 
 */
public interface CouponService {
    /**
     * 添加优惠券
     * @param record
     * @return
     */
	int insert(Coupon record);
	/**
	 * 
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(Integer id);
	/**
	 * 
	 * @param example
	 * @return
	 */
	List<Coupon> selectByExample(CouponExample example);

    Coupon selectByPrimaryKey(Integer id);
	
}
