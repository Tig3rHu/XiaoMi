/**  
* <p>Title: GoodsConsultServiceImpl.java</p>  
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
import com.wuyou.dao.GoodsConsultMapper;
import com.wuyou.entity.GoodsConsult;
import com.wuyou.entity.GoodsConsultExample;
import com.wuyou.entity.GoodsConsultVo;
import com.wuyou.service.GoodsConsultService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class GoodsConsultServiceImpl implements GoodsConsultService {
    
	@Autowired
	private GoodsConsultMapper goodsConsultMapper;
	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsConsultService#insert(com.wuyou.entity.GoodsConsult)
	 */
	@Override
	public int insert(GoodsConsult record) {
		// TODO Auto-generated method stub
		return goodsConsultMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsConsultService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return goodsConsultMapper.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsConsultService#updateByExample(com.wuyou.entity.GoodsConsult, com.wuyou.entity.GoodsConsultExample)
	 */
	@Override
	public int updateByExample(GoodsConsult record, GoodsConsultExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsConsultService#selectByExample(com.wuyou.entity.GoodsConsultExample)
	 */
	@Override
	public List<GoodsConsult> selectByExample(GoodsConsultExample example) {
		// TODO Auto-generated method stub
		return goodsConsultMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsConsultService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public GoodsConsult selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return goodsConsultMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsConsultService#updateByPrimaryKey(com.wuyou.entity.GoodsConsult)
	 */
	@Override
	public int updateByPrimaryKey(GoodsConsultVo record) {
		// TODO Auto-generated method stub
		return goodsConsultMapper.updateByPrimaryKey(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsConsultService#goodsConsultAndgoods()
	 */
	@Override
	public List<GoodsConsultVo> goodsConsultAndgoods() {
		// TODO Auto-generated method stub
		return goodsConsultMapper.goodsConsultAndgoods();
	}

}
