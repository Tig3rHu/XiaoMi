/**  
* <p>Title: SystemModuleApiController.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年10月26日  
* @version 1.0  
*/
package com.wuyou.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wuyou.entity.SystemModule;
import com.wuyou.entity.SystemModuleVo;
import com.wuyou.service.SystemModuleService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年10月26日 
 */
@RestController
@RequestMapping("/api")
public class SystemModuleApiController {
	
	@Autowired
	private SystemModuleService systemModuleService;
	@RequestMapping("/getchildren/{modId}")
	public List<SystemModuleVo> getChildren(@PathVariable("modId") Short modId) throws Exception{
		
		List<SystemModuleVo> sysMenus=systemModuleService.findSystemModuleVo(modId);
		
		
		return sysMenus;
	}

}
