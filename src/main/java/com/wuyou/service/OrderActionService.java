/**  
* <p>Title: OrderActionService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.OrderAction;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
public interface OrderActionService {
    
	public int insert(OrderAction orderAction);
	
	public int deleteByActionId(Integer actionId);
	
	public int updateOrderActionByactionID(Integer actionId,OrderAction orderAction);
	
	public OrderAction findOrderActionByactionId(Integer actionId);
	
	public List<OrderAction> findAll();
}
