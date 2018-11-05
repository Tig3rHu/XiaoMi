/**  
* <p>Title: SystemModuleVo.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年10月22日  
* @version 1.0  
*/
package com.wuyou.entity;

import java.util.List;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年10月22日 
 */
public class SystemModuleVo extends SystemModule{
    
	
	public List<SystemModule> children;

	public List<SystemModule> getChildren() {
		return children;
	}

	public void setChildren(List<SystemModule> children) {
		this.children = children;
	}
	
}
