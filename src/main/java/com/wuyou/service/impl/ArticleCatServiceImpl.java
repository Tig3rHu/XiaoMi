/**  
* <p>Title: ArticleCatServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月20日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.ArticleCatMapper;
import com.wuyou.entity.ArticleCat;
import com.wuyou.entity.ArticleCatExample;
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

	/* (non-Javadoc)
	 * @see com.wuyou.service.ArticleCatService#selectByExample(com.wuyou.entity.ArticleCatExample)
	 */
	@Override
	public List<ArticleCat> selectByExample(ArticleCatExample example) {
		// TODO Auto-generated method stub
		return articleCatMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ArticleCatService#updateByPrimaryKey(com.wuyou.entity.ArticleCat)
	 */
	@Override
	public int updateByPrimaryKey(ArticleCat record) {
		// TODO Auto-generated method stub
		return articleCatMapper.updateByPrimaryKey(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ArticleCatService#insert(com.wuyou.entity.ArticleCat)
	 */
	@Override
	public int insert(ArticleCat record) {
		// TODO Auto-generated method stub
		return articleCatMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ArticleCatService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer catId) {
		// TODO Auto-generated method stub
		return articleCatMapper.deleteByPrimaryKey(catId);
	}

	
	

}
