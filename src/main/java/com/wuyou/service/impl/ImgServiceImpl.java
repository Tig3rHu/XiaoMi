/**  
* <p>Title: ImgServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年11月4日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.ImgMapper;
import com.wuyou.entity.Img;
import com.wuyou.entity.ImgExample;
import com.wuyou.service.ImgService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年11月4日 
 */
@Service
public class ImgServiceImpl implements ImgService {
     
	@Autowired
	private ImgMapper imgMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.ImgService#selectByExample(com.wuyou.entity.ImgExample)
	 */
	@Override
	public List<Img> selectByExample(ImgExample example) {
		// TODO Auto-generated method stub
		return imgMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ImgService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public Img selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return imgMapper.selectByPrimaryKey(id);
	}

}
