/**  
* <p>Title: GoodsCategoryServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.GoodsCategoryMapper;
import com.wuyou.entity.GoodsCategory;
import com.wuyou.entity.GoodsCategoryExample;
import com.wuyou.service.GoodsCategoryService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class GoodsCategoryServiceImpl implements GoodsCategoryService {
    
	@Autowired
	private  GoodsCategoryMapper goodsCategoryMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsCategoryService#insert(com.wuyou.entity.GoodsCategory)
	 */
	@Override
	public int insert(GoodsCategory record) {
		// TODO Auto-generated method stub
		return goodsCategoryMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsCategoryService#deleteByPrimaryKey(java.lang.Short)
	 */
	@Override
	public int deleteByPrimaryKey(Short id) {
		// TODO Auto-generated method stub
		return goodsCategoryMapper.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsCategoryService#updateByExample(com.wuyou.entity.GoodsCategory, com.wuyou.entity.GoodsCategoryExample)
	 */
	@Override
	public int updateByExample(GoodsCategory record,
			GoodsCategoryExample example) {
		// TODO Auto-generated method stub
		return goodsCategoryMapper.updateByExample(record, example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsCategoryService#selectByExample(com.wuyou.entity.GoodsCategoryExample)
	 */
	@Override
	public List<GoodsCategory> selectByExample(GoodsCategoryExample example) {
		// TODO Auto-generated method stub
		return goodsCategoryMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsCategoryService#selectByPrimaryKey(java.lang.Short)
	 */
	@Override
	public GoodsCategory selectByPrimaryKey(Short id) {
		// TODO Auto-generated method stub
		return goodsCategoryMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsCategoryService#updateByPrimaryKey(com.wuyou.entity.GoodsCategory)
	 */
	@Override
	public int updateByPrimaryKey(GoodsCategory record) {
		// TODO Auto-generated method stub
		return goodsCategoryMapper.updateByPrimaryKey(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsCategoryService#selectNameBymobileName(java.lang.String)
	 */
	@Override
	public List<GoodsCategory> selectNameBymobileName(String mobileName) {
		// TODO Auto-generated method stub
		return goodsCategoryMapper.selectNameBymobileName(mobileName);
	}

}
