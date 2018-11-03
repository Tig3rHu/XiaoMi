/**  
* <p>Title: BrandController.java</p>  
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

import com.wuyou.entity.Article;
import com.wuyou.entity.Brand;
import com.wuyou.entity.BrandAndArticleCat;
import com.wuyou.service.BrandService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月28日 
 */
@RequestMapping("/brand")
@Controller
public class BrandController {
    
	@Autowired
	private BrandService brandService;
	
	@RequestMapping("/index")
    public String queryList(Model model){
		//BrandAndArticleCat
		List<Brand> brand=brandService.selectByExample(null);
		model.addAttribute("brands", brand);
    	return "brand/list";
    }
	@RequestMapping("/toedit")
	public String toedit(Model model,Brand brand,Short id){
		if(id!=null&&id>0){
			brand=brandService.findBrandById(brand.getId());
		    model.addAttribute("brands", brand);
		}else{
			brand=new Brand();
			model.addAttribute("brands", brand);
		}
		
		
		return "/brand/edit";
	}
	@RequestMapping("/edit")
	public String edit(Brand brand,BindingResult bindingResult){
		if(brand.getId()!=null&&brand.getId()>0){
			brandService.updateByPrimaryKey(brand);	
		}else{
			brandService.insert(brand);
		}
		
		return "redirect:index";
	}
	@RequestMapping("/delete")
	public String delete(Short id){
		brandService.deleteByPrimaryKey(id);
		return "redirect:index";
	}
	
	
	
	
	
}
