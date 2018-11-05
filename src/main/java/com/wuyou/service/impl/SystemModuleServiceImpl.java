/**  
* <p>Title: SystemModuleServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年10月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.SystemModuleMapper;
import com.wuyou.entity.SystemModule;
import com.wuyou.entity.SystemModuleExample;
import com.wuyou.entity.SystemModuleVo;
import com.wuyou.service.SystemModuleService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年10月22日 
 */
@Service
public class SystemModuleServiceImpl implements SystemModuleService {
    
	@Autowired
	private SystemModuleMapper systemModuleMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.SystemModuleService#querySystemModuleList(com.wuyou.entity.SystemModuleExample)
	 */
	@Override
	public List<SystemModule> querySystemModuleList(
			SystemModuleExample systemModukeExample) {
		// TODO Auto-generated method stub
		return systemModuleMapper.selectByExample(systemModukeExample);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.SystemModuleService#findSystemModuleById(java.lang.Short)
	 */
	@Override
	public SystemModule findSystemModuleById(Short modId) throws Exception {
		// TODO Auto-generated method stub
		return systemModuleMapper.selectByPrimaryKey(modId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.SystemModuleService#deleteSystemModuleById(java.lang.Short)
	 */
	@Override
	public int deleteSystemModuleById(Short modId) throws Exception {
		// TODO Auto-generated method stub
		return systemModuleMapper.deleteByPrimaryKey(modId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.SystemModuleService#updateSystemModuleById(java.lang.Short, com.wuyou.entity.SystemModule)
	 */
	@Override
	public int updateSystemModuleById(Short modId, SystemModule systemModule)
			throws Exception {
		// TODO Auto-generated method stub
		systemModule.setModId(modId);
		return systemModuleMapper.updateByPrimaryKey(systemModule);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.SystemModuleService#insertSystemModule(com.wuyou.entity.SystemModule)
	 */
	@Override
	public int insertSystemModule(SystemModule systemModule) throws Exception {
		// TODO Auto-generated method stub
		return systemModuleMapper.insert(systemModule);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.SystemModuleService#findSystemModuleVo(java.lang.Short)
	 */
	@Override
	public List<SystemModuleVo> findSystemModuleVo(Short parentId)
			throws Exception {
		// TODO Auto-generated method stub
		List<SystemModuleVo> systemModuleVoList=new ArrayList<SystemModuleVo>();
		//根据parentId查找module的信息
		List<SystemModule> firstSystemModule=querySystemModuleListByParentId(parentId);
		SystemModuleVo systemModuleVo=null;
		//遍历firstSystemModule中的信息
		for(SystemModule systemModule:firstSystemModule){
			systemModuleVo=new SystemModuleVo();
			//得到SystemModule中每个ParentId中信息modId
			Short pId=systemModule.getModId();
			//将所有的systemModul信息复制到systemModule类中
			BeanUtils.copyProperties(systemModule, systemModuleVo);
			//将得到的modId作为查询条件查询信息
			List<SystemModule> systemModuleList=querySystemModuleListByParentId(pId);
		    systemModuleVo.setChildren(systemModuleList);
		    systemModuleVoList.add(systemModuleVo);
		}
		
		return systemModuleVoList;
	}
	@Override
    public List<SystemModule> querySystemModuleListByParentId(Short parentId){
    	SystemModuleExample systemModuleExample=new SystemModuleExample();
    	SystemModuleExample.Criteria criteria1=systemModuleExample.createCriteria();
    	criteria1.andParentIdEqualTo(parentId);
    	List<SystemModule> firstSystemModule=systemModuleMapper.selectByExample(systemModuleExample);
        return firstSystemModule;
    }
}
