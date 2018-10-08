/**  
* <p>Title: PromGoodsServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.PromGoodsMapper;
import com.wuyou.entity.PromGoods;
import com.wuyou.entity.PromGoodsExample;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class PromGoodsServiceImpl implements PromGoodsMapper {
    
	@Autowired
	private PromGoodsMapper promGoodsMapper;
	
	
	/* (non-Javadoc)
	 * @see com.wuyou.dao.PromGoodsMapper#countByExample(com.wuyou.entity.PromGoodsExample)
	 */
	@Override
	public int countByExample(PromGoodsExample example) {
		// TODO Auto-generated method stub
		return promGoodsMapper.countByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.dao.PromGoodsMapper#deleteByExample(com.wuyou.entity.PromGoodsExample)
	 */
	@Override
	public int deleteByExample(PromGoodsExample example) {
		// TODO Auto-generated method stub
		return promGoodsMapper.deleteByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.dao.PromGoodsMapper#deleteByPrimaryKey(java.lang.Long)
	 */
	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return promGoodsMapper.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.dao.PromGoodsMapper#insert(com.wuyou.entity.PromGoods)
	 */
	@Override
	public int insert(PromGoods record) {
		// TODO Auto-generated method stub
		return promGoodsMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.dao.PromGoodsMapper#insertSelective(com.wuyou.entity.PromGoods)
	 */
	@Override
	public int insertSelective(PromGoods record) {
		// TODO Auto-generated method stub
		return promGoodsMapper.insertSelective(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.dao.PromGoodsMapper#selectByExampleWithBLOBs(com.wuyou.entity.PromGoodsExample)
	 */
	@Override
	public List<PromGoods> selectByExampleWithBLOBs(PromGoodsExample example) {
		// TODO Auto-generated method stub
		return promGoodsMapper.selectByExampleWithBLOBs(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.dao.PromGoodsMapper#selectByExample(com.wuyou.entity.PromGoodsExample)
	 */
	@Override
	public List<PromGoods> selectByExample(PromGoodsExample example) {
		// TODO Auto-generated method stub
		return promGoodsMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.dao.PromGoodsMapper#selectByPrimaryKey(java.lang.Long)
	 */
	@Override
	public PromGoods selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return promGoodsMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.dao.PromGoodsMapper#updateByExampleSelective(com.wuyou.entity.PromGoods, com.wuyou.entity.PromGoodsExample)
	 */
	@Override
	public int updateByExampleSelective(PromGoods record,
			PromGoodsExample example) {
		// TODO Auto-generated method stub
		return promGoodsMapper.updateByPrimaryKey(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.dao.PromGoodsMapper#updateByExampleWithBLOBs(com.wuyou.entity.PromGoods, com.wuyou.entity.PromGoodsExample)
	 */
	@Override
	public int updateByExampleWithBLOBs(PromGoods record,
			PromGoodsExample example) {
		// TODO Auto-generated method stub
		return promGoodsMapper.updateByExampleWithBLOBs(record, example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.dao.PromGoodsMapper#updateByExample(com.wuyou.entity.PromGoods, com.wuyou.entity.PromGoodsExample)
	 */
	@Override
	public int updateByExample(PromGoods record, PromGoodsExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.wuyou.dao.PromGoodsMapper#updateByPrimaryKeySelective(com.wuyou.entity.PromGoods)
	 */
	@Override
	public int updateByPrimaryKeySelective(PromGoods record) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.wuyou.dao.PromGoodsMapper#updateByPrimaryKeyWithBLOBs(com.wuyou.entity.PromGoods)
	 */
	@Override
	public int updateByPrimaryKeyWithBLOBs(PromGoods record) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.wuyou.dao.PromGoodsMapper#updateByPrimaryKey(com.wuyou.entity.PromGoods)
	 */
	@Override
	public int updateByPrimaryKey(PromGoods record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
