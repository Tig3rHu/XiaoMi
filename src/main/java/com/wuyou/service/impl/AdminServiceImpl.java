/**  
* <p>Title: AdminServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月20日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.AdminMapper;
import com.wuyou.entity.Admin;
import com.wuyou.entity.AdminExample;
import com.wuyou.service.AdminService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月20日 
 */
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper adminMapper;
	/* (non-Javadoc)
	 * @see com.wuyou.service.AdminService#insertAdmin(com.wuyou.entity.Admin)
	 */
	@Override
	public int insertAdmin(Admin admin) throws Exception {
		// TODO Auto-generated method stub
		return adminMapper.insert(admin);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.AdminService#deteteAdminById(java.lang.Short)
	 */
	@Override
	public int deteteAdminById(Short adminId) throws Exception {
		// TODO Auto-generated method stub
		return adminMapper.deleteByPrimaryKey(adminId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.AdminService#changePassword(java.lang.String, java.lang.String, java.lang.Short)
	 */
	@Override
	public int changePassword(String newpassword, String oldpassword,
			Short adminId) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.AdminService#resetPassword(java.lang.String, java.lang.Short)
	 */
	@Override
	public int resetPassword(String password, Short adminId) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.AdminService#updateByExample(com.wuyou.entity.Admin, com.wuyou.entity.AdminExample)
	 */
	@Override
	public int updateByExample(Admin record, AdminExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.AdminService#findAdminById(java.lang.Short)
	 */
	@Override
	public Admin findAdminById(Short adminId) throws Exception {
		// TODO Auto-generated method stub
		return adminMapper.selectByPrimaryKey(adminId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.AdminService#queryAdminsList(com.wuyou.entity.AdminExample)
	 */
	@Override
	public List<Admin> queryAdminsList(AdminExample adminExample)
			throws Exception {
		// TODO Auto-generated method stub		
		/*AdminExample.Criteria criteria=adminExample.createCriteria();
		criteria.andCityIdEqualTo();*/
		return adminMapper.selectByExample(adminExample);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.AdminService#login(java.lang.String, java.lang.String)
	 */
	@Override
	public Admin login(String userName, String password) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
