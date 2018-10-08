/**  
* <p>Title: DeliveryDocService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.DeliveryDoc;
import com.wuyou.entity.DeliveryDocExample;

/**
 * @author 吴优
 * desciption:订单+用户+物流
 * other:
 * @date 2018年9月21日 
 */
public interface DeliveryDocService {
   
	public int insert(DeliveryDoc record);
	
	public int update(DeliveryDoc record,Integer id);
	
	 List<DeliveryDoc> selectByExample(DeliveryDocExample example);

	 DeliveryDoc selectByPrimaryKey(Integer id);
}
