/**  
* <p>Title: FeedBackServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.FeedbackMapper;
import com.wuyou.entity.Feedback;
import com.wuyou.entity.FeedbackExample;
import com.wuyou.service.FeedbackService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月21日 
 */
@Service
public class FeedBackServiceImpl implements FeedbackService {
    
	@Autowired
	private FeedbackMapper feedBackMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.FeedbackService#insert(com.wuyou.entity.Feedback)
	 */
	@Override
	public int insert(Feedback record) {
		// TODO Auto-generated method stub
		return feedBackMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.FeedbackService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer msgId) {
		// TODO Auto-generated method stub
		return feedBackMapper.deleteByPrimaryKey(msgId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.FeedbackService#updateById(java.lang.Integer, com.wuyou.entity.Feedback)
	 */
	@Override
	public int updateById(Integer msgId, Feedback record) {
		// TODO Auto-generated method stub
		record.setMsgId(msgId);
		return feedBackMapper.updateByPrimaryKey(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.FeedbackService#selectByExample(com.wuyou.entity.FeedbackExample)
	 */
	@Override
	public List<Feedback> selectByExample(FeedbackExample example) {
		// TODO Auto-generated method stub
		return feedBackMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.FeedbackService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public Feedback selectByPrimaryKey(Integer msgId) {
		// TODO Auto-generated method stub
		return feedBackMapper.selectByPrimaryKey(msgId);
	}

}
