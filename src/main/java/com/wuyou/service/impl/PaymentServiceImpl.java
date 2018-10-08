/**  
* <p>Title: PaymentServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.PaymentMapper;
import com.wuyou.entity.Payment;
import com.wuyou.entity.PaymentExample;
import com.wuyou.service.PaymentService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentMapper paymentMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.PaymentService#insert(com.wuyou.entity.Payment)
	 */
	@Override
	public int insert(Payment payment) {
		// TODO Auto-generated method stub
		return paymentMapper.insert(payment);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.PaymentService#deletePaymentBypayId(java.lang.Byte)
	 */
	@Override
	public int deletePaymentBypayId(Byte payId) {
		// TODO Auto-generated method stub
		return paymentMapper.deleteByPrimaryKey(payId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.PaymentService#findPaymentBypayId(java.lang.Byte)
	 */
	@Override
	public Payment findPaymentBypayId(Byte payId) {
		// TODO Auto-generated method stub
		return paymentMapper.selectByPrimaryKey(payId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.PaymentService#findPaymentAll()
	 */
	@Override
	public List<Payment> findPaymentAll() {
		// TODO Auto-generated method stub
		PaymentExample paymentExample=new PaymentExample();
		return paymentMapper.selectByExample(paymentExample);
	}

}
