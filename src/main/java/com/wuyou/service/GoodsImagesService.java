/**  
* <p>Title: GoodsImagesService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.GoodsImages;
import com.wuyou.entity.GoodsImagesExample;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
public interface GoodsImagesService {
      
	int insert(GoodsImages record);
	
	int deleteByPrimaryKey(Integer imgId);
	
	List<GoodsImages> selectByExample(GoodsImagesExample example);

	GoodsImages selectByPrimaryKey(Integer imgId);

	
	
	
}
