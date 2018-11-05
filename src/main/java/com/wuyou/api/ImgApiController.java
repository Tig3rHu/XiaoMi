/**  
* <p>Title: ImgApiController.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年11月4日  
* @version 1.0  
*/
package com.wuyou.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.wuyou.entity.GoodsCategory;
import com.wuyou.entity.Img;
import com.wuyou.entity.ImgExample;
import com.wuyou.entity.RecommendImg;
import com.wuyou.service.GoodsCategoryService;
import com.wuyou.service.ImgService;

/**
 * @author 吴优
 * desciption:
 * other:
 * * @CrossOrigin(origins="*",maxAge=3600)
 * 支持跨域，* 表示任何来源，也可以是其他域名
 * @RestController
 * 返回一个对象，即return一个例如(course)对象，这时在没有页面的情况下，
 * 也能看到返回的是一个user对象对应的json字符串，而前端的作用利用返回的进行解析渲染页面
 * @date 2018年11月4日 
 */
@CrossOrigin(origins="*",maxAge=3600)
@RestController
@RequestMapping("/img")
public class ImgApiController {
	
	@Autowired
	private ImgService imgService;
	@Autowired
	private GoodsCategoryService goodsCategoryService;
	//首页图片
	@RequestMapping("/imglist")
	@ResponseBody
	public String postTheImg(){
		ImgExample example=new ImgExample();
		ImgExample.Criteria criteria=example.createCriteria();
		criteria.andNameEqualTo("imglist");
		criteria.andChooseEqualTo("推荐超值推荐");
		List<Img> img=imgService.selectByExample(example);
		ImgExample example1=new ImgExample();
		ImgExample.Criteria critria1=example1.createCriteria();
		critria1.andNameEqualTo("single_img");
		critria1.andChooseEqualTo("推荐超值推荐");
		List<Img> singleimg=imgService.selectByExample(example1);
		ImgExample sildeexample=new ImgExample();
		ImgExample.Criteria sildeCriteria=sildeexample.createCriteria();
		sildeCriteria.andNameEqualTo("silde_img");
		sildeCriteria.andChooseEqualTo("推荐轮播");
		List<Img> sildeimg=imgService.selectByExample(sildeexample);
		RecommendImg list=new RecommendImg();		
		list.setSingleImg(singleimg);
		list.setImgList(img);
		//list.setSildeImg(sildeimg);
		
		return JSONObject.toJSONString(list);				
	}
	//分类的名称
	@RequestMapping("/cate")
	@ResponseBody
	public String getclassifyName(){
		
		List<GoodsCategory> cate=goodsCategoryService.selectNameBymobileName("分类");
				
		return JSONObject.toJSONString(cate);
	}
	//分类图片
	@RequestMapping("/cateImg")
	@ResponseBody
	public String postImgToCategory(){
		 ImgExample catesingleExample=new ImgExample();
		 ImgExample.Criteria catesinglecriteria=catesingleExample.createCriteria();
		 catesinglecriteria.andChooseEqualTo("分类新品");
		 catesinglecriteria.andNameEqualTo("single_img");
		 List<Img> catesingle=imgService.selectByExample(catesingleExample);
		 ImgExample catelistimgExample=new ImgExample();
		 ImgExample.Criteria catelistimgcriteria=catelistimgExample.createCriteria();
		 catelistimgcriteria.andChooseEqualTo("分类新品");
		 catelistimgcriteria.andNameEqualTo("imglist");
		 List<Img> catelist=imgService.selectByExample(catelistimgExample);
		 RecommendImg list=new RecommendImg();
		 list.setImgList(catelist);
		 list.setSingleImg(catesingle);
		 		 		
		return JSONObject.toJSONString(list);
		
	}
	

}
