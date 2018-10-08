/**  
* <p>Title: ConfigServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.ConfigMapper;
import com.wuyou.entity.Config;
import com.wuyou.service.ConfigService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月21日 
 */
@Service
public class ConfigServiceImpl implements ConfigService {
     
	@Autowired
	private ConfigMapper configMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.ConfigService#insert(com.wuyou.entity.Config)
	 */
	@Override
	public int insert(Config record) {
		// TODO Auto-generated method stub
		return configMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ConfigService#deleteByPrimaryKey(java.lang.Short)
	 */
	@Override
	public int deleteByPrimaryKey(Short id) {
		// TODO Auto-generated method stub
		return configMapper.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ConfigService#selectByPrimaryKey(java.lang.Short)
	 */
	@Override
	public Config selectByPrimaryKey(Short id) {
		// TODO Auto-generated method stub
		return configMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ConfigService#updateByPrimaryKey(java.lang.Short)
	 */
	@Override
	public int updateByPrimaryKey(Short id,Config config) {
		// TODO Auto-generated method stub
		config.setId(id);
		return configMapper.updateByPrimaryKey(config);
	}

}
