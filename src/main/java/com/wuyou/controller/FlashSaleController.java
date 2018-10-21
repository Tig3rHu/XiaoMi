/**  
* <p>Title: FlashSaleController.java</p>  
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

import com.wuyou.entity.FlashSale;
import com.wuyou.service.FlashSaleService;

/**
 * @author 吴优
 * desciption:闪购信息
 * other:
 * @date 2018年9月28日 
 */
//@RestController
@Controller
@RequestMapping("/flashSale")
public class FlashSaleController {
    
	@Autowired
	private FlashSaleService falshSaleService;
	
	@RequestMapping("/index")
    public String queryList(Model model){
		List<FlashSale> flashSale=falshSaleService.selectByExampleWithBLOBs(null);
		model.addAttribute("flashSales", flashSale);
		
    	return "flashSale/list";
    }
	@RequestMapping("/toedit")
	public String toedit(Model model,Long id){
		FlashSale flash;
		if(id!=null&&id>0){
			flash=falshSaleService.selectByPrimaryKey(id);
			
		}else{
			flash=new FlashSale();
			flash.setEndTime(new Date());
			flash.setStartTime(new Date());
		}
		model.addAttribute("flashs", flash);
		return "/flashSale/edit";
	}
	@RequestMapping("/edit")
	public String edit(FlashSale flash,BindingResult bindingResult,Long id
			,String startTime,String endTime) throws ParseException{
		if(startTime!=null&&endTime!=null){
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			flash.setStartTime(sdf.parse(startTime));
			flash.setEndTime(sdf.parse(endTime));
		}
		if(id!=null&&id>0){
			falshSaleService.update(id, flash);
		}else{
			falshSaleService.insert(flash);
		}				
		return "redirect:index";
	}
	@RequestMapping("/delete")
	public String delete(Long id){
		falshSaleService.deleteByPrimaryKey(id);
		return "redirect:index";
	}
	
	
}
