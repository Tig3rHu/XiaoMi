/**  
* <p>Title: BrandServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年9月21日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.BrandMapper;
import com.wuyou.entity.Brand;
import com.wuyou.entity.BrandAndArticleCat;
import com.wuyou.entity.BrandExample;
import com.wuyou.service.BrandService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年9月21日 
 */
@Service
public class BrandServiceImpl implements BrandService {
    
	@Autowired
	private BrandMapper brandMapper;
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.BrandService#insert(com.wuyou.entity.Brand)
	 */
	@Override
	public int insert(Brand record) {
		// TODO Auto-generated method stub
		return brandMapper.insert(record);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.BrandService#deleteByExample(com.wuyou.entity.BrandExample)
	 */
	@Override
	public int deleteByExample(BrandExample example) {
		// TODO Auto-generated method stub
		return brandMapper.deleteByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.BrandService#deleteByPrimaryKey(java.lang.Short)
	 */
	@Override
	public int deleteByPrimaryKey(Short id) {
		// TODO Auto-generated method stub
		return brandMapper.deleteByPrimaryKey(id);
	}

	

	/* (non-Javadoc)
	 * @see com.wuyou.service.BrandService#findBrandById(java.lang.Short)
	 */
	@Override
	public Brand findBrandById(Short id) {
		// TODO Auto-generated method stub
		return brandMapper.selectByPrimaryKey(id);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.BrandService#selectByExample(com.wuyou.entity.BrandExample)
	 */
	@Override
	public List<Brand> selectByExample(BrandExample example) {
		// TODO Auto-generated method stub
		return brandMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.BrandService#selectBrandAndArticleCatInCatId()
	 */
	@Override
	public List<BrandAndArticleCat> selectBrandAndArticleCatInCatId() {
		// TODO Auto-generated method stub
		return brandMapper.selectBrandAndArticleCatInCatId();
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.BrandService#updateByPrimaryKey(com.wuyou.entity.Brand)
	 */
	@Override
	public int updateByPrimaryKey(Brand record) {
		// TODO Auto-generated method stub
		return brandMapper.updateByPrimaryKey(record);
	}

}
