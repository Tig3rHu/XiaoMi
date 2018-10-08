package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.AdMapper;
import com.wuyou.entity.Ad;
import com.wuyou.entity.AdExample;
import com.wuyou.service.AdService;

@Service
public class AdServiceImpl implements AdService {
    @Autowired
    private AdMapper adMapper;
    
	
	@Override
	public Ad findAdById(Integer adId) throws Exception {
		// TODO Auto-generated method stub
		return adMapper.selectByPrimaryKey(adId);
	}

	@Override
	public List<Ad> selectByExample(AdExample example) {
		// TODO Auto-generated method stub
		return adMapper.selectByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer adId) {
		// TODO Auto-generated method stub
		return adMapper.deleteByPrimaryKey(adId);
	}

	@Override
	public int updateAdById(Integer adId, Ad ad) throws Exception {
		// TODO Auto-generated method stub
		return adMapper.updateByPrimaryKey(ad);
	}

	@Override
	public int insertAd(Ad ad) throws Exception {
		// TODO Auto-generated method stub
		return adMapper.insert(ad);
	}

}
