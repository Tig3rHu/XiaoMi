/**  
* <p>Title: MessageService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.Message;
import com.wuyou.entity.MessageExample;
import com.wuyou.entity.MessageWithBLOBs;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
public interface MessageService {
      
	int deleteByPrimaryKey(Integer messageId);

    int insert(MessageWithBLOBs record);
	
	int updateMessageByID(Integer messageId,Message message);
	
	 List<Message> selectByExample(MessageExample example);

	 MessageWithBLOBs selectByPrimaryKey(Integer messageId);

	
}
