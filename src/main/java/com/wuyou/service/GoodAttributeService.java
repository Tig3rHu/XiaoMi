/**  
* <p>Title: GoodAttributeService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wuyou.entity.GoodsAttribute;
import com.wuyou.entity.GoodsAttributeExample;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
public interface GoodAttributeService {
     
	int insert(GoodsAttribute record);
	
	int deleteByPrimaryKey(Integer attrId);
	
	 int updateByExample(@Param("record") GoodsAttribute record, @Param("example") GoodsAttributeExample example);
 
	 GoodsAttribute selectByPrimaryKey(Integer attrId);

	 List<GoodsAttribute> selectByExampleWithBLOBs(GoodsAttributeExample example);
	 
	 int updateByPrimaryKey(GoodsAttribute record);
}
