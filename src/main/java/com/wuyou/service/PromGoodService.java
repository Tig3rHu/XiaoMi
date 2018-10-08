/**  
* <p>Title: PromGoodService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.PromGoods;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
public interface PromGoodService {
     
	public int insert(PromGoods promGoods);
	
	public int deletePromGoodsById(Integer id);
	
	public int updatePromGoodsById(Integer id,PromGoods promGoods);
	
	public PromGoods findPromGoodsById(Integer id);
	
	public List<PromGoods> findPromGoodsAll();
	
	
}
