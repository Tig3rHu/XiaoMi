/**  
* <p>Title: GoodsAttrService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wuyou.entity.GoodsAttr;
import com.wuyou.entity.GoodsAttrExample;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
public interface GoodsAttrService {
     
	int insert(GoodsAttr record);
	
	int deleteByPrimaryKey(Integer goodsAttrId);
    
	int updateByExample(@Param("record") GoodsAttr record, @Param("example") GoodsAttrExample example);

    List<GoodsAttr> selectByExample(GoodsAttrExample example);

    GoodsAttr selectByPrimaryKey(Integer goodsAttrId);

	
	
}
