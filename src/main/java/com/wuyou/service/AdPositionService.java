/**
 * 
 */
package com.wuyou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.wuyou.entity.AdPosition;
import com.wuyou.entity.AdPositionExample;

/**
 * 吴优
 * @author wy
 * desciption:
 * other:
 */
public interface AdPositionService {
	@Autowired

	
    /**
     * 添加
     * @param record
     * @return
     */
	int insert(AdPosition record) throws Exception;
    /**
    * 删除
    * @param positionId
    * @return
    * @throws Exception
    */
	int deleteByPrimaryKey(Integer positionId) throws Exception;
    /**
     * 修改
     * @param positionId
     * @param record
     * @return
     * @throws Exception
     */
	public int updateAdPostionByPositionId(Integer positionId,AdPosition record) throws Exception;
    /**
     * 根据positionId查询
     * @param positionId
     * @return
     */
	public AdPosition selectByPrimaryKey(Integer positionId);
	/**
	 * 
	 * @param example
	 * @return
	 */
	public List<AdPosition> selectByExample(AdPositionExample example);

}
