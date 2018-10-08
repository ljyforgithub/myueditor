package com.ljy.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ljy.service.ArticleService;

@Controller
public class AirticleController {

	private static final Logger logger = LogManager.getLogger(AirticleController.class);
	@Autowired
	private ArticleService artSer;

	@RequestMapping("savehtml")
	@ResponseBody
	public String savehtml(@RequestParam("text") String content, @RequestParam("wname") String wname,
			@RequestParam("cname") String cname) {
		String msg = artSer.saveHtml(content, cname, wname);
		return msg;
	}

	@RequestMapping("getHtml")
	@ResponseBody
	public String getHtml(@RequestParam("name") String name) {
		String content = artSer.getHtml(name);
		return content;
	}
}
