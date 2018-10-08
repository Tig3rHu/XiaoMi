/**  
* <p>Title: MessageServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.MessageMapper;
import com.wuyou.entity.Message;
import com.wuyou.entity.MessageExample;
import com.wuyou.entity.MessageWithBLOBs;
import com.wuyou.service.MessageService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class MessageServiceImpl implements MessageService {
    
	@Autowired
	private MessageMapper messageMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.MessageService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer messageId) {
		// TODO Auto-generated method stub
		return messageMapper.deleteByPrimaryKey(messageId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.MessageService#insert(com.wuyou.entity.MessageWithBLOBs)
	 */
	@Override
	public int insert(MessageWithBLOBs record) {
		// TODO Auto-generated method stub
		return messageMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.MessageService#updateMessageByID(java.lang.Integer, com.wuyou.entity.Message)
	 */
	@Override
	public int updateMessageByID(Integer messageId, Message message) {
		// TODO Auto-generated method stub
		message.setMessageId(messageId);
		return messageMapper.updateByPrimaryKey(message);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.MessageService#selectByExample(com.wuyou.entity.MessageExample)
	 */
	@Override
	public List<Message> selectByExample(MessageExample example) {
		// TODO Auto-generated method stub
		return messageMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.MessageService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public MessageWithBLOBs selectByPrimaryKey(Integer messageId) {
		// TODO Auto-generated method stub
		return messageMapper.selectByPrimaryKey(messageId);
	}

}
