/**  
* <p>Title: AdPostionController.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月28日  
* @version 1.0  
*/
package com.wuyou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.wuyou.entity.Ad;
import com.wuyou.entity.AdPosition;
import com.wuyou.service.AdPositionService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月28日 
 */
@RequestMapping("/adPosition")
@RestController
public class AdPostionController{
	
	@Autowired
	private AdPositionService adPositionService;

	@RequestMapping("/index")
	public String queryList(Model model) {
		// TODO Auto-generated method stub
		//List<AdPosition> adPosition=adPositionService.selectByExample(null);
		AdPosition ad=adPositionService.selectByPrimaryKey(2);
		//model.addAttribute("adPositions", adPosition);
		return JSONObject.toJSONString(ad);
	}

	@RequestMapping("/toedit")
	public String toedit(Model model,AdPosition adPosition) {
		// TODO Auto-generated method stub
		if(adPosition.getPositionId()!=null&&adPosition.getPositionId()>0){
			adPosition=adPositionService.selectByPrimaryKey(adPosition.getPositionId());
			model.addAttribute("adPosition", adPosition);
		}
		 
		return "adPosition/edit";
	}

	@RequestMapping("/edit")
	public String edit(AdPosition adPosition,BindingResult bindingResult,Integer positionId) throws Exception {
		// TODO Auto-generated method stub
		if(positionId!=null){
			adPositionService.updateAdPostionByPositionId(adPosition);
		}else{
			adPositionService.insert(adPosition);
		}
		return "redirect:index";
	}

	@RequestMapping("/delete")
	public String delete(Integer positionId) throws Exception {
		// TODO Auto-generated method stub
		adPositionService.deleteByPrimaryKey(positionId);
		return "redirect:index";
	}
	
	
	
	
	
	
	

}
