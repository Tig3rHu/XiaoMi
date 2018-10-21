package com.wuyou.dao;

import com.wuyou.entity.Comment;
import com.wuyou.entity.CommentExample;
import com.wuyou.entity.CommentWithBLOBs;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CommentMapper {
    int countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    int deleteByPrimaryKey(Integer commentId);

    int insert(CommentWithBLOBs record);

    int insertSelective(CommentWithBLOBs record);

    List<CommentWithBLOBs> selectByExampleWithBLOBs(CommentExample example);

    List<Comment> selectByExample(CommentExample example);

    CommentWithBLOBs selectByPrimaryKey(Integer commentId);
    
    List<CommentWithBLOBs> selectcommentAndGoods();

    int updateByExampleSelective(@Param("record") CommentWithBLOBs record, @Param("example") CommentExample example);

    int updateByExampleWithBLOBs(@Param("record") CommentWithBLOBs record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(CommentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CommentWithBLOBs record);

    int updateByPrimaryKey(Comment record);
}