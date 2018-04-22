package com.itheima.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.mapper.TbItemMapper;
import com.itheima.pojo.TbItem;
import com.itheima.service.TbItemService;
@Service
public class TbItemServiceImpl implements TbItemService{

	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	public TbItem findById(Long id) {
		TbItem tbitem = itemMapper.selectByPrimaryKey(id);
		return tbitem;
	}

}
