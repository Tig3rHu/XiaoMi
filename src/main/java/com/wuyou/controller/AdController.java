/**  
* <p>Title: AdController.java</p>  
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wuyou.entity.Ad;
import com.wuyou.entity.AdAndAdPosition;
import com.wuyou.entity.AdPosition;
import com.wuyou.service.AdPositionService;
import com.wuyou.service.AdService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月28日 
 */

@Controller
@RequestMapping("/ad")
public class AdController {
     
	@Autowired
	private AdService adService;
	@Autowired
	private AdPositionService adPositionService;
	
	@RequestMapping("/index")
	public String queryAdList(Model model,@RequestParam(required = true, defaultValue = "1") Integer page){
		int pageSize=20;
		PageHelper.startPage(page, pageSize);
		List<AdAndAdPosition> ad=adService.selectAdpositionNameFromAdAndAdPosition();
		//List<AdPosition> adp=adPositionService.selectByExample(null);
		
		PageInfo<AdAndAdPosition> p = new PageInfo<AdAndAdPosition>(ad);
		
		model.addAttribute("page", p);
		model.addAttribute("admenu", ad);
		//model.addAttribute("adp", adp);
		return "/ad/list";
	}
	@RequestMapping("/toedit")
	public String toedit(Model model,Ad ad) throws Exception{
		
		if(ad.getAdId()!=null&&ad.getAdId()>0){
			ad=adService.findAdById(ad.getAdId());
			model.addAttribute("adById", ad);
		}else{
			ad=new Ad();
			model.addAttribute("adById", ad);
		}
				
		//跳转到edit.ftl页面
		return "/ad/edit";
	}
	@RequestMapping("/edit")
	public String edit(Ad adById,BindingResult bindingResult,Integer adId) throws Exception{		
		if(adById.getAdId()!=null&&adById.getAdId()>0){			
			adService.updateAdById(adById);
		}
		else{			
			adService.insertAd(adById);			
		}		
		return "redirect:index";
	}
	
    //删除广告信息
	@RequestMapping("/delete")
	public String delete(Integer adId){
		adService.deleteByPrimaryKey(adId);
		return "redirect:index";
	}
	
}
