/**  
* <p>Title: GoodsImagesServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月22日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.GoodsImagesMapper;
import com.wuyou.entity.GoodsImages;
import com.wuyou.entity.GoodsImagesExample;
import com.wuyou.service.GoodsImagesService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月22日 
 */
@Service
public class GoodsImagesServiceImpl implements GoodsImagesService {
     
	@Autowired
	private GoodsImagesMapper goodsImagesMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsImagesService#insert(com.wuyou.entity.GoodsImages)
	 */
	@Override
	public int insert(GoodsImages record) {
		// TODO Auto-generated method stub
		return goodsImagesMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsImagesService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer imgId) {
		// TODO Auto-generated method stub
		return goodsImagesMapper.deleteByPrimaryKey(imgId);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsImagesService#selectByExample(com.wuyou.entity.GoodsImagesExample)
	 */
	@Override
	public List<GoodsImages> selectByExample(GoodsImagesExample example) {
		// TODO Auto-generated method stub
		return goodsImagesMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.GoodsImagesService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public GoodsImages selectByPrimaryKey(Integer imgId) {
		// TODO Auto-generated method stub
		return goodsImagesMapper.selectByPrimaryKey(imgId);
	}

}
