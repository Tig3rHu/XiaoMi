package com.wuyou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class DemoController {
   
	@RequestMapping("/index")
	public String index(){
		System.out.println("hello world");
		return "success";
	}
	
	
}
