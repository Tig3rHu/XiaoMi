/**  
* <p>Title: ArticleCat2ServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月20日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.ArticleCat2Mapper;
import com.wuyou.entity.ArticleCat2;
import com.wuyou.service.ArticleCat2Service;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月20日 
 */
@Service
public class ArticleCat2ServiceImpl implements ArticleCat2Service {
	@Autowired
	private ArticleCat2Mapper articleCat2Mapper;

	/* (non-Javadoc)
	 * @see com.wuyou.service.ArticleCat2Service#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public ArticleCat2 selectByPrimaryKey(Integer catId) {
		// TODO Auto-generated method stub
		return articleCat2Mapper.selectByPrimaryKey(catId);
	}

}
