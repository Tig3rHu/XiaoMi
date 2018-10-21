/**  
* <p>Title: GoodsController.java</p>  
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

import com.wuyou.entity.Goods;
import com.wuyou.entity.GoodsVo;
import com.wuyou.entity.GoodsWithBLOBs;
import com.wuyou.service.GoodsService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月28日 
 */
//@RestController
@Controller
@RequestMapping("/goods")
public class GoodsController {
    
	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("/index")
    public String queryList(Model model){
		List<GoodsVo> goods=goodsService.goodsVoSelect();
		model.addAttribute("goods", goods);
    	return "goods/list";
    }
	@RequestMapping("/toedit")
	public String toedit(Model model,Integer goodsId){
		GoodsVo goods;
		if(goodsId!=null&&goodsId>0){
			goods=goodsService.selectByPrimaryKey(goodsId);
			
		}else{
			goods=new GoodsVo();
			goods.setOnTime(new Date());
			goods.setUpdateTime(new Date());
		}
		model.addAttribute("goods", goods);
		return "/goods/edit";
	}
	@RequestMapping("/edit")
	public String edit(GoodsWithBLOBs goods,BindingResult bindingResult,Integer goodsId,
			String onTime,String updateTime
			) throws ParseException{
         if(onTime!=null&&updateTime!=null){
        	 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        	 goods.setOnTime(sdf.parse(onTime));
 			 goods.setUpdateTime(sdf.parse(updateTime));
         }
         if(goodsId!=null&&goodsId>0){
        	 goodsService.updateByPrimaryKeySelective(goods);
         }else{
        	 goodsService.insert(goods);
         }
		
		return "redirect:index";
	}
	@RequestMapping("/delete")
	public String delete(Integer goodsId){
		goodsService.deleteByPrimaryKey(goodsId);
		return "redirect:index";
	}
	
	
} 
