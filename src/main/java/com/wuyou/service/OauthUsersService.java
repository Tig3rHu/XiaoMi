/**  
* <p>Title: OauthUsersService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.OauthUsers;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
public interface OauthUsersService {

	public int insertOauthUser(OauthUsers oauthUsers);
	
	public int deleteById(Integer tuId);
	
	public List<OauthUsers> findAll();
	
	public OauthUsers findById(Integer tuId);
}
