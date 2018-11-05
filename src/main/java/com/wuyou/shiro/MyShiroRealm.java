/**  
* <p>Title: MyShiroRealm.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年10月29日  
* @version 1.0  
*/
package com.wuyou.shiro;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.wuyou.entity.Admin;
import com.wuyou.service.AdminService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年10月29日 
 */
public class MyShiroRealm extends AuthorizingRealm{
   
	@Autowired
	private AdminService adminService;
	
	
	public String getName(){
		return "MyShiroRealm";
	}
	/* (non-Javadoc)
	 * 权限认证，授权
	 * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * 登录认证
	 * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		// TODO Auto-generated method stub
		//获取当前登陆的用户名username
		String userName=(String) token.getPrincipal();
		//通过用户名查找数据库中用户信息
	     System.out.println("doGetAuthenticationInfo");
			Admin admin=adminService.findAdminByUserName(userName);					
		AuthenticationInfo info=new SimpleAuthenticationInfo(admin.getUserName(),admin.getPassword(),getName());
		
		return info;
	}

}
