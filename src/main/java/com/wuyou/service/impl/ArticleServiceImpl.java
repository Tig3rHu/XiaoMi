/**  
* <p>Title: ArticleServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月20日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.ArticleMapper;
import com.wuyou.entity.Article;
import com.wuyou.entity.ArticleExample;
import com.wuyou.entity.ArticleWithBLOBs;
import com.wuyou.service.ArticleService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月20日 
 */
@Service
public class ArticleServiceImpl implements ArticleService {
     
	@Autowired
	private ArticleMapper articleMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.ArticleService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public ArticleWithBLOBs selectByPrimaryKey(Integer articleId) {
		// TODO Auto-generated method stub
		return articleMapper.selectByPrimaryKey(articleId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ArticleService#selectTitleByArticleId(java.lang.Integer)
	 */
	@Override
	public List<Article> selectTitleByArticleId(Integer articleId) {
		// TODO Auto-generated method stub
		ArticleExample articleExample=new ArticleExample();
		ArticleExample.Criteria criteria=articleExample.createCriteria();
		criteria.andArticleIdEqualTo(articleId);
		return articleMapper.selectByExample(articleExample);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ArticleService#selectByExampleWithBLOBs(com.wuyou.entity.ArticleExample)
	 */
	@Override
	public List<ArticleWithBLOBs> selectByExampleWithBLOBs(
			ArticleExample example) {
		// TODO Auto-generated method stub
		return articleMapper.selectByExampleWithBLOBs(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ArticleService#selectByExample(com.wuyou.entity.ArticleExample)
	 */
	@Override
	public List<Article> selectByExample(ArticleExample example) {
		// TODO Auto-generated method stub
		return articleMapper.selectByExample(example);
	}

}
