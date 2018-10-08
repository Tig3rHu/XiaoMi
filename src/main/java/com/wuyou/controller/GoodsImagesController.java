/**  
* <p>Title: GoodsImages.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月28日  
* @version 1.0  
*/
package com.wuyou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.wuyou.service.GoodsImagesService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月28日 
 */
@RestController
public class GoodsImagesController {
   
	@Autowired
	private GoodsImagesService goodsImagesService;
	
}
