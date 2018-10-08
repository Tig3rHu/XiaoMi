/**  
* <p>Title: FeedbackService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.Feedback;
import com.wuyou.entity.FeedbackExample;

/**
 * @author 吴优
 * desciption:留言
 * other:
 * @date 2018年9月21日 
 */
public interface FeedbackService {
    
	public int insert(Feedback record);
	
	public int deleteByPrimaryKey(Integer msgId);
	
	public int updateById(Integer msgId,Feedback record);
	
	public List<Feedback> selectByExample(FeedbackExample example);

	public Feedback selectByPrimaryKey(Integer msgId);
}
