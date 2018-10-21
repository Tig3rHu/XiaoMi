/**  
* <p>Title: AdminLogController.java</p>  
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

import com.wuyou.entity.Ad;
import com.wuyou.entity.AdminLog;
import com.wuyou.service.AdminLogService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月28日 
 */


@Controller
@RequestMapping("/adminLog")
public class AdminLogController{
  
	@Autowired
	private AdminLogService adminLogService;
	
	@RequestMapping("/index")
	public String queryList(Model model) {
		// TODO Auto-generated method stub
		List<AdminLog> adminLog=adminLogService.selectByExample(null);
		model.addAttribute("adminLogmenu", adminLog);
		
		return "/adminLog/list";
	}

	@RequestMapping("/toedit")
	public String toedit(Model model,AdminLog adminLog) {
		// TODO Auto-generated method stub
		if(adminLog.getLogId()!=null){
			adminLog=adminLogService.selectByAdminId(adminLog.getAdminId());
		}
		 
		
		return "/adminLog/edit";
	}

	@RequestMapping("/edit")
	public String edit(AdminLog adminLog,BindingResult bindingResult,Integer logId) {
		// TODO Auto-generated method stub
		if(adminLog.getLogId()==null){
			adminLogService.insert(adminLog);
			}
		
		return "redirect:index";
	}

	@RequestMapping("/delete")
	public String delete(Long logId) {
		// TODO Auto-generated method stub
		adminLogService.deleteByPrimaryKey(logId);
		
		return "redirect:index";
	}

	
	
	
	

}
