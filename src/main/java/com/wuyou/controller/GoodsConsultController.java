/**  
* <p>Title: GoodsConsultController.java</p>  
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

import com.wuyou.entity.GoodsConsult;
import com.wuyou.entity.GoodsConsultVo;
import com.wuyou.service.GoodsConsultService;

/**
 * @author 吴优
 * desciption:商品咨询信息
 * other:
 * @date 2018年9月28日 
 */
@Controller
@RequestMapping("/goodsConsult")
public class GoodsConsultController {
     
	@Autowired
	private GoodsConsultService goodsConsultService;
	
	@RequestMapping("/index")
    public String queryList(Model model){
		List<GoodsConsultVo> goodsConsult=goodsConsultService.goodsConsultAndgoods();
		model.addAttribute("goodsConsults", goodsConsult);
    	return "goodsConsult/list";
    }
	@RequestMapping("/toedit")
	public String toedit(Model model,Integer id){
		GoodsConsult goodsConsult;
		if(id!=null&&id>0){
			goodsConsult=goodsConsultService.selectByPrimaryKey(id);
						
		}else{
			goodsConsult=new GoodsConsult();
			goodsConsult.setAddTime(new Date());
		}
		model.addAttribute("goodsConsults", goodsConsult);
		return "/goodsConsult/edit";
	}
	@RequestMapping("/edit")
	public String edit(GoodsConsult goodsConsult,BindingResult bindingResult,Integer id,
			String addTime) throws ParseException{
		if(addTime!=null){
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    goodsConsult.setAddTime(sdf.parse(addTime));	
		}
		if(id!=null&&id>0){
			goodsConsultService.deleteByPrimaryKey(id);
		}else{
			goodsConsultService.insert(goodsConsult);
		}
		
		return "redirect:index";
	}
	@RequestMapping("/delete")
	public String delete(Integer id){
		goodsConsultService.deleteByPrimaryKey(id);
		return "redirect:index";
	}
	
	
	
}
