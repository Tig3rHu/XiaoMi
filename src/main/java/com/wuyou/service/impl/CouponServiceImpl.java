/**  
* <p>Title: CouponServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.CouponMapper;
import com.wuyou.entity.Coupon;
import com.wuyou.entity.CouponExample;
import com.wuyou.service.CouponService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月21日 
 */
@Service
public class CouponServiceImpl implements CouponService {
     
	@Autowired
	private CouponMapper couponMapper;
	/* (non-Javadoc)
	 * @see com.wuyou.service.CouponService#insert(com.wuyou.entity.Coupon)
	 */
	@Override
	public int insert(Coupon record) {
		// TODO Auto-generated method stub
		return couponMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.CouponService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return couponMapper.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.CouponService#selectByExample(com.wuyou.entity.CouponExample)
	 */
	@Override
	public List<Coupon> selectByExample(CouponExample example) {
		// TODO Auto-generated method stub
		return couponMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.CouponService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public Coupon selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return couponMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.CouponService#updateByPrimaryKey(com.wuyou.entity.Coupon)
	 */
	@Override
	public int updateByPrimaryKey(Coupon record) {
		// TODO Auto-generated method stub
		return couponMapper.updateByPrimaryKey(record);
	}

}
