/**  
* <p>Title: GroupBuyServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.GroupBuyMapper;
import com.wuyou.entity.GroupBuy;
import com.wuyou.entity.GroupBuyExample;
import com.wuyou.service.GroupBuyService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class GroupBuyServiceImpl implements GroupBuyService {
    
	@Autowired
	private GroupBuyMapper groupBuyMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.GroupBuyService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return groupBuyMapper.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GroupBuyService#insert(com.wuyou.entity.GroupBuy)
	 */
	@Override
	public int insert(GroupBuy record) {
		// TODO Auto-generated method stub
		return groupBuyMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GroupBuyService#updateByExample(com.wuyou.entity.GroupBuy, com.wuyou.entity.GroupBuyExample)
	 */
	@Override
	public int updateByExample(GroupBuy record, GroupBuyExample example) {
		// TODO Auto-generated method stub
		return groupBuyMapper.updateByExample(record, example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GroupBuyService#selectByExample(com.wuyou.entity.GroupBuyExample)
	 */
	@Override
	public List<GroupBuy> selectByExample(GroupBuyExample example) {
		// TODO Auto-generated method stub
		return groupBuyMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GroupBuyService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public GroupBuy selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return groupBuyMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GroupBuyService#updateByPrimaryKey(com.wuyou.entity.GroupBuy)
	 */
	@Override
	public int updateByPrimaryKey(GroupBuy record) {
		// TODO Auto-generated method stub
		return groupBuyMapper.updateByPrimaryKey(record);
	}

}
