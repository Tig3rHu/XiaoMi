package com.wuyou.shiro;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 

* <p>Title: ShiroConfig</p>  

* <p>Description: 
*   shiro配置类
*   Apache Shiro 核心通过 Filter 来实现，就好像SpringMvc 通过DispachServlet 来主控制一样。 
既然是使用 Filter 一般也就能猜到，是通过URL规则来进行过滤和权限校验，所以我们需要定义一系列关于URL的规则和访问权限。
* </p>  

* @author 吴宗波  

* @date 2018年8月17日
 */
@Configuration
public class ShiroConfig {
	 /** 
     * ShiroFilterFactoryBean 处理拦截资源文件问题。 
     * 注意：单独一个ShiroFilterFactoryBean配置是或报错的，以为在 
     * 初始化ShiroFilterFactoryBean的时候需要注入：SecurityManager 
     * 
        Filter Chain定义说明 
       1、一个URL可以配置多个Filter，使用逗号分隔 
       2、当设置多个过滤器时，全部验证通过，才视为通过 
       3、部分过滤器可指定参数，如perms，roles 
     * 
     */ 
	@Bean(name = "shiroFilter")
	public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager){
		
		ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		// 必须设置 SecurityManage，拦截器
		Map<String,String> filterChainDefinitionMap=new LinkedHashMap<>();
		System.out.println("ShiroFilterFactoryBean shiroFilter");
		//拦截器
		filterChainDefinitionMap.put("/tologin", "anon");
		filterChainDefinitionMap.put("/logout", "logout");
		filterChainDefinitionMap.put("/login", "anon");
		
		//<!-- 过滤链定义，从上向下顺序执行，一般将 /**放在最为下边 -->:这是一个坑呢，一不小心代码就不好使了;  
        //<!-- authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问-->
		    filterChainDefinitionMap.put("/druid/**", "anon"); 
		   // filterChainDefinitionMap.put("/templates/**","anon");
		    filterChainDefinitionMap.put("/static/**","anon");
		    filterChainDefinitionMap.put("/admin/**", "anon");
		    filterChainDefinitionMap.put("/ad/**", "anon");
		   
		    filterChainDefinitionMap.put("/goods/**", "anon");
		    filterChainDefinitionMap.put("/article/**", "anon");
		    filterChainDefinitionMap.put("/articleCat/**", "anon");
		    filterChainDefinitionMap.put("/brand/**", "anon");
		    filterChainDefinitionMap.put("/cart/**", "anon");
		    filterChainDefinitionMap.put("/comment/**", "anon");
		    filterChainDefinitionMap.put("/coupon/**", "anon");
		    filterChainDefinitionMap.put("/delivery/**", "anon");
		    filterChainDefinitionMap.put("/feedBack/**", "anon");
		    filterChainDefinitionMap.put("/flashSale/**", "anon");
		    filterChainDefinitionMap.put("/goodsActivity/**", "anon");
		    filterChainDefinitionMap.put("/goodsAttribute/**", "anon");
		    filterChainDefinitionMap.put("/goodsCategory/**", "anon");
		    filterChainDefinitionMap.put("/goodsConsult/**", "anon");
		    filterChainDefinitionMap.put("/groupBuy/**", "anon");
		    filterChainDefinitionMap.put("/navigation/**", "anon");
		    filterChainDefinitionMap.put("/order/**", "anon");
		    filterChainDefinitionMap.put("/api/**", "anon");
		    filterChainDefinitionMap.put("/img/**", "anon");
		    filterChainDefinitionMap.put("/**", "authc"); 
	       // 如果不设置默认会自动寻找Web工程根目录下的"/login.jsp"页面  
	       shiroFilterFactoryBean.setLoginUrl("/admin/index");   
	        // 登录成功后要跳转的链接  
	        shiroFilterFactoryBean.setSuccessUrl("/admin/index");  
	        //未授权界面;  
	        shiroFilterFactoryBean.setUnauthorizedUrl("/403");  
	        
	       shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);  
	       return shiroFilterFactoryBean;  
		
		
	}
	/**
	 * 会话管理器
	 * @return
	 */
	@Bean
	public SecurityManager securityManager(){
		System.out.println("securityManager");
		DefaultWebSecurityManager securityManager =  new DefaultWebSecurityManager();  
		securityManager.setRealm(myShiroRealm());
	     return securityManager; 
	}
	/** 
     * 身份认证realm; 
     * (这个需要自己写，账号密码校验；权限等) 
     * @return 
     */  
	@Bean
	public MyShiroRealm myShiroRealm(){
		System.out.println("myShiroRealm");
		MyShiroRealm fairyShiroRealm=new MyShiroRealm();
		//加上密码加密
		//fairyShiroRealm.setCredentialsMatcher(hashedCredentialsMatcher());
		return fairyShiroRealm;
	}
	
	/** 
     * 凭证匹配器 
     * （由于我们的密码校验交给Shiro的SimpleAuthenticationInfo进行处理了 
     *  所以我们需要修改下doGetAuthenticationInfo中的代码; 
     * ） 
     * @return 
     */  
  /*  @Bean  
    public HashedCredentialsMatcher hashedCredentialsMatcher(){  
       HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();  
        
       hashedCredentialsMatcher.setHashAlgorithmName("md5");//散列算法:这里使用MD5算法;  
       hashedCredentialsMatcher.setHashIterations(2);//散列的次数，比如散列两次，相当于 md5(md5(""));  
        

       return hashedCredentialsMatcher;  
    }*/  
    
    /** 
     *  开启shiro aop注解支持. 
     *  使用代理方式;所以需要开启代码支持; 
     * @param securityManager 
     * @return 
     */  
    @Bean  
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager){  
    	System.out.println("ShiroConfiguration.authorizationAttributeSourceAdvisor()");
    	AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();  
       authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);  
       return authorizationAttributeSourceAdvisor;  
    }  
	
	

}
