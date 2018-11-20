/**  
* <p>Title: ImgPcService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年11月17日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wuyou.entity.ImgPcVo;
import com.wuyou.entity.Imgpc;
import com.wuyou.entity.ImgpcExample;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年11月17日 
 */
public interface ImgPcService {
	int countByExample(ImgpcExample example);

    int deleteByExample(ImgpcExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Imgpc record);

    int insertSelective(Imgpc record);

    List<Imgpc> selectByExample(ImgpcExample example);

    Imgpc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Imgpc record, @Param("example") ImgpcExample example);

    int updateByExample(@Param("record") Imgpc record, @Param("example") ImgpcExample example);

    int updateByPrimaryKeySelective(Imgpc record);

    int updateByPrimaryKey(Imgpc record);
    
    public List<ImgPcVo> findimgPcVo(Integer parentId);
    public List<Imgpc> queryImgPcByParentID(Integer parentId);

}
