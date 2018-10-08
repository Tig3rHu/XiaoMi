/**  
* <p>Title: OrderActionServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.OrderActionMapper;
import com.wuyou.entity.OrderAction;
import com.wuyou.entity.OrderActionExample;
import com.wuyou.service.OrderActionService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class OrderActionServiceImpl implements OrderActionService {
    
	@Autowired
	private OrderActionMapper orderActionMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.OrderActionService#insert(com.wuyou.entity.OrderAction)
	 */
	@Override
	public int insert(OrderAction orderAction) {
		// TODO Auto-generated method stub
		return orderActionMapper.insert(orderAction);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.OrderActionService#deleteByActionId(java.lang.Integer)
	 */
	@Override
	public int deleteByActionId(Integer actionId) {
		// TODO Auto-generated method stub
		return orderActionMapper.deleteByPrimaryKey(actionId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.OrderActionService#updateOrderActionByactionID(java.lang.Integer, com.wuyou.entity.OrderAction)
	 */
	@Override
	public int updateOrderActionByactionID(Integer actionId,
			OrderAction orderAction) {
		// TODO Auto-generated method stub
		orderAction.setActionId(actionId);
		return orderActionMapper.updateByPrimaryKey(orderAction);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.OrderActionService#findOrderActionByactionId(java.lang.Integer)
	 */
	@Override
	public OrderAction findOrderActionByactionId(Integer actionId) {
		// TODO Auto-generated method stub
		return orderActionMapper.selectByPrimaryKey(actionId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.OrderActionService#findAll()
	 */
	@Override
	public List<OrderAction> findAll() {
		// TODO Auto-generated method stub
		OrderActionExample orderActionExample=new OrderActionExample();
		
		
		return orderActionMapper.selectByExample(orderActionExample);
	}

}
