/**  
* <p>Title: SystemModuleService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年10月22日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.SystemModule;
import com.wuyou.entity.SystemModuleExample;
import com.wuyou.entity.SystemModuleVo;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年10月22日 
 */
public interface SystemModuleService {
     
	public List<SystemModule> querySystemModuleList(SystemModuleExample systemModukeExample);
	/**
	 * 根据modId查找信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public SystemModule findSystemModuleById(Short modId) throws Exception;
	/**
	 * 根据modId删除
	 * @param modId
	 * @return
	 * @throws Exception
	 */
	public int deleteSystemModuleById(Short modId) throws Exception;
	/**
	 * 根据modId更新信息
	 * @param id
	 * @param systemModule
	 * @return
	 * @throws Exception
	 */
	public int updateSystemModuleById(Short modId,SystemModule systemModule) throws Exception;
	/**
	 * 添加
	 * @param systemModule
	 * @return
	 * @throws Exception
	 */
	public int insertSystemModule(SystemModule systemModule) throws Exception;
	/**
	 * 根据父类parentId查找对应的配置信息
	 * @param systemModule
	 * @return
	 * @throws Exception
	 */
	public List<SystemModuleVo> findSystemModuleVo(Short parentId) throws Exception;
	
	public List<SystemModule> querySystemModuleListByParentId(Short parentId);
	
}
