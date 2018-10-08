/**  
* <p>Title: ExpenseLogService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.ExpenseLog;
import com.wuyou.entity.ExpenseLogExample;

/**
 * @author 吴优
 * desciption:费用支出
 * other:
 * @date 2018年9月21日 
 */
public interface ExpenseLogService {
     
	public int insert(ExpenseLog record);
	
	public int deleteByPrimaryKey(Integer id);
	
	public List<ExpenseLog> selectByExample(ExpenseLogExample example);

    public ExpenseLog selectByPrimaryKey(Integer id);
	
}
