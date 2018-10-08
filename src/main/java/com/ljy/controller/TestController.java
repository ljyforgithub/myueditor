package com.ljy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljy.dao.ShopMapper;

@Controller
public class TestController {

	@Autowired
	private ShopMapper shopmapper;
	
	@RequestMapping("testname")
	@ResponseBody
	public String testname(@RequestParam("name")String name) {
		System.out.println(name);
		String id = shopmapper.selectByname(name);
		if(id!=null) {
			System.out.println(id);
			return id;
		}else {
		return "所选餐厅不存在";
		}
	}

}
