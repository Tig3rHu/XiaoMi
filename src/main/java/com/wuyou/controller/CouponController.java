/**  
* <p>Title: CouponController.java</p>  
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

import com.alibaba.fastjson.JSONObject;
import com.wuyou.entity.Coupon;
import com.wuyou.service.CouponService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月28日 
 */
@Controller
@RequestMapping("/coupon")
public class CouponController {
    
	
	@Autowired
	private CouponService couponService;
	
	@RequestMapping("/index")
    public String queryList(Model model){
		List<Coupon> coupon=couponService.selectByExample(null);
		model.addAttribute("coupons", coupon);
			
    	return "coupon/list";
    }
	@RequestMapping("/toedit")
	public String toedit(Model model,Integer id,String sendStartTime,String useStartTime){
		Coupon coupon;
		if(id!=null&&id>0){
			coupon=couponService.selectByPrimaryKey(id);
			
		}else{
		  coupon=new Coupon();
		  coupon.setSendStartTime(new Date());
			coupon.setUseEndTime(new Date());
			coupon.setUseStartTime(new Date());
			coupon.setSendEndTime(new Date());
			coupon.setAddTime(new Date());
		  
		}
		 model.addAttribute("coupons", coupon);
		
		return "/coupon/edit";
	}
	@RequestMapping("/edit")
	public String edit(Coupon coupon,BindingResult bindingResult,Integer id,String sendStartTime,String useStartTime
			,String useEndTime,String sendEndTime,String addTime
			) throws ParseException{
		if(id!=null&&id>0){
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			coupon.setSendStartTime(sdf.parse(sendStartTime));
			coupon.setUseEndTime(sdf.parse(useEndTime));
			coupon.setUseStartTime(sdf.parse(useStartTime));
			coupon.setSendEndTime(sdf.parse(sendEndTime));
			coupon.setAddTime(sdf.parse(addTime));
			//coupon.setSendStartTime();
			//coupon.setSendStartTime();
			//coupon.setSendStartTime();
			//coupon.setSendStartTime();
			couponService.updateByPrimaryKey(coupon);
		}else{
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			coupon.setSendStartTime(sdf.parse(sendStartTime));
			coupon.setUseEndTime(sdf.parse(useEndTime));
			coupon.setUseStartTime(sdf.parse(useStartTime));
			coupon.setSendEndTime(sdf.parse(sendEndTime));
			coupon.setAddTime(sdf.parse(addTime));
			couponService.insert(coupon);
		}
		
		
		return "redirect:index";
	}
	@RequestMapping("/delete")
	public String delete(Integer id){
		
		couponService.deleteByPrimaryKey(id);
		
		return "redirect:index";
	}
	
	
	
}
