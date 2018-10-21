/**  
* <p>Title: ArticleCatService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月20日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.ArticleCat;
import com.wuyou.entity.ArticleCatExample;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月20日 
 */
public interface ArticleCatService {
    /**
     * 
     * @param catId
     * @return
     */
	public ArticleCat selectByPrimaryKey(Integer catId);
	
	
	List<ArticleCat> selectByExample(ArticleCatExample example);
	
	int updateByPrimaryKey(ArticleCat record);
	
	 int insert(ArticleCat record);
	
	 int deleteByPrimaryKey(Integer catId);
}
