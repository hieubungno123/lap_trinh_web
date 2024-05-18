package com.laptrinhjava.service;

import java.util.List;

import com.laptrinhjava.model.NewsModel;

public interface INewService {
	List<NewsModel> findByCategoryId(Long categoryId);
	NewsModel save(NewsModel newModel);
	void delete(Long[] ids);
	NewsModel update(NewsModel updateNews);
	List<NewsModel> findAll();
	
}  