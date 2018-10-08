/**  
* <p>Title: AccountLogController.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月23日  
* @version 1.0  
*/
package com.wuyou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.wuyou.entity.AccountLog;
import com.wuyou.entity.AccountLogExample;
import com.wuyou.service.AccountlogService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月23日 
 */
@RestController
public class AccountLogController {
     
	
	@Autowired
	private AccountlogService accountlogService;
	
	@RequestMapping("/Accountlog/{logId}")
	public String selectByPrimaryKey(@PathVariable("logId") Integer logId) throws Exception{
		AccountLog accountLog=accountlogService.selectByPrimaryKey(logId);
		
		return JSONObject.toJSONString(accountLog);
	}
	
	/**
	 * 根据userid查询AccountLog
	 * @throws Exception 
	 */
	@RequestMapping("/AccountlogByuserid/{userId}")
	public String findAccountLogByUserId(@PathVariable("userId") Integer userId) throws Exception{
		List<AccountLog> accountLog=accountlogService.findAccountLogByUserId(userId);
		return JSONObject.toJSONString(accountLog);
	}
	@RequestMapping("/insertIntoAccountLog")
	public void insertIntoAccountLog(AccountLog accountLog) throws Exception{
		
		accountLog.setChangeTime(123214123);
		accountLog.setUserId(3);
		accountlogService.insert(accountLog);	
	}
	
	
}
