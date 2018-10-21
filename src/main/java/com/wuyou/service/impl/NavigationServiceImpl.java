/**  
* <p>Title: NavigationServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.NavigationMapper;
import com.wuyou.entity.Navigation;
import com.wuyou.entity.NavigationExample;
import com.wuyou.service.NavigationService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class NavigationServiceImpl implements NavigationService {
    
	@Autowired
	private NavigationMapper navigationMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.NavigationService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return navigationMapper.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.NavigationService#insert(com.wuyou.entity.Navigation)
	 */
	@Override
	public int insert(Navigation record) {
		// TODO Auto-generated method stub
		return navigationMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.NavigationService#findNavigationById(java.lang.Integer)
	 */
	@Override
	public Navigation findNavigationById(Integer id) {
		// TODO Auto-generated method stub
		return navigationMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.NavigationService#selectByExample(com.wuyou.entity.NavigationExample)
	 */
	@Override
	public List<Navigation> selectByExample(NavigationExample example) {
		// TODO Auto-generated method stub
		return navigationMapper.selectByExample(null);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.NavigationService#updateByPrimaryKey(com.wuyou.entity.Navigation)
	 */
	@Override
	public int updateByPrimaryKey(Navigation record) {
		// TODO Auto-generated method stub
		return navigationMapper.updateByPrimaryKey(record);
	}

}
