/**  
* <p>Title: ImgPcServiceImpl.java</p>  
* <p>Description: </p>   
* @author 吴优 
* @date 2018年11月17日  
* @version 1.0  
*/
package com.wuyou.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.ImgpcMapper;
import com.wuyou.entity.ImgPcVo;
import com.wuyou.entity.Imgpc;
import com.wuyou.entity.ImgpcExample;
import com.wuyou.service.ImgPcService;

/**
 * @author 吴优
 * desciption:
 * other:
 * @date 2018年11月17日 
 */
@Service
public class ImgPcServiceImpl implements ImgPcService {
   
	@Autowired
	private ImgpcMapper imgpcMapper;
	
	
	/* (non-Javadoc)
	 * @see com.wuyou.service.ImgPcService#countByExample(com.wuyou.entity.ImgpcExample)
	 */
	@Override
	public int countByExample(ImgpcExample example) {
		// TODO Auto-generated method stub
		return imgpcMapper.countByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ImgPcService#deleteByExample(com.wuyou.entity.ImgpcExample)
	 */
	@Override
	public int deleteByExample(ImgpcExample example) {
		// TODO Auto-generated method stub
		return imgpcMapper.deleteByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ImgPcService#deleteByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ImgPcService#insert(com.wuyou.entity.Imgpc)
	 */
	@Override
	public int insert(Imgpc record) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ImgPcService#insertSelective(com.wuyou.entity.Imgpc)
	 */
	@Override
	public int insertSelective(Imgpc record) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ImgPcService#selectByExample(com.wuyou.entity.ImgpcExample)
	 */
	@Override
	public List<Imgpc> selectByExample(ImgpcExample example) {
		// TODO Auto-generated method stub
		return imgpcMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ImgPcService#selectByPrimaryKey(java.lang.Integer)
	 */
	
	
	

	/* (non-Javadoc)
	 * @see com.wuyou.service.ImgPcService#updateByExampleSelective(com.wuyou.entity.Imgpc, com.wuyou.entity.ImgpcExample)
	 */
	@Override
	public int updateByExampleSelective(Imgpc record, ImgpcExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ImgPcService#updateByExample(com.wuyou.entity.Imgpc, com.wuyou.entity.ImgpcExample)
	 */
	@Override
	public int updateByExample(Imgpc record, ImgpcExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ImgPcService#updateByPrimaryKeySelective(com.wuyou.entity.Imgpc)
	 */
	@Override
	public int updateByPrimaryKeySelective(Imgpc record) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.wuyou.service.ImgPcService#updateByPrimaryKey(com.wuyou.entity.Imgpc)
	 */
	@Override
	public int updateByPrimaryKey(Imgpc record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	  //根据ID查询导航栏一级分类信息
		@Override
		public Imgpc selectByPrimaryKey(Integer id) {
			// TODO Auto-generated method stub
			return imgpcMapper.selectByPrimaryKey(id);
		}
		//根据父类ID 查询出二级分类信息

		/* (non-Javadoc)
		 * @see com.wuyou.service.ImgPcService#queryImgPcByParentID(java.lang.Integer)
		 */
		@Override
		public List<Imgpc> queryImgPcByParentID(Integer parentId) {
			ImgpcExample imgpcExample=new ImgpcExample();
			ImgpcExample.Criteria criteria1=imgpcExample.createCriteria();
			criteria1.andParentIdEqualTo(parentId);
			List<Imgpc> imgpcParent=imgpcMapper.selectByExample(imgpcExample);
			return imgpcParent;
		}
		@Override
	   public List<ImgPcVo> findimgPcVo(Integer parentId){
		   List<ImgPcVo> imgPcVoList=new ArrayList<ImgPcVo>();
		   //根据parentId查询分类信息
		   List<Imgpc> firstImgpc=queryImgPcByParentID(parentId);
		   ImgPcVo imgpcVo=null;
		   //遍历firstImgpc中的信息
		   for(Imgpc imgpc:firstImgpc){
			   imgpcVo=new ImgPcVo();
			   //得到imgpc中每个parentid中信息id
			   Integer pId=imgpc.getId();
			   //将所有的
			  BeanUtils.copyProperties(imgpc, imgpcVo);
			   //将所有的id作为查询条件
			   List<Imgpc> Imgpclist=queryImgPcByParentID(pId);
			   imgpcVo.setChildren(Imgpclist);
			   imgPcVoList.add(imgpcVo);
			   
			   
		   }
		   return imgPcVoList;
		   
		   
	   }
		
		

}
