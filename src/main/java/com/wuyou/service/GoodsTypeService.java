/**  
* <p>Title: GoodsTypeService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.GoodsType;
import com.wuyou.entity.GoodsTypeExample;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
public interface GoodsTypeService {
     
	int deleteByPrimaryKey(Short id);

    int insert(GoodsType record);
    
    int updateGoodsTypeById(Short id,GoodsType record);
	
	public GoodsType selectByID(Short id);
	
	  List<GoodsType> selectByExample(GoodsTypeExample example);

}
