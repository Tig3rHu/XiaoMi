/**  
* <p>Title: ServletInitializer.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年10月11日  
* @version 1.0  
*/
package com.wuyou;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


public class ServletInitializer extends SpringBootServletInitializer{
   
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(Application.class);
	}
	
}
