package com.wuyou.api;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wuyou.entity.Cart;
import com.wuyou.entity.CartExample;
import com.wuyou.entity.Img;
import com.wuyou.entity.Status;
import com.wuyou.entity.Useres;
import com.wuyou.service.CartService;

@RestController
@CrossOrigin
@RequestMapping("/cartAPi")
public class CartApiController {
	
	@Autowired
	private CartService cartService;
	
	//查用用户对应的购物车
	//需要输入userid
	@RequestMapping("/seleseCart")
	public List<Cart> queryList(Cart cart) {
		List<Cart> cartList=null;
		CartExample example = new CartExample();
		CartExample.Criteria criteria = example.createCriteria();
		if(cart.getUserId()!=null) {
			criteria.andUserIdEqualTo(cart.getUserId());
		} 
		cartList = cartService.selectByExample(example);	
		return cartList;
	}
	//购物车添加 修改
	@RequestMapping("edit")
	public Status edit(Integer userid,Img img) {
		Status status = new Status();
		Cart cart = new Cart();
		cart.setUserId(userid);
		cart.setGoodsName(img.getTitle());
		cart.setGoodsPrice(BigDecimal.valueOf(img.getPrice()));
		cart.setSrc(img.getSrc());
		cart.setSpecKeyName(img.getImgdescribe());
		cartService.insert(cart);
		status.setStatusCode(1);
		status.setMessage("加入成功");
		return status;
	}
	//删除用户id中的物品id信息
	@RequestMapping("/delete")
	public Status delete(String id) {
		Status status = new Status();
		Integer delete = null;
		String[] deleteId = id.split(",");
		for (String i : deleteId) {
			delete = Integer.valueOf(i);
			cartService.deleteByPrimaryKey(delete);
		}
		status.setStatusCode(1);
		status.setMessage("删除成功");
		return status;
	}
}
