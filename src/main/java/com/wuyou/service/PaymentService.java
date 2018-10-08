/**  
* <p>Title: PaymentService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.Payment;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
public interface PaymentService {
     
	public int insert(Payment payment);
	
	public int deletePaymentBypayId(Byte payId);
	
	public Payment findPaymentBypayId(Byte payId);
	
	public List<Payment> findPaymentAll();
	
	
}
