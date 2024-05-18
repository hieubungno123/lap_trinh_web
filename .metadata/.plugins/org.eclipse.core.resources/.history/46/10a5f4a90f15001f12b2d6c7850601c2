package com.laptrinhjava.dao;

import java.util.List;

import com.laptrinhjava.model.NewsModel;

public interface INewDAO extends GenericDAO<NewsModel>{
	List<NewsModel> findByCategoryId(Long categoryId);
	Long save(NewsModel newsModel);
	NewsModel findOne(Long id);
	void delete(Long id);
	void update(NewsModel updateNew);
	List<NewsModel> findAll();
}
