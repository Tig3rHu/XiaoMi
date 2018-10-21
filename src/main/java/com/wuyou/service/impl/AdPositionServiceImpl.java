/**  
* <p>Title: AdPositionServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月20日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wuyou.dao.AdPositionMapper;
import com.wuyou.entity.AdPosition;
import com.wuyou.entity.AdPositionExample;
import com.wuyou.service.AdPositionService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月20日 
 */
@Service
public class AdPositionServiceImpl implements AdPositionService {
	
	private AdPositionMapper adPostionMapper;
	/* (non-Javadoc)
	 * @see com.wuyou.service.AdPositionService#insert(com.wuyou.entity.AdPosition)
	 * 添加AdPostion
	 */
	@Override
	public int insert(AdPosition record) throws Exception {
		// TODO Auto-generated method stub
		return adPostionMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.AdPositionService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer positionId) throws Exception {
		// TODO Auto-generated method stub
		return adPostionMapper.deleteByPrimaryKey(positionId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.AdPositionService#updateAdPostionByPositionId(java.lang.Integer, com.wuyou.entity.AdPosition)
	 */
	@Override
	public int updateAdPostionByPositionId(AdPosition record)
			throws Exception {
		// TODO Auto-generated method stub
	
		return adPostionMapper.updateByPrimaryKey(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.AdPositionService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public AdPosition selectByPrimaryKey(Integer positionId) {
		// TODO Auto-generated method stub
		return adPostionMapper.selectByPrimaryKey(positionId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.AdPositionService#selectByExample(com.wuyou.entity.AdPositionExample)
	 */
	@Override
	public List<AdPosition> selectByExample(AdPositionExample example) {
		// TODO Auto-generated method stub
		return adPostionMapper.selectByExample(example);
	}

}
