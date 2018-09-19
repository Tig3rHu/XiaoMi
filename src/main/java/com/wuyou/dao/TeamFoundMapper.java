package com.wuyou.dao;

import com.wuyou.entity.TeamFound;
import com.wuyou.entity.TeamFoundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamFoundMapper {
    int countByExample(TeamFoundExample example);

    int deleteByExample(TeamFoundExample example);

    int deleteByPrimaryKey(Integer foundId);

    int insert(TeamFound record);

    int insertSelective(TeamFound record);

    List<TeamFound> selectByExample(TeamFoundExample example);

    TeamFound selectByPrimaryKey(Integer foundId);

    int updateByExampleSelective(@Param("record") TeamFound record, @Param("example") TeamFoundExample example);

    int updateByExample(@Param("record") TeamFound record, @Param("example") TeamFoundExample example);

    int updateByPrimaryKeySelective(TeamFound record);

    int updateByPrimaryKey(TeamFound record);
}