/**  
* <p>Title: BaseController.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年10月14日  
* @version 1.0  
*/
package com.wuyou.controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年10月14日 
 */
public class BaseController {
   
	
	@RequestMapping("/index")
    public String queryList(Model model){
    	return "article/list";
    }
	@RequestMapping("/toedit")
	public String toedit(Model model,Integer id){
		if(id!=null&&id>0){
			
			
		}else{
			
		}
		return "/article/edit";
	}
	@RequestMapping("/edit")
	public <T> String edit(T t,BindingResult bindingResult,Integer id){
		
		return "redirect:index";
	}
	@RequestMapping("/delete")
	public String delete(){
		
		return "redirect:index";
	}
	
	
}
