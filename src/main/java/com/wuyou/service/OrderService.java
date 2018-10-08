/**  
* <p>Title: OrderService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.Order;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
public interface OrderService {
    
	/**
	 * 增加订单
	 * @param order
	 * @return
	 */
	public int insert(Order order); 
	/**
	 * 根据订单Id删除订单信息
	 * @param OrderId
	 * @return
	 */
	public int deleteOrderByOrderId(Integer OrderId);
	/**
	 * 根据订单Id更新订单信息
	 * @param OrderId
	 * @param order
	 * @return
	 */
	public int updateOrderByOrderId(Integer OrderId,Order order);
    /**
     * 根据订单id查询订单信息
     * @param OrderId
     * @return
     */
	public Order findOrderByOrderId(Integer OrderId);
	/**
	 * 根据用户Id查询订单列表
	 * @param userId
	 * @return
	 */
	public List<Order> findOrderByUserId(Integer userId);
	
    

}
