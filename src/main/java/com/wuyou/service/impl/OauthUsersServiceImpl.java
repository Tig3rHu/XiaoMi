/**  
* <p>Title: OauthUsersServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.OauthUsersMapper;
import com.wuyou.entity.OauthUsers;
import com.wuyou.entity.OauthUsersExample;
import com.wuyou.service.OauthUsersService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class OauthUsersServiceImpl implements OauthUsersService {
    
	@Autowired
	private OauthUsersMapper oauthUsersMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.OauthUsersService#insertOauthUser(com.wuyou.entity.OauthUsers)
	 */
	@Override
	public int insertOauthUser(OauthUsers oauthUsers) {
		// TODO Auto-generated method stub
		return oauthUsersMapper.insert(oauthUsers);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.OauthUsersService#deleteById(java.lang.Integer)
	 */
	@Override
	public int deleteById(Integer tuId) {
		// TODO Auto-generated method stub
		return oauthUsersMapper.deleteByPrimaryKey(tuId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.OauthUsersService#findAll()
	 */
	@Override
	public List<OauthUsers> findAll() {
		// TODO Auto-generated method stub
		OauthUsersExample OauthUsersExample=new OauthUsersExample();
		
		return oauthUsersMapper.selectByExample(OauthUsersExample);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.OauthUsersService#findById(java.lang.Integer)
	 */
	@Override
	public OauthUsers findById(Integer tuId) {
		// TODO Auto-generated method stub
		return oauthUsersMapper.selectByPrimaryKey(tuId);
	}

}
