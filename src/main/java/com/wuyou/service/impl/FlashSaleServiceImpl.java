/**  
* <p>Title: FlashSaleServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.FlashSaleMapper;
import com.wuyou.entity.FlashSale;
import com.wuyou.entity.FlashSaleExample;
import com.wuyou.service.FlashSaleService;

/**
 * @author 吴优
 * desciption:闪购信息
 * other:
 * @date 2018年9月21日 
 */
@Service
public class FlashSaleServiceImpl implements FlashSaleService {
    
	@Autowired
	private FlashSaleMapper flashSaleMapper;
	
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.FlashSaleService#deleteByPrimaryKey(java.lang.Long)
	 */
	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return flashSaleMapper.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.FlashSaleService#insert(com.wuyou.entity.FlashSale)
	 */
	@Override
	public int insert(FlashSale record) {
		// TODO Auto-generated method stub
		return flashSaleMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.FlashSaleService#update(java.lang.Long, com.wuyou.entity.FlashSale)
	 */
	@Override
	public int update(Long id, FlashSale record) {
		// TODO Auto-generated method stub
		record.setId(id);
		return flashSaleMapper.updateByPrimaryKey(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.FlashSaleService#selectByExample(com.wuyou.entity.FlashSaleExample)
	 */
	@Override
	public List<FlashSale> selectByExample(FlashSaleExample example) {
		// TODO Auto-generated method stub
		return flashSaleMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.FlashSaleService#selectByPrimaryKey(java.lang.Long)
	 */
	@Override
	public FlashSale selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return flashSaleMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.FlashSaleService#selectByExampleWithBLOBs(com.wuyou.entity.FlashSaleExample)
	 */
	@Override
	public List<FlashSale> selectByExampleWithBLOBs(FlashSaleExample example) {
		// TODO Auto-generated method stub
		return flashSaleMapper.selectByExampleWithBLOBs(example);
	}

}
