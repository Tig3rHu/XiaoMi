/**  
* <p>Title: AdminController.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月28日  
* @version 1.0  
*/
package com.wuyou.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.wuyou.entity.Admin;
import com.wuyou.entity.Status;
import com.wuyou.entity.SystemModule;
import com.wuyou.entity.SystemModuleVo;
import com.wuyou.entity.User;
import com.wuyou.service.AdminService;
import com.wuyou.service.SystemModuleService;
import com.wuyou.service.UserService;

/**
 * @author 吴优
 * desciption:
 * other:择日不如撞日
 * @date 2018年9月28日 
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	@Autowired
	private SystemModuleService systemModuleService;
	@Autowired
	private UserService userService;
	
	@RequestMapping("/tologin")
	public String index11(){
		return "admin/login";
	}
	
	@RequestMapping("/loginin")
	public String adminLogin(Admin admin,HttpServletRequest request,String userName,Model model){
		System.out.println(userName);
		//获取当前用户(获得主体)
		Subject subject=SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(admin.getUserName(),admin.getPassword());
		//登录验证
	    try {
	    	List<SystemModule> sysMenus=systemModuleService.querySystemModuleListByParentId((short)0);
			
	    	request.setAttribute("sysMenus", sysMenus);
			//将所有的以及导航栏查询出来
			System.out.println(sysMenus.get(0).getModId());
			
			/*for(int i=0;i<=sysMenus.size();i++){*/
			List<SystemModuleVo> systemModuleVoList=systemModuleService.findSystemModuleVo((short)0);
			
			request.setAttribute("menuList", systemModuleVoList);
	    	subject.login(token);
			request.setAttribute("admin", admin);
			System.out.println("到这里");
			return "admin/index";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Status s=new Status();
			s.setMessage("密码或者账号错误");
			model.addAttribute("s", s);
			
			return "admin/login";
		}								
	}
	
	@RequestMapping("/loginout")
	public String adminLoginOut(){
		return "redirect:tologin";
	}
	
	@RequestMapping("/index")
	public  String indexSystem(Model model) throws Exception{
		
		List<SystemModule> sysMenus=systemModuleService.querySystemModuleListByParentId((short)0);
		
		model.addAttribute("sysMenus", sysMenus);
		//将所有的以及导航栏查询出来
		System.out.println(sysMenus.get(0).getModId());
		
		/*for(int i=0;i<=sysMenus.size();i++){*/
		List<SystemModuleVo> systemModuleVoList=systemModuleService.findSystemModuleVo((short)0);
		
		model.addAttribute("menuList", systemModuleVoList);
		/*}*/
		return "admin/index";
	}						
	//towelcome页面
	@RequestMapping("/towelcome")
	public String towelcome(){
		return "towelcome/towelcome";
	}
	@GetMapping("/get/{id}")
	@ResponseBody
	public String get(@PathVariable("id") Integer id){
		User u=userService.findById(id);
	     
	    return JSONObject.toJSONString(u);
	}
}
