/**  
* <p>Title: GoodsConsultService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wuyou.entity.GoodsConsult;
import com.wuyou.entity.GoodsConsultExample;

/**
 * @author 吴优
 * desciption:商品咨询
 * other:
 * @date 2018年9月22日 
 */
public interface GoodsConsultService {
    
	int insert(GoodsConsult record);
	
	 int deleteByPrimaryKey(Integer id);
	 
	 int updateByExample(@Param("record") GoodsConsult record, @Param("example") GoodsConsultExample example);
     
	 List<GoodsConsult> selectByExample(GoodsConsultExample example);

	    GoodsConsult selectByPrimaryKey(Integer id);

	
	
}
