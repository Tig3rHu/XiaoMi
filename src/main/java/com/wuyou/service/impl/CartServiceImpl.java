/**  
* <p>Title: CartServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.CartMapper;
import com.wuyou.entity.Cart;
import com.wuyou.entity.CartExample;
import com.wuyou.entity.CartVo;
import com.wuyou.service.CartService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月21日 
 */
@Service
public class CartServiceImpl implements CartService {
     
	@Autowired
	private CartMapper cartMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.CartService#insert(com.wuyou.entity.Cart)
	 */
	@Override
	public int insert(Cart record) {
		// TODO Auto-generated method stub
		return cartMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.CartService#deleteBygoodId(java.lang.Integer)
	 */
	@Override
	public int deleteBygoodId(Integer goodsId) {
		// TODO Auto-generated method stub
		CartExample cartExample=new CartExample();
		CartExample.Criteria criteria=cartExample.createCriteria();
		criteria.andGoodsIdEqualTo(goodsId);
		return cartMapper.deleteByExample(cartExample);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.CartService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public Cart selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return cartMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.CartService#findCart(com.wuyou.entity.CartExample)
	 */
	@Override
	public List<Cart> findCart(CartExample example) {
		// TODO Auto-generated method stub
		return cartMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.CartService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return cartMapper.deleteByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.CartService#selectfromCartAndPromOrder()
	 */
	@Override
	public List<CartVo> selectfromCartAndPromOrder() {
		// TODO Auto-generated method stub
		return cartMapper.selectfromCartAndPromOrder();
	}

}
