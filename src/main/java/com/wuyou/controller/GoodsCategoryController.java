/**  
* <p>Title: GoodsCategoryController.java</p>  
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

import com.wuyou.entity.GoodsCategory;
import com.wuyou.service.GoodsCategoryService;

/**
 * @author 吴优
 * desciption:商品分类信息           
 * other:
 * @date 2018年9月28日 
 */
@Controller
@RequestMapping("/goodsCategory")
public class GoodsCategoryController {
     
	@Autowired
	private GoodsCategoryService goodsCategoryService;
	
	
	@RequestMapping("/index")
    public String queryList(Model model){
		
		List<GoodsCategory> goodsCategory=goodsCategoryService.selectByExample(null);
		model.addAttribute("goodsCategorys", goodsCategory);
    	return "goodsCategory/list";
    }
	@RequestMapping("/toedit")
	public String toedit(Model model,Short id){
		GoodsCategory goodsCategory;
		if(id!=null&&id>0){
			goodsCategory=goodsCategoryService.selectByPrimaryKey(id);
			
		}else{
			goodsCategory=new GoodsCategory();
			
		}
		model.addAttribute("goodsCategorys", goodsCategory);
		return "/goodsCategory/edit";
	}
	@RequestMapping("/edit")
	public String edit(GoodsCategory goodsCategory,BindingResult bindingResult,Short id){
		if(id!=null&&id>0){
			goodsCategoryService.updateByPrimaryKey(goodsCategory);
		}else{
			goodsCategoryService.insert(goodsCategory);
		}
		
		
		
		return "redirect:index";
	}
	@RequestMapping("/delete")
	public String delete(Short id){
		goodsCategoryService.deleteByPrimaryKey(id);
		return "redirect:index";
	}
	
}
