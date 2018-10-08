/**  
* <p>Title: NavigationService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service;

import com.wuyou.entity.Navigation;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
public interface NavigationService {
     
	
	
	int deleteByPrimaryKey(Integer id);

    int insert(Navigation record);
    
    public Navigation findNavigationById(Integer id);
	
	
}
