/**  
* <p>Title: PromOrderSevice.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.PromOrder;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
public interface PromOrderService {
     
	public int insert(PromOrder promOrder);
	
	public int deletePromOrderById(Long id);
	
	public int updatePromOrderById(Long id,PromOrder promOrder);
	
	public PromOrder findPromOrderById(Long id);
	
	public List<PromOrder> findPromOrderAll();
	
	
	
	
}
