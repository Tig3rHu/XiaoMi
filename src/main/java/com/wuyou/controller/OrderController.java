/**  
* <p>Title: OrderController.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月28日  
* @version 1.0  
*/
package com.wuyou.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wuyou.entity.Order;
import com.wuyou.service.OrderService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月28日 
 */
@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/index")
    public String queryList(Model model){
		List<Order> order=orderService.selectByExample(null);
		model.addAttribute("orders", order);
    	return "order/list";
    }
	@RequestMapping("/toedit")
	public String toedit(Model model,Integer orderId){
		Order order;
		if(orderId!=null&&orderId>0){
			order=orderService.findOrderByOrderId(orderId);
			
		}else{
			order=new Order();
			order.setAddTime(new Date());
			order.setConfirmTime(new Date());
			order.setPayTime(new Date());
			order.setShippingTime(new Date());
			order.setShippingStatus(true);
			order.setPayStatus(true);
		}
		model.addAttribute("order", order);
		return "/order/edit";
	}
	@RequestMapping("/edit")
	public String edit(Order order,BindingResult bindingResult,Integer orderId,
			String addTime,String confirmTime,String payTime,
			String shippingTime
			) throws ParseException{
		if(addTime!=null&&confirmTime!=null&&shippingTime!=null&&payTime!=null){
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			order.setAddTime(sdf.parse(addTime));
			order.setConfirmTime(sdf.parse(confirmTime));
			order.setPayTime(sdf.parse(payTime));
			order.setShippingTime(sdf.parse(shippingTime));		
		}
		if(orderId!=null&&orderId>0){
			orderService.updateOrderByOrderId(orderId, order);
		}else{
			orderService.insert(order);
		}
		
		
		return "redirect:index";
	}
	@RequestMapping("/delete")
	public String delete(Integer orderId){
		orderService.deleteOrderByOrderId(orderId);
		
		return "redirect:index";
	}
	
	
}
