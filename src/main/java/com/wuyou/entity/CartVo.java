/**  
* <p>Title: CartVo.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年10月15日  
* @version 1.0  
*/
package com.wuyou.entity;

import java.util.List;

/**
 * @author 吴优
 * desciption:
 * other:购物车包装类
 * @date 2018年10月15日 
 */
public class CartVo extends Cart{
    //商品
	private List<Goods> goods;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
