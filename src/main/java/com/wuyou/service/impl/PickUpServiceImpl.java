/**  
* <p>Title: PickUpServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.PickUpMapper;
import com.wuyou.entity.PickUp;
import com.wuyou.entity.PickUpExample;
import com.wuyou.service.PickUpService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class PickUpServiceImpl implements PickUpService {
    
    @Autowired
    private PickUpMapper pickUpMapper;

	/* (non-Javadoc)
	 * @see com.wuyou.service.PickUpService#insert(com.wuyou.entity.PickUp)
	 */
	@Override
	public int insert(PickUp pickUp) {
		// TODO Auto-generated method stub
		return pickUpMapper.insert(pickUp);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.PickUpService#deletePickUpByPickUpId(java.lang.Integer)
	 */
	@Override
	public int deletePickUpByPickUpId(Integer pickupId) {
		// TODO Auto-generated method stub
		return pickUpMapper.deleteByPrimaryKey(pickupId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.PickUpService#updatePickUpById(java.lang.Integer, com.wuyou.entity.PickUp)
	 */
	@Override
	public int updatePickUpById(Integer pickupId, PickUp pickUp) {
		// TODO Auto-generated method stub
		pickUp.setPickupId(pickupId);
		return pickUpMapper.updateByPrimaryKey(pickUp);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.PickUpService#findPickUpById(java.lang.Integer)
	 */
	@Override
	public PickUp findPickUpById(Integer pickupId) {
		// TODO Auto-generated method stub
		return pickUpMapper.selectByPrimaryKey(pickupId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.PickUpService#findPickUpAll()
	 */
	@Override
	public List<PickUp> findPickUpAll() {
		// TODO Auto-generated method stub
		PickUpExample pickUpExample=new PickUpExample();
		PickUpExample.Criteria criteria=pickUpExample.createCriteria();
		return pickUpMapper.selectByExample(pickUpExample);
	}

}
