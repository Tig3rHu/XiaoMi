/**  
* <p>Title: ImgService.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年11月4日  
* @version 1.0  
*/
package com.wuyou.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wuyou.entity.Img;
import com.wuyou.entity.ImgExample;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年11月4日 
 */
@Service
public interface ImgService {
      
	List<Img> selectByExample(ImgExample example);

    Img selectByPrimaryKey(Integer id);
	
	
	
	
	
}
