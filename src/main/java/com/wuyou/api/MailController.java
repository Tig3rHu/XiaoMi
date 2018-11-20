package com.wuyou.api;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wuyou.entity.Useres;
import com.wuyou.entity.UseresExample;
import com.wuyou.service.EmailService;
import com.wuyou.service.UseresService;


@RestController
@CrossOrigin
@RequestMapping("/mail")
public class MailController {
	
	@Autowired
	private UseresService useresService;
	@Autowired
	private EmailService emailService;
	
	
	//邮箱验证
	//需要邮箱跟username
	@RequestMapping("/sendMail")
	 public void sendTemplateMail(Useres senduseres) {
	        //创建邮件正文
		String content1="<html>\n" +
                "<body>\n" +
    		   "请点击" +
                "   <a href='http://134.175.86.105:8080/XiaoMi/mail/activation/";
       String username = senduseres.getUsername();
       String content12="'>激活账号</a>\n" +
                "</body>\n" +
                "</html>";
       String content=content1 + username + content12;
        emailService.sendHtmlEmail(senduseres.getEmail(),"验证邮件", content);
	    }
	
	@RequestMapping(value = "activation/{useresname}", method = RequestMethod.GET)
    public String activation(@PathVariable String useresname, HttpServletResponse response) throws IOException {
		UseresExample example = new UseresExample();
		UseresExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(useresname);
		List<Useres> usereslist = useresService.selectByExample(example);
		Useres useres = usereslist.get(0);
		useres.setType(1);
		
		useresService.updateByPrimaryKeySelective(useres);
		return "验证成功";
        	
        }
}
