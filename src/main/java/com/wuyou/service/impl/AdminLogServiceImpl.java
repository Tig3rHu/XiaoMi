/**  
* <p>Title: AdminLogServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月20日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.AdminLogMapper;
import com.wuyou.entity.AdminExample;
import com.wuyou.entity.AdminLog;
import com.wuyou.entity.AdminLogExample;
import com.wuyou.service.AdminLogService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月20日 
 */
@Service
public class AdminLogServiceImpl implements AdminLogService {
    @Autowired
    private AdminLogMapper adminLogMapper; 
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.AdminLogService#insert(com.wuyou.entity.AdminLog)
	 */
	@Override
	public int insert(AdminLog record) {
		// TODO Auto-generated method stub
		return adminLogMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.AdminLogService#deleteByPrimaryKey(java.lang.Long)
	 */
	@Override
	public int deleteByPrimaryKey(Long logId) {
		// TODO Auto-generated method stub
		return adminLogMapper.deleteByPrimaryKey(logId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.AdminLogService#deleteByAdminId(java.lang.Integer)
	 */
	@Override
	public int deleteByAdminId(Integer adminId) {
		// TODO Auto-generated method stub
		AdminLogExample adminExample=new AdminLogExample();
		AdminLogExample.Criteria criteria=adminExample.createCriteria();
		criteria.andAdminIdEqualTo(adminId);
		
		return adminLogMapper.deleteByExample(adminExample);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.AdminLogService#selectByAdminId(java.lang.Integer)
	 */
	@Override
	public AdminLog selectByAdminId(Integer adminId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.AdminLogService#selectByExample(com.wuyou.entity.AdminLogExample)
	 */
	@Override
	public List<AdminLog> selectByExample(AdminLogExample example) {
		// TODO Auto-generated method stub
		
		return adminLogMapper.selectByExample(example);
	}

}
