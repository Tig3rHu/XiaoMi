/**  
* <p>Title: Admin.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月20日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wuyou.entity.Admin;
import com.wuyou.entity.AdminExample;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月20日 
 */
public interface AdminService {
	/**
	 * 添加用户
	 * @param admin
	 * @return
	 * @throws Exception
	 */
	public int insertAdmin(Admin admin) throws Exception;
	/**
	 * 删除Admin
	 * @param adminId
	 * @return
	 * @throws Exception
	 */
	public int deteteAdminById(Short adminId) throws Exception;
	/**
	 * 修改密码
	 * @param newpassword
	 * @param oldpassword
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public int changePassword(String newpassword,String oldpassword,Short adminId) throws Exception;
   /**
    * 重置密码
    * @param password
    * @param id
    * @return
    * @throws Exception
    */
	public int resetPassword(String password,Short adminId) throws Exception;
    /**
     * 
     * @param record
     * @param example
     * @return
     */
	int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);
    /**
     * 
     * @param id
     * @return
     * @throws Exception
     */
	public Admin findAdminById(Short adminId) throws Exception;
	/**
	 * 
	 * @param adminExample
	 * @return
	 * @throws Exception
	 */
	public List<Admin> queryAdminsList(AdminExample adminExample) throws Exception;
    /**
     * 管理员登录
     * @param name
     * @param password
     * @return
     * @throws Exception
     */
	public Admin login(String userName ,String password) throws Exception;
	
	public Admin findAdminByUserName(String userName);
	
	
}
