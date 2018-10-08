/**  
* <p>Title: ExpenseLogServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.ExpenseLogMapper;
import com.wuyou.entity.ExpenseLog;
import com.wuyou.entity.ExpenseLogExample;
import com.wuyou.service.ExpenseLogService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月21日 
 */
@Service
public class ExpenseLogServiceImpl implements ExpenseLogService {
    
	@Autowired
	private ExpenseLogMapper expenseLogMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.ExpenseLogService#insert(com.wuyou.entity.ExpenseLog)
	 */
	@Override
	public int insert(ExpenseLog record) {
		// TODO Auto-generated method stub
		return expenseLogMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ExpenseLogService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return expenseLogMapper.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ExpenseLogService#selectByExample(com.wuyou.entity.ExpenseLogExample)
	 */
	@Override
	public List<ExpenseLog> selectByExample(ExpenseLogExample example) {
		// TODO Auto-generated method stub
		return expenseLogMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ExpenseLogService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public ExpenseLog selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return expenseLogMapper.selectByPrimaryKey(id);
	}

}
