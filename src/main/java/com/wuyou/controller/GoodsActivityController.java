/**  
* <p>Title: GoodsActivityController.java</p>  
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

import com.wuyou.entity.GoodsActivity;
import com.wuyou.entity.GoodsActivityWithBLOBs;
import com.wuyou.service.GoodsActivityService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月28日 
 */
@RequestMapping("/goodsActivity")
@Controller
public class GoodsActivityController {
    
	@Autowired
	private GoodsActivityService goodsActivityService;
	
	@RequestMapping("/index")
    public String queryList(Model model){
		List<GoodsActivityWithBLOBs> goodsActivity=goodsActivityService.selectByExampleWithBLOBs(null);
		model.addAttribute("goodsActivitys", goodsActivity);
    	return "goodsActivity/list";
    }
	@RequestMapping("/toedit")
	public String toedit(Model model,Integer actId){
		GoodsActivity goodsActivitys;
		if(actId!=null&&actId>0){
			goodsActivitys=goodsActivityService.selectByPrimaryKey(actId);
			
		}else{
			goodsActivitys=new GoodsActivity();
			goodsActivitys.setEndTime(new Date());
			goodsActivitys.setStartTime(new Date());
		
		}
		model.addAttribute("goodsActivitys", goodsActivitys);
		return "/goodsActivity/edit";
	}
	@RequestMapping("/edit")
	public String edit(GoodsActivityWithBLOBs goodsActivity,BindingResult bindingResult,Integer actId,
			String endTime,String startTime
			) throws ParseException{
		    if(endTime!=null&&startTime!=null){
		    	 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    	 goodsActivity.setEndTime(sdf.parse(endTime));
				 goodsActivity.setStartTime(sdf.parse(startTime));							 
		    }
		    if(actId!=null&&actId>0){
		    	goodsActivityService.updateByPrimaryKeyWithBLOBs(goodsActivity);
		    }else{
		    	goodsActivityService.insert(goodsActivity);
		    }
		
		return "redirect:index";
	}
	@RequestMapping("/delete")
	public String delete(Integer actId){
		goodsActivityService.deleteByPrimaryKey(actId);
		return "redirect:index";
	}
	
	
}
