/**  
* <p>Title: OrderGoodsServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.OrderGoodsMapper;
import com.wuyou.entity.OrderGoods;
import com.wuyou.entity.OrderGoodsExample;
import com.wuyou.service.OrderGoodsService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class OrderGoodsServiceImpl implements OrderGoodsService {
    
	@Autowired
	private OrderGoodsMapper orderGoodsMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.OrderGoodsService#insert(com.wuyou.entity.OrderGoods)
	 */
	@Override
	public int insert(OrderGoods orderGoods) {
		// TODO Auto-generated method stub
		return orderGoodsMapper.insert(orderGoods);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.OrderGoodsService#deleteOrderGoodsByrecId(java.lang.Integer)
	 */
	@Override
	public int deleteOrderGoodsByrecId(Integer recId) {
		// TODO Auto-generated method stub
		return orderGoodsMapper.deleteByPrimaryKey(recId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.OrderGoodsService#updateOrderGoodsByrecId(java.lang.Integer, com.wuyou.entity.OrderGoods)
	 */
	@Override
	public int updateOrderGoodsByrecId(Integer recId, OrderGoods orderGoods) {
		// TODO Auto-generated method stub
		orderGoods.setRecId(recId);
		return orderGoodsMapper.updateByPrimaryKey(orderGoods);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.OrderGoodsService#findOrderGoodsById(java.lang.Integer)
	 */
	@Override
	public OrderGoods findOrderGoodsById(Integer recId) {
		// TODO Auto-generated method stub
		return orderGoodsMapper.selectByPrimaryKey(recId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.OrderGoodsService#findOrderGoodsAll()
	 */
	@Override
	public List<OrderGoods> findOrderGoodsAll() {
		// TODO Auto-generated method stub
		OrderGoodsExample orderGoodExample=new OrderGoodsExample();
		return orderGoodsMapper.selectByExample(orderGoodExample);
	}

}
