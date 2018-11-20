/**  
* <p>Title: List1.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年11月13日  
* @version 1.0  
*/
package com.wuyou.entity;

import java.util.List;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年11月13日 
 */
public class List1 {
      private List<RecommendImg> recommendImg;
      
      private List<TVImg> tvImg;

	public List<RecommendImg> getRecommendImg() {
		return recommendImg;
	}

	public void setRecommendImg(List<RecommendImg> recommendImg) {
		this.recommendImg = recommendImg;
	}

	public List<TVImg> getTvImg() {
		return tvImg;
	}

	public void setTvImg(List<TVImg> tvImg) {
		this.tvImg = tvImg;
	}

	
}  
