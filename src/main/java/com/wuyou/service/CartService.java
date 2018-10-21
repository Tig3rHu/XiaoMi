/**  
* <p>Title: CartService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import com.wuyou.entity.Cart;
import com.wuyou.entity.CartExample;
import com.wuyou.entity.CartVo;

/**
 * @author 吴优
 * desciption:购物车
 * other:
 * @date 2018年9月21日 
 */
public interface CartService {
    /**
     * 添加入购物车
     * @param record
     * @return
     */
	public int insert(Cart record);
	/**
	 * 根据商品id删除购物车信息
	 * @param goodsId
	 * @return
	 */
	public int deleteBygoodId(Integer goodsId);
	
	int deleteByPrimaryKey(Integer id);
	
	/**
	 * 查询购物车信息
	 * @param id
	 * @return
	 */
	public Cart selectByPrimaryKey(Integer id);

    public List<Cart> findCart(CartExample example);
    
    List<CartVo> selectfromCartAndPromOrder();
	
}
