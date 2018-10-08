/**  
* <p>Title: PickUpService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.PickUp;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
public interface PickUpService {
     
	public int insert(PickUp pickUp);
	
	public int deletePickUpByPickUpId(Integer pickupId);
	
	public int updatePickUpById(Integer pickupId,PickUp pickUp);
	
	public PickUp findPickUpById(Integer pickupId);
	
	public List<PickUp> findPickUpAll();
	
}
