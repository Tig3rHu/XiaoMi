/**  
* <p>Title: GoodsActivityService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wuyou.entity.GoodsActivity;
import com.wuyou.entity.GoodsActivityExample;
import com.wuyou.entity.GoodsActivityWithBLOBs;

/**
 * @author 吴优
 * desciption:商品活动
 * other:
 * @date 2018年9月21日 
 */
public interface GoodsActivityService {

	public int insert(GoodsActivityWithBLOBs record);
	/**
	 * 通过活动ID删除活动信息
	 * @param actId
	 * @return
	 */
	public int deleteByPrimaryKey(Integer actId);
	/**
	 * 通过活动名称删除活动信息
	 * @param actName
	 * @return
	 */
	public int deleteByactName(String actName);
	
	public  int updateByExampleSelective(@Param("record") GoodsActivityWithBLOBs record, @Param("example") GoodsActivityExample example);

	public List<GoodsActivity> selectByExample(GoodsActivityExample example);

    public GoodsActivityWithBLOBs selectByPrimaryKey(Integer actId);
}
