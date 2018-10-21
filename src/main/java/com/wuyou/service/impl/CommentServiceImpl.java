/**  
* <p>Title: CommentServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.CommentMapper;
import com.wuyou.entity.Comment;
import com.wuyou.entity.CommentExample;
import com.wuyou.entity.CommentWithBLOBs;
import com.wuyou.service.CommentService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月21日 
 */
@Service
public class CommentServiceImpl implements CommentService {
    
	@Autowired
	private CommentMapper commentMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.CommentService#insert(com.wuyou.entity.CommentWithBLOBs)
	 */
	@Override
	public int insert(CommentWithBLOBs record) {
		// TODO Auto-generated method stub
		return commentMapper.insert(record);
	}

	

	/* (non-Javadoc)
	 * @see com.wuyou.service.CommentService#selectByExample(com.wuyou.entity.CommentExample)
	 */
	@Override
	public List<Comment> selectByExample(CommentExample example) {
		// TODO Auto-generated method stub
		return commentMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.CommentService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public CommentWithBLOBs selectByPrimaryKey(Integer commentId) {
		// TODO Auto-generated method stub
		return commentMapper.selectByPrimaryKey(commentId);
	}



	/* (non-Javadoc)
	 * @see com.wuyou.service.CommentService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer commentId) {
		// TODO Auto-generated method stub
		return commentMapper.deleteByPrimaryKey(commentId);
	}



	/* (non-Javadoc)
	 * @see com.wuyou.service.CommentService#updateByPrimaryKeyWithBLOBs(com.wuyou.entity.CommentWithBLOBs)
	 */
	@Override
	public int updateByPrimaryKeyWithBLOBs(CommentWithBLOBs record) {
		// TODO Auto-generated method stub
		return commentMapper.updateByPrimaryKeyWithBLOBs(record);
	}



	/* (non-Javadoc)
	 * @see com.wuyou.service.CommentService#selectByExampleWithBLOBs(com.wuyou.entity.CommentExample)
	 */
	@Override
	public List<CommentWithBLOBs> selectByExampleWithBLOBs(
			CommentExample example) {
		// TODO Auto-generated method stub
		return commentMapper.selectByExampleWithBLOBs(example);
	}



	/* (non-Javadoc)
	 * @see com.wuyou.service.CommentService#selectcommentAndGoods()
	 */
	@Override
	public List<CommentWithBLOBs> selectcommentAndGoods() {
		// TODO Auto-generated method stub
		return commentMapper.selectcommentAndGoods();
	}

}
