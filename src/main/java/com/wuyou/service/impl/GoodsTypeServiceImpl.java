/**  
* <p>Title: GoodsTypeServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.GoodsTypeMapper;
import com.wuyou.entity.GoodsType;
import com.wuyou.entity.GoodsTypeExample;
import com.wuyou.service.GoodsTypeService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
    
	@Autowired
	private GoodsTypeMapper goodsTypeMapper;
	
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsTypeService#deleteByPrimaryKey(java.lang.Short)
	 */
	@Override
	public int deleteByPrimaryKey(Short id) {
		// TODO Auto-generated method stub
		return goodsTypeMapper.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsTypeService#insert(com.wuyou.entity.GoodsType)
	 */
	@Override
	public int insert(GoodsType record) {
		// TODO Auto-generated method stub
		return goodsTypeMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsTypeService#updateGoodsTypeById(java.lang.Short, com.wuyou.entity.GoodsType)
	 */
	@Override
	public int updateGoodsTypeById(Short id, GoodsType record) {
		// TODO Auto-generated method stub
		record.setId(id);
		return goodsTypeMapper.updateByPrimaryKey(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsTypeService#selectByID(java.lang.Short)
	 */
	@Override
	public GoodsType selectByID(Short id) {
		// TODO Auto-generated method stub
		return goodsTypeMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsTypeService#selectByExample(com.wuyou.entity.GoodsTypeExample)
	 */
	@Override
	public List<GoodsType> selectByExample(GoodsTypeExample example) {
		// TODO Auto-generated method stub
		return goodsTypeMapper.selectByExample(example);
	}

}
