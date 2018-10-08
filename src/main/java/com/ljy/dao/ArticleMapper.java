package com.ljy.dao;

import com.ljy.model.Article;

public interface ArticleMapper {

	public void insertArticle(Article article);
	public Article selectByname(String name);
	
}
