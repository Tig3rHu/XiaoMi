/**  
* <p>Title: XiaoMiController.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年11月16日  
* @version 1.0  
*/
package com.wuyou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.wuyou.entity.GoodsCategory;
import com.wuyou.entity.ImgExample;
import com.wuyou.entity.ImgPcVo;
import com.wuyou.entity.Imgpc;
import com.wuyou.entity.ImgpcExample;
import com.wuyou.service.GoodsCategoryService;
import com.wuyou.service.ImgPcService;
import com.wuyou.service.ImgService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年11月16日 
 */
@Controller
@RequestMapping("/xiaomiNav")
public class XiaoMiController {
	
	@Autowired
	private ImgService imgService;
	@Autowired
	private GoodsCategoryService goodsCategoryService;
	@Autowired
	private ImgPcService ImgPcService;
	
	
	@RequestMapping("/cate")
	public String getcate(Model model){
		
		List<Imgpc> imgpcs=ImgPcService.queryImgPcByParentID((Integer)0);
		model.addAttribute("imgpcs", imgpcs);
		//横向导航栏
		List<ImgPcVo> ImgPclist=ImgPcService.findimgPcVo((Integer)0);
		model.addAttribute("ImgPclist", ImgPclist);
		//垂直导航栏
		List<ImgPcVo> ImgPclist1=ImgPcService.findimgPcVo((Integer)110);
		model.addAttribute("ImgPclist1", ImgPclist1);
		
		//轮播图
		ImgpcExample sildeExample=new ImgpcExample();
		ImgpcExample.Criteria criteriasilde=sildeExample.createCriteria();
		criteriasilde.andNameEqualTo("轮播图");
		criteriasilde.andTypeEqualTo("轮播");
		List<Imgpc> silderimg=ImgPcService.selectByExample(sildeExample);
		model.addAttribute("silderimg", silderimg);
		//小米logo
		Imgpc logoImg=ImgPcService.selectByPrimaryKey(70);
		model.addAttribute("logoImg", logoImg);
		//顶部广告图
		Imgpc topAdImg=ImgPcService.selectByPrimaryKey(56);
		model.addAttribute("topAdImg", topAdImg);
		
		
		List<GoodsCategory> cate=goodsCategoryService.selectNameBymobileName("顶部导航栏分类");
		model.addAttribute("cate",cate);
		
		List<GoodsCategory> topcate=goodsCategoryService.selectNameBymobileName("顶部导航条分类");
		model.addAttribute("topcate",topcate);
		return "youyou/xiaomiNav";
	}
	
	
	
	

}
