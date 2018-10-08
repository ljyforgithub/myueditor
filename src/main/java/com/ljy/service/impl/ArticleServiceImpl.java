package com.ljy.service.impl;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ljy.dao.ArticleMapper;
import com.ljy.dao.ShopMapper;
import com.ljy.model.Article;
import com.ljy.service.ArticleService;

/**
 * 
 * @author esonlee
 *
 */
@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleMapper articleMapper;
	@Autowired
	private ShopMapper shopMapper;

	/**
	 * 存储html
	 */
	@Override
	public String saveHtml(String content, String cname, String wname) {
		String msg = "";
		if (!cname.equals("")) {
			String id = shopMapper.selectByname(cname);
			if (id != null) {
				if ((!content.isEmpty()) && (!wname.isEmpty())) {
					Article art = new Article();
					art.setContent(content);
					art.setName(wname);
					art.setShopid(id);
					articleMapper.insertArticle(art);
					msg = "发布成功！！！";
				} else {
					msg = "发布不成功！！！内容不能空";
				}
			} else {
				msg = "所选餐厅不存在！！！";
			}
		} else {
			msg = "餐厅名不能为空！！！";
		}

		return msg;
	}

	/**
	 * 获取html
	 */
	@Override
	public String getHtml(String name) {
		Article article = articleMapper.selectByname(name);
		if(article != null) {
			JSONObject jb = new JSONObject(article);
			return jb.toString();
		}else {
			return "htmL为空";
		}
		
	}

}
