
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.Invoice;
import com.wuyou.entity.InvoiceExample;

/**
 * @author 吴优
 * desciption:电子发票
 * other:
 * @date 2018年9月22日 
 */
public interface InvoiceService {
   
	int deleteByPrimaryKey(Integer invoiceId);

    int insert(Invoice record);
    
    List<Invoice> selectByExample(InvoiceExample example);

    Invoice selectByPrimaryKey(Integer invoiceId);

	
	
	
}
