/**  
* <p>Title: ArticleCatController.java</p>  
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

import com.wuyou.entity.ArticleCat;
import com.wuyou.service.ArticleCatService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月28日 
 */
@Controller
@RequestMapping("/articleCat")
public class ArticleCatController{
    
	@Autowired
	private ArticleCatService articleCatService;

	@RequestMapping("/index")
	public String queryList(Model model) {
		// TODO Auto-generated method stub
		List<ArticleCat> articleCat=articleCatService.selectByExample(null);
		model.addAttribute("articleCats", articleCat);
		
		return "articleCat/list";
	}
	@RequestMapping("/toedit")
	public String toedit(Model model,ArticleCat articleCat) {
		// TODO Auto-generated method stub
		if(articleCat.getCatId()!=null&&articleCat.getCatId()>0){
			articleCat=articleCatService.selectByPrimaryKey(articleCat.getCatId());
		    model.addAttribute("articleCats", articleCat);
		}else{
			articleCat=new ArticleCat();
			model.addAttribute("articleCats", articleCat);
		}
		
		
		
		return "/articleCat/edit";
	}

	@RequestMapping("/edit")
	public String edit(ArticleCat articleCat,BindingResult bindingResult,Integer catId) {
		// TODO Auto-generated method stub
		if(articleCat.getCatId()!=null&&articleCat.getCatId()>0){
			articleCatService.updateByPrimaryKey(articleCat);
		}else{
			articleCatService.insert(articleCat);
		}
		
		
		return "redirect:index";
	}

	@RequestMapping("/delete")
	public String delete(Integer catId) {
		// TODO Auto-generated method stub
		articleCatService.deleteByPrimaryKey(catId);
		return "redirect:index";
	}
	
}
