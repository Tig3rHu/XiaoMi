/**  
* <p>Title: GoodsActivityServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.GoodsActivityMapper;
import com.wuyou.entity.GoodsActivity;
import com.wuyou.entity.GoodsActivityExample;
import com.wuyou.entity.GoodsActivityWithBLOBs;
import com.wuyou.service.GoodsActivityService;

/**
 * @author 吴优
 * desciption:商品活动
 * other:
 * @date 2018年9月21日 
 */
@Service
public class GoodsActivityServiceImpl implements GoodsActivityService {
    
	@Autowired
	private GoodsActivityMapper goodsActivityMapper;
	
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsActivityService#insert(com.wuyou.entity.GoodsActivityWithBLOBs)
	 */
	@Override
	public int insert(GoodsActivityWithBLOBs record) {
		// TODO Auto-generated method stub
		return goodsActivityMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsActivityService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer actId) {
		// TODO Auto-generated method stub
		return goodsActivityMapper.deleteByPrimaryKey(actId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsActivityService#deleteByactName(java.lang.String)
	 */
	@Override
	public int deleteByactName(String actName) {
		// TODO Auto-generated method stub
		GoodsActivityExample goodsActivityExample=new GoodsActivityExample();
		GoodsActivityExample.Criteria criteria=goodsActivityExample.createCriteria();
		criteria.andActNameEqualTo(actName);
		return goodsActivityMapper.deleteByExample(goodsActivityExample);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsActivityService#updateByExampleSelective(com.wuyou.entity.GoodsActivityWithBLOBs, com.wuyou.entity.GoodsActivityExample)
	 */
	@Override
	public int updateByExampleSelective(GoodsActivityWithBLOBs record,
			GoodsActivityExample example) {
		// TODO Auto-generated method stub
		return goodsActivityMapper.updateByExample(record, example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsActivityService#selectByExample(com.wuyou.entity.GoodsActivityExample)
	 */
	@Override
	public List<GoodsActivity> selectByExample(GoodsActivityExample example) {
		// TODO Auto-generated method stub
		return goodsActivityMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsActivityService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public GoodsActivityWithBLOBs selectByPrimaryKey(Integer actId) {
		// TODO Auto-generated method stub
		return goodsActivityMapper.selectByPrimaryKey(actId);
	}

}
