/**  
* <p>Title: GoodsAttrServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.GoodsAttrMapper;
import com.wuyou.entity.GoodsAttr;
import com.wuyou.entity.GoodsAttrExample;
import com.wuyou.service.GoodsAttrService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class GoodsAttrServiceImpl implements GoodsAttrService {
    
	@Autowired
	private GoodsAttrMapper goodsAttrMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsAttrService#insert(com.wuyou.entity.GoodsAttr)
	 */
	@Override
	public int insert(GoodsAttr record) {
		// TODO Auto-generated method stub
		return goodsAttrMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsAttrService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer goodsAttrId) {
		// TODO Auto-generated method stub
		return goodsAttrMapper.deleteByPrimaryKey(goodsAttrId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsAttrService#updateByExample(com.wuyou.entity.GoodsAttr, com.wuyou.entity.GoodsAttrExample)
	 */
	@Override
	public int updateByExample(GoodsAttr record, GoodsAttrExample example) {
		// TODO Auto-generated method stub
		return goodsAttrMapper.updateByExample(record, example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsAttrService#selectByExample(com.wuyou.entity.GoodsAttrExample)
	 */
	@Override
	public List<GoodsAttr> selectByExample(GoodsAttrExample example) {
		// TODO Auto-generated method stub
		return goodsAttrMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsAttrService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public GoodsAttr selectByPrimaryKey(Integer goodsAttrId) {
		// TODO Auto-generated method stub
		return goodsAttrMapper.selectByPrimaryKey(goodsAttrId);
	}

}
