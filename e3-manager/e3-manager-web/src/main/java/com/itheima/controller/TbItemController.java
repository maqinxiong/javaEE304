package com.itheima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.pojo.TbItem;
import com.itheima.service.TbItemService;

@Controller
public class TbItemController {

	@Autowired
	private TbItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem fingById(@PathVariable Long itemId){
		TbItem tbItem = itemService.findById(itemId);
		return tbItem;
	}
}
