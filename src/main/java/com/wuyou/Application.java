package com.wuyou;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * @author wy
 * desciption:SpringBoot 启动类
 * other:
 */
@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.wuyou.dao")
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SpringApplication.run(Application.class, args);
	}

}
