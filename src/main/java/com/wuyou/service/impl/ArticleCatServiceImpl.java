/**  
* <p>Title: ArticleCatServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月20日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.ArticleCatMapper;
import com.wuyou.entity.ArticleCat;
import com.wuyou.service.ArticleCatService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月20日 
 */
@Service
public class ArticleCatServiceImpl implements ArticleCatService {
    
	@Autowired
	private ArticleCatMapper articleCatMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.ArticleCatService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public ArticleCat selectByPrimaryKey(Integer catId) {
		// TODO Auto-generated method stub
		return articleCatMapper.selectByPrimaryKey(catId);
	}

}
