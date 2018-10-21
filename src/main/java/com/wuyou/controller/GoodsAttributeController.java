/**  
* <p>Title: GoodsAttributeController.java</p>  
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

import com.wuyou.entity.GoodsAttribute;
import com.wuyou.service.GoodAttributeService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月28日 
 */
@RequestMapping("/goodsAttribute")
@Controller
public class GoodsAttributeController {
   
	@Autowired
	private GoodAttributeService goodsAttributeService;
	
	@RequestMapping("/index")
    public String queryList(Model model){
		List<GoodsAttribute> goodAttribute=goodsAttributeService.selectByExampleWithBLOBs(null);
		model.addAttribute("goodAttributes", goodAttribute);
    	return "goodsAttribute/list";
    }
	@RequestMapping("/toedit")
	public String toedit(Model model,Integer attrId){
		GoodsAttribute goodsAttribute;
		if(attrId!=null&&attrId>0){
			goodsAttribute=goodsAttributeService.selectByPrimaryKey(attrId);
			
		}else{
			goodsAttribute=new GoodsAttribute();
		}
		model.addAttribute("goodAttributes", goodsAttribute);
	    return "/goodsAttribute/edit";
	}
	@RequestMapping("/edit")
	public String edit(GoodsAttribute goodsAttribute,BindingResult bindingResult,Integer attrId){
		if(attrId!=null&&attrId>0){
			goodsAttributeService.updateByPrimaryKey(goodsAttribute);
		}else{
			goodsAttributeService.insert(goodsAttribute);
		}
		
		
		return "redirect:index";
	}
	@RequestMapping("/delete")
	public String delete(Integer attrId){
		goodsAttributeService.deleteByPrimaryKey(attrId);
		return "redirect:index";
	}
	
	
	
}
