package com.wuyou.service;

import java.util.List;



import com.wuyou.entity.Ad;
import com.wuyou.entity.AdAndAdPosition;
import com.wuyou.entity.AdExample;
/**
 * 
 * 吴优
 * @author wy
 * desciption:
 * other:
 */
public interface AdService {
    /**
     * 根据ID查询Ad中的信息
     * @param id
     * @return
     * @throws Exception
     */
	public Ad findAdById(Integer adId) throws Exception;
	
	public List<AdAndAdPosition> selectAdpositionNameFromAdAndAdPosition();
	/**
	 * 根据条件查询Ad中的信息
	 * @param example
	 * @return
	 */
	public  List<Ad> selectByExample(AdExample example);
	/**
	 * 根据ad_id删除广告信息
	 * @param adId
	 * @return
	 */
	public int deleteByPrimaryKey(Integer adId);
	/**
	 * 根据adId更改Ad表中的信息
	 * @param adId
	 * @param ad
	 * @return
	 * @throws Exception
	 */
	public int updateAdById(Ad ad) throws Exception;
    /**
     * 
     * @param ad
     * @return
     * @throws Exception
     */
	public int insertAd(Ad ad)throws Exception;

}
