/**  
* <p>Title: InvoiceServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.InvoiceMapper;
import com.wuyou.entity.Invoice;
import com.wuyou.entity.InvoiceExample;
import com.wuyou.service.InvoiceService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class InvoiceServiceImpl implements InvoiceService {
    
	@Autowired
	private InvoiceMapper invoiceMapper;
	
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.InvoiceService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer invoiceId) {
		// TODO Auto-generated method stub
		return invoiceMapper.deleteByPrimaryKey(invoiceId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.InvoiceService#insert(com.wuyou.entity.Invoice)
	 */
	@Override
	public int insert(Invoice record) {
		// TODO Auto-generated method stub
		return invoiceMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.InvoiceService#selectByExample(com.wuyou.entity.InvoiceExample)
	 */
	@Override
	public List<Invoice> selectByExample(InvoiceExample example) {
		// TODO Auto-generated method stub
		return invoiceMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.InvoiceService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public Invoice selectByPrimaryKey(Integer invoiceId) {
		// TODO Auto-generated method stub
		return invoiceMapper.selectByPrimaryKey(invoiceId);
	}

}
