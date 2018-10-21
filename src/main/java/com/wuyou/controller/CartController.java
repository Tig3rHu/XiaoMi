/**  
* <p>Title: CartController.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月28日  
* @version 1.0  
*/
package com.wuyou.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wuyou.entity.Cart;
import com.wuyou.entity.CartVo;
import com.wuyou.service.CartService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月28日 
 */
@RequestMapping("/cart")
@Controller
public class CartController {
    
	@Autowired
	private CartService cartService;
	
	@RequestMapping("/index")
    public String queryList(Model model){
		List<CartVo> cart=cartService.selectfromCartAndPromOrder();
		model.addAttribute("carts", cart);
				
    	return "cart/list";
    }
	@RequestMapping("/toedit")
	public String toedit(Model model,Cart cart){
		cart=new Cart();
		model.addAttribute("carts", cart);
		
		
		return "/cart/edit";
	}
	@RequestMapping("/edit")
	public String edit(Cart cart){
		cartService.insert(cart);
		return "redirect:index";
	}
	@RequestMapping("/delete")
	public String delete(Integer id){
		cartService.deleteByPrimaryKey(id);
		return "redirect:index";
	}
	
	
	
}
