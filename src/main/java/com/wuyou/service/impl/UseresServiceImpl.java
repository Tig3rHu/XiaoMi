package com.wuyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuyou.dao.UseresMapper;
import com.wuyou.entity.Useres;
import com.wuyou.entity.UseresExample;
import com.wuyou.service.UseresService;
@Service
public class UseresServiceImpl implements UseresService {
	@Autowired
	private UseresMapper useresMapper;

	@Override
	public long countByExample(UseresExample example) {
		// TODO Auto-generated method stub
		return useresMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(UseresExample example) {
		// TODO Auto-generated method stub
		return useresMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return useresMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Useres record) {
		// TODO Auto-generated method stub
		return useresMapper.insert(record);
	}

	@Override
	public int insertSelective(Useres record) {
		// TODO Auto-generated method stub
		return useresMapper.insertSelective(record);
	}

	@Override
	public List<Useres> selectByExample(UseresExample example) {
		// TODO Auto-generated method stub
		return useresMapper.selectByExample(example);
	}

	@Override
	public Useres selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return useresMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Useres record, UseresExample example) {
		// TODO Auto-generated method stub
		return useresMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Useres record, UseresExample example) {
		// TODO Auto-generated method stub
		return useresMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Useres record) {
		// TODO Auto-generated method stub
		return useresMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Useres record) {
		// TODO Auto-generated method stub
		return useresMapper.updateByPrimaryKey(record);
	}
	
}
