/**  
* <p>Title: BrandService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.Brand;
import com.wuyou.entity.BrandExample;

/**
 * @author 吴优
 * desciption:品牌
 * other:
 * @date 2018年9月21日 
 */
public interface BrandService {
   /**
    * 添加品牌信息
    * @param record
    * @return
    */
	public int insert(Brand record);
	/**
	 * 删除品牌信息
	 * @param example
	 * @return
	 */
    public int deleteByExample(BrandExample example);
	public  int deleteByPrimaryKey(Short id);
	/**
	 * 更新/修改
	 * @param brand
	 * @param id
	 * @return
	 */
	public int updateBrandById(Brand brand,Short id);
    /**
     * 查询
     * @param id
     * @return
     */
    public Brand findBrandById(Short id);
    List<Brand> selectByExample(BrandExample example);
}
