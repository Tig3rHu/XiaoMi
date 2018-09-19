package com.wuyou.dao;

import com.wuyou.entity.TeamLottery;
import com.wuyou.entity.TeamLotteryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamLotteryMapper {
    int countByExample(TeamLotteryExample example);

    int deleteByExample(TeamLotteryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TeamLottery record);

    int insertSelective(TeamLottery record);

    List<TeamLottery> selectByExample(TeamLotteryExample example);

    TeamLottery selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TeamLottery record, @Param("example") TeamLotteryExample example);

    int updateByExample(@Param("record") TeamLottery record, @Param("example") TeamLotteryExample example);

    int updateByPrimaryKeySelective(TeamLottery record);

    int updateByPrimaryKey(TeamLottery record);
}