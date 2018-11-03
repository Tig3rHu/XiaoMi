/**  
* <p>Title: CommentController.java</p>  
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

import com.wuyou.entity.CommentWithBLOBs;
import com.wuyou.service.CommentService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月28日 
 */
@Controller
@RequestMapping("/comment")
public class CommentController {
    
	@Autowired
	private CommentService commentService;
	

	@RequestMapping("/index")
    public String queryList(Model model){
		
		List<CommentWithBLOBs> comment=commentService.selectcommentAndGoods();
	    model.addAttribute("comments", comment);
		
		
    	return "comment/list";
    }
	@RequestMapping("/toedit")
	public String toedit(Model model,CommentWithBLOBs comment){
		if(comment.getCommentId()!=null&&comment.getCommentId()>0){
			comment=commentService.selectByPrimaryKey(comment.getCommentId());
		    model.addAttribute("comments", comment);
		}else{
			comment=new CommentWithBLOBs();
			comment.setAddTime(new Date());
			model.addAttribute("comments", comment);
		}
		
		
		return "/comment/edit";
	}
	@RequestMapping("/edit")
	public String edit(CommentWithBLOBs comment,BindingResult bindingResult,
			String addTime) throws ParseException{
		
		if(addTime!=null){
			 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        	comment.setAddTime(sdf.parse(addTime));
		}		
		if(comment.getCommentId()!=null&&comment.getCommentId()>0){
			commentService.updateByPrimaryKeyWithBLOBs(comment);
		}else{
			comment=new CommentWithBLOBs();
			commentService.insert(comment);
		}
		
		
		return "redirect:index";
	}
	@RequestMapping("/delete")
	public String delete(Integer commentId){
		commentService.deleteByPrimaryKey(commentId);
		return "redirect:index";
	}
	
	
}
