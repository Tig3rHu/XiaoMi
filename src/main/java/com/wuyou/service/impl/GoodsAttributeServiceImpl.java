/**  
* <p>Title: GoodsAttributeServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.GoodsAttributeMapper;
import com.wuyou.entity.GoodsAttribute;
import com.wuyou.entity.GoodsAttributeExample;
import com.wuyou.service.GoodAttributeService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class GoodsAttributeServiceImpl implements GoodAttributeService {
    
	@Autowired
	private GoodsAttributeMapper goodsAttributeMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodAttributeService#insert(com.wuyou.entity.GoodsAttribute)
	 */
	@Override
	public int insert(GoodsAttribute record) {
		// TODO Auto-generated method stub
		return goodsAttributeMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodAttributeService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer attrId) {
		// TODO Auto-generated method stub
		return goodsAttributeMapper.deleteByPrimaryKey(attrId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodAttributeService#updateByExample(com.wuyou.entity.GoodsAttribute, com.wuyou.entity.GoodsAttributeExample)
	 */
	@Override
	public int updateByExample(GoodsAttribute record,
			GoodsAttributeExample example) {
		// TODO Auto-generated method stub
		return goodsAttributeMapper.updateByExample(record, example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodAttributeService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public GoodsAttribute selectByPrimaryKey(Integer attrId) {
		// TODO Auto-generated method stub
		return goodsAttributeMapper.selectByPrimaryKey(attrId);
	}

}
