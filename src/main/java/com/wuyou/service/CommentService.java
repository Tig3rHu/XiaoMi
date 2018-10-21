/**  
* <p>Title: CommentService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.Comment;
import com.wuyou.entity.CommentExample;
import com.wuyou.entity.CommentWithBLOBs;

/**
 * @author 吴优
 * desciption:商品评论信息
 * other:
 * @date 2018年9月21日 
 */
public interface CommentService {
    /**
     * 添加评论
     * @param record
     * @return
     */
	public int insert(CommentWithBLOBs record);
	/**
	 * 删除评论
	 * @param commentId
	 * @return
	 */
	public int deleteByPrimaryKey(Integer commentId);
    /**
     * 更新评论
     * @param record
     * @param commentId
     * @return
     */
    public int updateByPrimaryKeyWithBLOBs(CommentWithBLOBs record);
    /**
     * 查找
     * @param example
     * @return
     */
    List<Comment> selectByExample(CommentExample example);
    CommentWithBLOBs selectByPrimaryKey(Integer commentId);
    
    List<CommentWithBLOBs> selectByExampleWithBLOBs(CommentExample example);

    List<CommentWithBLOBs> selectcommentAndGoods();
}
