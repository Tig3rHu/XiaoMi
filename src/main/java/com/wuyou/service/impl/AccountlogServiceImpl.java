package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.AccountLogMapper;
import com.wuyou.entity.AccountLog;
import com.wuyou.entity.AccountLogExample;
import com.wuyou.service.AccountlogService;
/**
 * 吴优
 * @author wy
 * desciption:
 * other:
 */
@Service
public class AccountlogServiceImpl implements AccountlogService {
    
	@Autowired
	private AccountLogMapper accountlogMapper;
	
	@Override
	public AccountLog selectByPrimaryKey(Integer logId) throws Exception {
		// TODO Auto-generated method stub
		return accountlogMapper.selectByPrimaryKey(logId);
	}

	@Override
	public List<AccountLog> findAccountLogByUserId(Integer userId) throws Exception {
		// TODO Auto-generated method stub
			AccountLogExample accountLogExample=new AccountLogExample();
			AccountLogExample.Criteria criteria=accountLogExample.createCriteria();
			criteria.andUserIdEqualTo(userId);
			List<AccountLog> a=accountlogMapper.selectByExample(accountLogExample);
		
		return a;
	}

	@Override
	public int insert(AccountLog record) throws Exception {
		// TODO Auto-generated method stub
		return accountlogMapper.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer logId) throws Exception {
		// TODO Auto-generated method stub
		return accountlogMapper.deleteByPrimaryKey(logId);
	}

	@Override
	public int deleteByuserId(Integer userId) throws Exception {
		// TODO Auto-generated method stub
		AccountLogExample accountLogExample=new AccountLogExample();
		AccountLogExample.Criteria criteria=accountLogExample.createCriteria();
		criteria.andUserIdEqualTo(userId);
		return accountlogMapper.deleteByExample(accountLogExample);
	}

	@Override
	public int updateAccountLogBylogId(Integer logId, AccountLog record)
			throws Exception {
		// TODO Auto-generated method stub
		record.setLogId(logId);
		return accountlogMapper.updateByPrimaryKey(record);
	}

}
