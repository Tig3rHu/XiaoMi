/**  
* <p>Title: PromOrderServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.PromOrderMapper;
import com.wuyou.entity.PromOrder;
import com.wuyou.service.PromOrderService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class PromOrderServiceImpl implements PromOrderService {
    
	@Autowired
	private PromOrderMapper promOrderMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.PromOrderSevice#insert(com.wuyou.entity.PromOrder)
	 */
	@Override
	public int insert(PromOrder promOrder) {
		// TODO Auto-generated method stub
		return promOrderMapper.insert(promOrder);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.PromOrderSevice#deletePromOrderById(java.lang.Long)
	 */
	@Override
	public int deletePromOrderById(Long id) {
		// TODO Auto-generated method stub
		return promOrderMapper.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.PromOrderSevice#updatePromOrderById(java.lang.Long, com.wuyou.entity.PromOrder)
	 */
	@Override
	public int updatePromOrderById(Long id, PromOrder promOrder) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.PromOrderSevice#findPromOrderById(java.lang.Long)
	 */
	@Override
	public PromOrder findPromOrderById(Long id) {
		// TODO Auto-generated method stub
		return promOrderMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.PromOrderSevice#findPromOrderAll()
	 */
	@Override
	public List<PromOrder> findPromOrderAll() {
		// TODO Auto-generated method stub
		return promOrderMapper.selectByExample(null);
	}

}
