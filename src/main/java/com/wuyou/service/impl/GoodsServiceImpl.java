/**  
* <p>Title: GoodsServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.GoodsMapper;
import com.wuyou.entity.Goods;
import com.wuyou.entity.GoodsExample;
import com.wuyou.entity.GoodsVo;
import com.wuyou.entity.GoodsWithBLOBs;
import com.wuyou.service.GoodsService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月21日 
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    
	@Autowired
	private GoodsMapper goddsMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsService#insert(com.wuyou.entity.GoodsWithBLOBs)
	 */
	@Override
	public int insert(GoodsWithBLOBs record) {
		// TODO Auto-generated method stub
		return goddsMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer goodsId) {
		// TODO Auto-generated method stub
		return goddsMapper.deleteByPrimaryKey(goodsId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsService#selectByExample(com.wuyou.entity.GoodsExample)
	 */
	@Override
	public List<Goods> selectByExample(GoodsExample example) {
		// TODO Auto-generated method stub
		return goddsMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public GoodsVo selectByPrimaryKey(Integer goodsId) {
		// TODO Auto-generated method stub
		return goddsMapper.selectByPrimaryKey(goodsId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsService#updateByPrimaryKey(com.wuyou.entity.Goods)
	 */
	@Override
	public int updateByPrimaryKey(Goods record) {
		// TODO Auto-generated method stub
		return goddsMapper.updateByPrimaryKey(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsService#selectByExampleWithBLOBs(com.wuyou.entity.GoodsExample)
	 */
	@Override
	public List<GoodsWithBLOBs> selectByExampleWithBLOBs(GoodsExample example) {
		// TODO Auto-generated method stub
		return goddsMapper.selectByExampleWithBLOBs(null);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsService#updateByPrimaryKeySelective(com.wuyou.entity.GoodsWithBLOBs)
	 */
	@Override
	public int updateByPrimaryKeySelective(GoodsWithBLOBs record) {
		// TODO Auto-generated method stub
		return goddsMapper.updateByPrimaryKeySelective(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsService#goodsVoSelect()
	 */
	@Override
	public List<GoodsVo> goodsVoSelect() {
		// TODO Auto-generated method stub
		return goddsMapper.goodsVoSelect();
	}

}
