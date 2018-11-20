package com.wuyou;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.boot.web.support.SpringBootServletInitializer;
//import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * @author wy
 * desciption:SpringBoot 启动类
 * other:
 */
@SpringBootApplication
@MapperScan("com.wuyou.dao")
public class Application extends SpringBootServletInitializer{
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {  
       // builder.sources(this.getClass());  
        return builder.sources(Application.class);
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SpringApplication.run(Application.class, args);
	}

}
