/**  
* <p>Title: DelivertDocServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.DeliveryDocMapper;
import com.wuyou.entity.DeliveryDoc;
import com.wuyou.entity.DeliveryDocExample;
import com.wuyou.service.DeliveryDocService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月21日 
 */
@Service
public class DelivertDocServiceImpl implements DeliveryDocService {
    @Autowired
    private DeliveryDocMapper delivertDocMapper;
	/* (non-Javadoc)
	 * @see com.wuyou.service.DeliveryDocService#insert(com.wuyou.entity.DeliveryDoc)
	 */
	@Override
	public int insert(DeliveryDoc record) {
		// TODO Auto-generated method stub
		return delivertDocMapper.insert(record);
	}


	/* (non-Javadoc)
	 * @see com.wuyou.service.DeliveryDocService#selectByExample(com.wuyou.entity.DeliveryDocExample)
	 */
	@Override
	public List<DeliveryDoc> selectByExample(DeliveryDocExample example) {
		// TODO Auto-generated method stub
		return delivertDocMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.DeliveryDocService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public DeliveryDoc selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return delivertDocMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.DeliveryDocService#updateByPrimaryKey(com.wuyou.entity.DeliveryDoc)
	 */
	@Override
	public int updateByPrimaryKey(DeliveryDoc record) {
		// TODO Auto-generated method stub
		return delivertDocMapper.updateByPrimaryKey(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.DeliveryDocService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return delivertDocMapper.deleteByPrimaryKey(id);
	}

}
