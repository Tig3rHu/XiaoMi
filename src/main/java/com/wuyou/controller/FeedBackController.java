/**  
* <p>Title: FeedBackController.java</p>  
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

import com.wuyou.entity.Feedback;
import com.wuyou.service.FeedbackService;

/**
 * @author 吴优
 * desciption:商品留言信息
 * other:
 * @date 2018年9月28日 
 */
@RequestMapping("/feedBack")
@Controller
public class FeedBackController {
    
	@Autowired
	private FeedbackService feedBackService;
	
	@RequestMapping("/index")
    public String queryList(Model model){
		List<Feedback> feedBack=feedBackService.selectByExample(null);
		
		model.addAttribute("feedBacks", feedBack);
		
    	return "feedBack/list";
    }
	@RequestMapping("/toedit")
	public String toedit(Model model,Integer msgId){
		
		if(msgId!=null&&msgId>0){
			Feedback feedBack=feedBackService.selectByPrimaryKey(msgId);
			model.addAttribute("feedBacks", feedBack);
		}else{
			Feedback feedBack=new Feedback();
			feedBack.setMsgTime(new Date());
			model.addAttribute("feedBacks", feedBack);
		}				
		return "/feedBack/edit";
	}
	@RequestMapping("/edit")
	public String edit(Feedback feedback,BindingResult bindingResult,Integer msgId
			,String msgTime) throws ParseException{
		if(msgTime!=null){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		feedback.setMsgTime(sdf.parse(msgTime));}
		if(msgId!=null&&msgId>0){						
			feedBackService.updateByPrimaryKey(feedback);
		}else{
			feedBackService.insert(feedback);
		}
		
		
		return "redirect:index";
	}
	@RequestMapping("/delete")
	public String delete(Integer msgId){
		
		feedBackService.deleteByPrimaryKey(msgId);
		
		return "redirect:index";
	}
	
	
	
	
}
