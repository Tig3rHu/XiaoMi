/**  
* <p>Title: GoodsConsultServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wuyou.entity.GoodsConsult;
import com.wuyou.entity.GoodsConsultExample;
import com.wuyou.service.GoodsConsultService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class GoodsConsultServiceImpl implements GoodsConsultService {

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsConsultService#insert(com.wuyou.entity.GoodsConsult)
	 */
	@Override
	public int insert(GoodsConsult record) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsConsultService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
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
		return null;
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsConsultService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public GoodsConsult selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
