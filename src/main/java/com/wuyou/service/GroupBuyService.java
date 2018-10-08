/**  
* <p>Title: GroupBuyService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wuyou.entity.GroupBuy;
import com.wuyou.entity.GroupBuyExample;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
public interface GroupBuyService {
     
	int deleteByPrimaryKey(Integer id);

    int insert(GroupBuy record);
    
    int updateByExample(@Param("record") GroupBuy record, @Param("example") GroupBuyExample example);
    
    List<GroupBuy> selectByExample(GroupBuyExample example);

    GroupBuy selectByPrimaryKey(Integer id);

}
