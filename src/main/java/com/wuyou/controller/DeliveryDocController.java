/**  
* <p>Title: DeliveryDocController.java</p>  
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

import com.wuyou.entity.DeliveryDoc;
import com.wuyou.service.DeliveryDocService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月28日 
 */
@RequestMapping("/delivery")
@Controller
public class DeliveryDocController {
    
	
	@Autowired
	private DeliveryDocService deliveryDocService;
	
	

	@RequestMapping("/index")
    public String queryList(Model model){
		List<DeliveryDoc> delivery=deliveryDocService.selectByExample(null);
		model.addAttribute("deliverys", delivery);
		
    	return "delivery/list";
    }
	@RequestMapping("/toedit")
	public String toedit(Model model,Integer id){
		if(id!=null&&id>0){
			DeliveryDoc	delivery=deliveryDocService.selectByPrimaryKey(id);
			model.addAttribute("deliverys", delivery);
		}else{
			DeliveryDoc delivery=new DeliveryDoc();
			delivery.setBestTime(new Date());
			delivery.setCreateTime(new Date());
			model.addAttribute("deliverys", delivery);
		}								
		return "/delivery/edit";
	}
	@RequestMapping("/edit")
	public String edit(DeliveryDoc	delivery,BindingResult bindingResult,Integer id,
			String bestTime,String createTime
			) throws ParseException{
		if(id!=null&&id>0){
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			delivery.setBestTime(sdf.parse(bestTime));
			delivery.setCreateTime(sdf.parse(createTime));
			deliveryDocService.updateByPrimaryKey(delivery);
		} else{
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			delivery.setBestTime(sdf.parse(bestTime));
			delivery.setCreateTime(sdf.parse(createTime));
			deliveryDocService.insert(delivery);
		}
		
		
		
		return "redirect:index";
	}
	@RequestMapping("/delete")
	public String delete(Integer id){
		
		deliveryDocService.deleteByPrimaryKey(id);
		
		return "redirect:index";
	}
	
	
	
	
}
