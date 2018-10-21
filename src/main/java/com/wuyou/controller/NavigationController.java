/**  
* <p>Title: NavigationController.java</p>  
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

import com.wuyou.entity.Navigation;
import com.wuyou.service.NavigationService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月28日 
 */
@Controller
@RequestMapping("/navigation")
public class NavigationController {

	@Autowired
	private NavigationService navigationService;
	
	@RequestMapping("/index")
    public String queryList(Model model){
		List<Navigation> navigation=navigationService.selectByExample(null);
		
		model.addAttribute("navigations", navigation);
    	return "navigation/list";
    }
	@RequestMapping("/toedit")
	public String toedit(Model model,Integer id){
		Navigation navigation;
		if(id!=null&&id>0){
			navigation=navigationService.findNavigationById(id);
			
		}else{
			navigation=new Navigation();
		}
		model.addAttribute("navigations", navigation);
		return "/navigation/edit";
	}
	@RequestMapping("/edit")
	public String edit(Navigation navigation,BindingResult bindingResult,Integer id){
		
		if(id!=null&&id>0){
			navigationService.updateByPrimaryKey(navigation);
		}else{
			navigationService.insert(navigation);
		}
		
		
		return "redirect:index";
	}
	@RequestMapping("/delete")
	public String delete(Integer id){
		navigationService.deleteByPrimaryKey(id);
		return "redirect:index";
	}
	
}
