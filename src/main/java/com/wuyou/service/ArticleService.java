/**  
* <p>Title: ArticleService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月20日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.Article;
import com.wuyou.entity.ArticleExample;
import com.wuyou.entity.ArticleWithBLOBs;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月20日 
 */
public interface ArticleService {
    
	public ArticleWithBLOBs selectByPrimaryKey(Integer articleId);
	/**
	 * 根据articleId查询title
	 * @param articleId
	 * @return
	 */
	public List<Article> selectTitleByArticleId(Integer articleId);
	
	public List<ArticleWithBLOBs> selectByExampleWithBLOBs(ArticleExample example);

	public List<Article> selectByExample(ArticleExample example);
	
	public  int deleteByPrimaryKey(Integer articleId);
    
	int updateByPrimaryKey(Article record);
	
	int insert(ArticleWithBLOBs record);
}
