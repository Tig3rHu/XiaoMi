/**  
* <p>Title: GroupBuyController.java</p>  
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

import com.wuyou.entity.GroupBuy;
import com.wuyou.service.GroupBuyService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月28日 
 */
@Controller
@RequestMapping("/groupBuy")
public class GroupBuyController {
   
	@Autowired
	private GroupBuyService groupBuyService;
	
	@RequestMapping("/index")
    public String queryList(Model model){
		List<GroupBuy> groupBuy=groupBuyService.selectByExample(null);
		model.addAttribute("groupBuys", groupBuy);
    	return "groupBuy/list";
    }
	@RequestMapping("/toedit")
	public String toedit(Model model,Integer id){
		GroupBuy groupBuy;
		if(id!=null&&id>0){
			groupBuy=groupBuyService.selectByPrimaryKey(id);
			
		}else{
			groupBuy=new GroupBuy();
			groupBuy.setEndTime(new Date());
			groupBuy.setStartTime(new Date());			
		}
		model.addAttribute("groupBuy", groupBuy);
		return "/groupBuy/edit";
	}
	@RequestMapping("/edit")
	public String edit(GroupBuy groupBuy,BindingResult bindingResult,Integer id,
			String endTime,String startTime) throws ParseException{
		if(endTime!=null&&startTime!=null){
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        	groupBuy.setStartTime(sdf.parse(startTime));
		    groupBuy.setEndTime(sdf.parse(endTime));
		}
		if(id!=null&&id>0){
			groupBuyService.updateByPrimaryKey(groupBuy);
		}else{
			groupBuyService.insert(groupBuy);
		}
		
		return "redirect:index";
	}
	@RequestMapping("/delete")
	public String delete(Integer id){
		groupBuyService.deleteByPrimaryKey(id);
		return "redirect:index";
	}
	
	
}
