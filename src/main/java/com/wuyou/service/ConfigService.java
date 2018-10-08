/**  
* <p>Title: ConfigService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service;

import com.wuyou.entity.Config;

/**
 * @author 吴优
 * desciption:配置
 * other:
 * @date 2018年9月21日 
 */
public interface ConfigService {
     
	int insert(Config record);
	
	int deleteByPrimaryKey(Short id);
	
	int updateByPrimaryKey(Short id,Config config);
	
	Config selectByPrimaryKey(Short id);


	
	
}
