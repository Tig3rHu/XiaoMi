/**  
* <p>Title: FlashSaleService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.FlashSale;
import com.wuyou.entity.FlashSaleExample;

/**
 * @author 吴优
 * desciption:闪购
 * other:
 * @date 2018年9月21日 
 */
public interface FlashSaleService {
      
	int deleteByPrimaryKey(Long id);

    int insert(FlashSale record);
    
    public int update(Long id,FlashSale record);
	
    List<FlashSale> selectByExample(FlashSaleExample example);

    FlashSale selectByPrimaryKey(Long id);
	
	
}
