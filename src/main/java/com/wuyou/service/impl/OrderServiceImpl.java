/**  
* <p>Title: OrderServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.OrderMapper;
import com.wuyou.entity.Order;
import com.wuyou.entity.OrderExample;
import com.wuyou.service.OrderService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class OrderServiceImpl implements OrderService {
    
	@Autowired
	private OrderMapper orderMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.OrderService#insert(com.wuyou.entity.Order)
	 */
	@Override
	public int insert(Order order) {
		// TODO Auto-generated method stub
		return orderMapper.insert(order);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.OrderService#deleteOrderByOrderId(java.lang.Integer)
	 */
	@Override
	public int deleteOrderByOrderId(Integer orderId) {
		// TODO Auto-generated method stub
		return orderMapper.deleteByPrimaryKey(orderId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.OrderService#updateOrderByOrderId(java.lang.Integer, com.wuyou.entity.Order)
	 */
	@Override
	public int updateOrderByOrderId(Integer orderId, Order order) {
		// TODO Auto-generated method stub
		order.setOrderId(orderId);
		return orderMapper.updateByPrimaryKey(order);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.OrderService#findOrderByOrderId(java.lang.Integer)
	 */
	@Override
	public Order findOrderByOrderId(Integer orderId) {
		// TODO Auto-generated method stub
		return orderMapper.selectByPrimaryKey(orderId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.OrderService#findOrderByUserId(java.lang.Integer)
	 */
	@Override
	public List<Order> findOrderByUserId(Integer userId) {
		// TODO Auto-generated method stub
		OrderExample orderExample=new OrderExample();
		OrderExample.Criteria criteria=orderExample.createCriteria();
		criteria.andUserIdEqualTo(userId);
		
		return orderMapper.selectByExample(orderExample);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.OrderService#selectByExample(com.wuyou.entity.OrderExample)
	 */
	@Override
	public List<Order> selectByExample(OrderExample example) {
		// TODO Auto-generated method stub
		return orderMapper.selectByExample(example);
	}

}
