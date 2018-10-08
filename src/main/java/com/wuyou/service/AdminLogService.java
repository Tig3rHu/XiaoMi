/**  
* <p>Title: AdminLogService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月20日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.AdminLog;
import com.wuyou.entity.AdminLogExample;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月20日 
 */
public interface AdminLogService {
    /**
     * 管理员登录信息插入
     * @param record
     * @return
     */
	public int insert(AdminLog record);
	/**
	 * 根据logid删除管理员登录信息
	 * @param logId
	 * @return
	 */
	public int deleteByPrimaryKey(Long logId);
    /**
     * 根据管理员id删除登录信息
     * @param adminId
     * @return
     */
    public int deleteByAdminId(Integer adminId);
    /**
     * 根据管理员id查询登录信息
     * @param adminId
     * @return
     */
    public AdminLog selectByAdminId(Integer adminId);

    List<AdminLog> selectByExample(AdminLogExample example);
}
