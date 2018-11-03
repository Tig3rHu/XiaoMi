/**  
* <p>Title: ArticleController.java</p>  
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

import com.alibaba.fastjson.JSONObject;
import com.wuyou.entity.Ad;
import com.wuyou.entity.Article;
import com.wuyou.entity.ArticleWithBLOBs;
import com.wuyou.service.ArticleService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月28日 
 */
@RequestMapping("/article")
@Controller
public class ArticleController{
    
	@Autowired
	private ArticleService articleService;

	@RequestMapping("/index")
	public String queryList(Model model) {
		// TODO Auto-generated method stub
		List<Article> article=articleService.selectByExample(null);
		model.addAttribute("articles", article);
		
		return "article/list";
	}

	@RequestMapping("/toedit")
	public String toedit(Model model,Article article) {
		// TODO Auto-generated method stub
		if(article.getArticleId()!=null&&article.getArticleId()>0){
			article=articleService.selectByPrimaryKey(article.getArticleId());
		    model.addAttribute("article", article);
		}else{
			article=new Article();
			article.setAddTime(new Date());
			article.setPublishTime(new Date());
			model.addAttribute("article", article);
		}
		
		
		return "/article/edit";
	}

	@RequestMapping("/edit")
	public String edit(ArticleWithBLOBs article,BindingResult bindingResult,Integer articleId,
			String addTime,String publishTime
			) throws ParseException {
		if(addTime!=null&&publishTime!=null){
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			article.setAddTime(sdf.parse(addTime));
			article.setPublishTime(sdf.parse(publishTime));
		}
		
		// TODO Auto-generated method stub
		if(article.getArticleId()!=null&&article.getArticleId()>0){
			articleService.updateByPrimaryKey(article);
		}else{
			articleService.insert(article);
		}
		return "redirect:index";
	}

	@RequestMapping("/delete")
	public String delete(Integer articleId) {
		// TODO Auto-generated method stub
		articleService.deleteByPrimaryKey(articleId);
		return "redirect:index";
	}
}
