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
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	
	
	//*******首页*******
	
	//***首页推荐****
	@RequestMapping("/imglist")
	@ResponseBody
	public String postTheImg(){				
		ImgExample sildeexample=new ImgExample();
		ImgExample.Criteria sildeCriteria=sildeexample.createCriteria();
		sildeCriteria.andNameEqualTo("silde_img");
		sildeCriteria.andChooseEqualTo("推荐轮播");
		List<Img> sildeimg=imgService.selectByExample(sildeexample);
		
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
		
		ImgExample tvexample1=new ImgExample();
		ImgExample.Criteria tvcriteria1=tvexample1.createCriteria();
		tvcriteria1.andNameEqualTo("single_img");
		tvcriteria1.andChooseEqualTo("推荐小米电视");
		List<Img> tvsingleimg=imgService.selectByExample(tvexample1);
		
		ImgExample tvexample2=new ImgExample();
		ImgExample.Criteria tvcriteria2=tvexample2.createCriteria();
		tvcriteria2.andNameEqualTo("imglist");
		tvcriteria2.andChooseEqualTo("推荐小米电视");
		List<Img> tvimglist=imgService.selectByExample(tvexample2);
		
		ImgExample starexample1=new ImgExample();
		ImgExample.Criteria starcriteria1=starexample1.createCriteria();
		starcriteria1.andNameEqualTo("imglist");
		starcriteria1.andChooseEqualTo("推荐明星单品");
		List<Img> starimglist=imgService.selectByExample(starexample1);
		
		ImgExample starexample2=new ImgExample();
		ImgExample.Criteria starcriteria2=starexample2.createCriteria();
		starcriteria2.andNameEqualTo("single_img");
		starcriteria2.andChooseEqualTo("推荐明星单品");
		List<Img> starsingleimg=imgService.selectByExample(starexample2);
		
		ImgExample newexample1=new ImgExample();
		ImgExample.Criteria newcriteria3=newexample1.createCriteria();
		newcriteria3.andNameEqualTo("imglist");
		newcriteria3.andChooseEqualTo("新品上线");
		List<Img> newimglist=imgService.selectByExample(newexample1);
		
		ImgExample newexample2=new ImgExample();
		ImgExample.Criteria newcriteria2=newexample2.createCriteria();
		newcriteria2.andNameEqualTo("single_img");
		newcriteria2.andChooseEqualTo("新品上线");
		List<Img> newsingleimg=imgService.selectByExample(newexample2);
		
		RecommendImg[] imgApi=new RecommendImg[4];
		RecommendImg imgApi1=new RecommendImg();
		imgApi1.setImgList(img);
		imgApi1.setSildeImg(sildeimg);
		imgApi1.setSingleImg(singleimg);
		RecommendImg imgApi2=new RecommendImg();
		imgApi2.setTvimgList(tvimglist);
		imgApi2.setTvsingleImg(tvsingleimg);
		RecommendImg imgApi3=new RecommendImg();
		imgApi3.setImgList(starimglist);
		imgApi3.setStarsingle(starsingleimg);
		RecommendImg imgApi4=new RecommendImg();
		imgApi4.setNewlineListImg(newimglist);
		imgApi4.setNewlinesingle(newsingleimg);
		imgApi[0]=imgApi1;
		imgApi[1]=imgApi2;
		imgApi[2]=imgApi3;
	    imgApi[3]=imgApi4;
		return JSONObject.toJSONString(imgApi);				
	}
	//*********分类页面********
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
	public RecommendImg[] postImgToCategory(){
		//1
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
		 //2
		 ImgExample catesingleExample1=new ImgExample();
		 ImgExample.Criteria catesinglecriteria1=catesingleExample1.createCriteria();
		 catesinglecriteria1.andChooseEqualTo("分类新品");
		 catesinglecriteria1.andNameEqualTo("single_img");
		 List<Img> catesingle1=imgService.selectByExample(catesingleExample1);
		 ImgExample catelistimgExample2=new ImgExample();
		 ImgExample.Criteria catelistimgcriteria2=catelistimgExample2.createCriteria();
		 catelistimgcriteria2.andChooseEqualTo("分类新品");
		 catelistimgcriteria2.andNameEqualTo("imglist");
		 List<Img> catelist2=imgService.selectByExample(catelistimgExample2);
		 //3
		 ImgExample catesingleExample3=new ImgExample();
		 ImgExample.Criteria catesinglecriteria3=catesingleExample3.createCriteria();
		 catesinglecriteria3.andChooseEqualTo("分类新品");
		 catesinglecriteria3.andNameEqualTo("single_img");
		 List<Img> catesingle3=imgService.selectByExample(catesingleExample3);
		 ImgExample catelistimgExample3=new ImgExample();
		 ImgExample.Criteria catelistimgcriteria3=catelistimgExample3.createCriteria();
		 catelistimgcriteria3.andChooseEqualTo("分类新品");
		 catelistimgcriteria3.andNameEqualTo("imglist");
		 List<Img> catelist3=imgService.selectByExample(catelistimgExample3);
		 //4
		 ImgExample catesingleExample4=new ImgExample();
		 ImgExample.Criteria catesinglecriteria4=catesingleExample4.createCriteria();
		 catesinglecriteria4.andChooseEqualTo("分类新品");
		 catesinglecriteria4.andNameEqualTo("single_img");
		 List<Img> catesingle4=imgService.selectByExample(catesingleExample4);
		 ImgExample catelistimgExample4=new ImgExample();
		 ImgExample.Criteria catelistimgcriteria4=catelistimgExample4.createCriteria();
		 catelistimgcriteria4.andChooseEqualTo("分类新品");
		 catelistimgcriteria4.andNameEqualTo("imglist");
		 List<Img> catelist4=imgService.selectByExample(catelistimgExample4);
		//5 
		 ImgExample catesingleExample5=new ImgExample();
		 ImgExample.Criteria catesinglecriteria5=catesingleExample5.createCriteria();
		 catesinglecriteria5.andChooseEqualTo("分类新品");
		 catesinglecriteria5.andNameEqualTo("single_img");
		 List<Img> catesingle5=imgService.selectByExample(catesingleExample5);
		 ImgExample catelistimgExample5=new ImgExample();
		 ImgExample.Criteria catelistimgcriteria5=catelistimgExample5.createCriteria();
		 catelistimgcriteria5.andChooseEqualTo("分类新品");
		 catelistimgcriteria5.andNameEqualTo("imglist");
		 List<Img> catelist5=imgService.selectByExample(catelistimgExample5);
		 //6
		 ImgExample catesingleExample6=new ImgExample();
		 ImgExample.Criteria catesinglecriteria6=catesingleExample6.createCriteria();
		 catesinglecriteria6.andChooseEqualTo("分类新品");
		 catesinglecriteria6.andNameEqualTo("single_img");
		 List<Img> catesingle6=imgService.selectByExample(catesingleExample6);
		 ImgExample catelistimgExample6=new ImgExample();
		 ImgExample.Criteria catelistimgcriteria6=catelistimgExample6.createCriteria();
		 catelistimgcriteria.andChooseEqualTo("分类新品");
		 catelistimgcriteria.andNameEqualTo("imglist");
		 List<Img> catelist6=imgService.selectByExample(catelistimgExample);
		 //7
		 ImgExample catesingleExample7=new ImgExample();
		 ImgExample.Criteria catesinglecriteria7=catesingleExample7.createCriteria();
		 catesinglecriteria7.andChooseEqualTo("分类新品");
		 catesinglecriteria7.andNameEqualTo("single_img");
		 List<Img> catesingle7=imgService.selectByExample(catesingleExample7);
		 ImgExample catelistimgExample7=new ImgExample();
		 ImgExample.Criteria catelistimgcriteria7=catelistimgExample7.createCriteria();
		 catelistimgcriteria7.andChooseEqualTo("分类新品");
		 catelistimgcriteria7.andNameEqualTo("imglist");
		 List<Img> catelist7=imgService.selectByExample(catelistimgExample7);
		 
		 
		 RecommendImg[] imgApi=new RecommendImg[7];
		 RecommendImg list=new RecommendImg();
		 list.setImgList(catelist);
		 list.setSingleImg(catesingle);
		 RecommendImg list1=new RecommendImg();
		 list1.setImgList(catelist7);
		 list1.setSingleImg(catesingle7);
		 RecommendImg list2=new RecommendImg();
		 list2.setImgList(catelist2);
		 list2.setSingleImg(catesingle1);
		 RecommendImg list3=new RecommendImg();
		 list3.setImgList(catelist3);
		 list3.setSingleImg(catesingle3);
		 RecommendImg list4=new RecommendImg();
		 list4.setImgList(catelist4);
		 list4.setSingleImg(catesingle4);
		 RecommendImg list5=new RecommendImg();
		 list5.setImgList(catelist5);
		 list5.setSingleImg(catesingle5);
		 RecommendImg list6=new RecommendImg();
		 list6.setImgList(catelist6);
		 list6.setSingleImg(catesingle6);
		 imgApi[0]=list;
		 imgApi[1]=list1;
		 imgApi[2]=list2;
		 imgApi[3]=list3;
		 imgApi[4]=list4;
		 imgApi[5]=list5;
		 imgApi[6]=list6;
		 		 		
		return imgApi;
		
	}
	
	@RequestMapping("/postImgdescribe/{id}")
	@ResponseBody
	public String postImgdescribe(@PathVariable("id") Integer id){
		
		ImgExample imgDescribeExample=new ImgExample();
		ImgExample.Criteria imgDescribecriteria=imgDescribeExample.createCriteria();
		imgDescribecriteria.andIdEqualTo(id);
		List<Img> imgdescribe=imgService.selectByExample(imgDescribeExample);
			
		return JSONObject.toJSONString(imgdescribe);
	}
	
	@RequestMapping("/selectimg")
	public Img[] selectimg(String id) {
		Integer select = null;
		String[] selectId = id.split(",");
		Img[] imgArrays = new Img[selectId.length];
		int z=0;//计数器
		for (String i : selectId) {
			select = Integer.valueOf(i);
			Img img=imgService.selectByPrimaryKey(select);
			imgArrays[z]=imgService.selectByPrimaryKey(select);
			z++;
		}
		return imgArrays;
		
	}
	

}
