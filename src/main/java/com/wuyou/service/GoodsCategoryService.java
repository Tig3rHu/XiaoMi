/**  
* <p>Title: GoodsCategoryService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wuyou.entity.GoodsCategory;
import com.wuyou.entity.GoodsCategoryExample;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
public interface GoodsCategoryService {
     
	int insert(GoodsCategory record);
	
	int deleteByPrimaryKey(Short id);
	
	int updateByExample(@Param("record") GoodsCategory record, @Param("example") GoodsCategoryExample example);

	List<GoodsCategory> selectByExample(GoodsCategoryExample example);

    GoodsCategory selectByPrimaryKey(Short id);
    
    int updateByPrimaryKey(GoodsCategory record);

}
