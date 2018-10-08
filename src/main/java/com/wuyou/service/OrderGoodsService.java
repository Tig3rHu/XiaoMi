/**  
* <p>Title: OrderGoodsService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.OrderGoods;

/**
 * @author 吴优
 * desciption:订单商品                                                                                
 * other:
 * @date 2018年9月22日 
 */
public interface OrderGoodsService {
     
	public int insert(OrderGoods orderGoods);
	
	public int deleteOrderGoodsByrecId(Integer recId);
	
	public int updateOrderGoodsByrecId(Integer recId,OrderGoods orderGoods);
	
	public OrderGoods findOrderGoodsById(Integer recId);
	
	public List<OrderGoods> findOrderGoodsAll();
	
	
}
