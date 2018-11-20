package com.wuyou.dao;

import com.wuyou.entity.Useres;
import com.wuyou.entity.UseresExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UseresMapper {
    int countByExample(UseresExample example);

    int deleteByExample(UseresExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Useres record);

    int insertSelective(Useres record);

    List<Useres> selectByExample(UseresExample example);

    Useres selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Useres record, @Param("example") UseresExample example);

    int updateByExample(@Param("record") Useres record, @Param("example") UseresExample example);

    int updateByPrimaryKeySelective(Useres record);

    int updateByPrimaryKey(Useres record);
}