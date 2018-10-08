package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.AccountLog;
import com.wuyou.entity.AccountLogExample;
import com.wuyou.entity.Ad;
/**
 * 吴优
 * @author wy
 * desciption:
 * other:
 */
public interface AccountlogService {
	/**
	 * 根据logId查询log表中的信息
	 * @param logId
	 * @return
	 * @throws Exception
	 */
	public AccountLog selectByPrimaryKey(Integer logId) throws Exception;
    /**
     * 根据用户ID查询表中的信息
     * @param userId
     * @return
     * @throws Exception
     */
    public List<AccountLog> findAccountLogByUserId(Integer userId) throws Exception;
    /**
     * 添加log信息
     * @param record
     * @return
     * @throws Exception
     */
    public int insert(AccountLog record) throws Exception;
    /**
     * 
     * @param logId
     * @return
     * @throws Exception
     */
    int deleteByPrimaryKey(Integer logId) throws Exception;
    /**
     * 根据UserID删除信息
     * @param userId
     * @return
     * @throws Exception
     */
    public int deleteByuserId(Integer userId) throws Exception;
    /**
     * 
     * @param logId
     * @param record
     * @return
     * @throws Exception
     */
    public int updateAccountLogBylogId(Integer logId,AccountLog record) throws Exception;
}
