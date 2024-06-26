package com.laptrinhjava.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.laptrinhjava.dao.INewDAO;
import com.laptrinhjava.model.NewsModel;
import com.laptrinhjava.service.INewService;

public class NewService implements INewService{
	
	@Inject
	private INewDAO newDAO;
	

	
	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		// TODO Auto-generated method stub
		return newDAO.findByCategoryId(categoryId);
	}

	@Override
	public NewsModel save(NewsModel newModel) {
		newModel.setCreateDate(new Timestamp(System.currentTimeMillis()));
		newModel.setCreateBy("");
		Long newId = newDAO.save(newModel);
		return newDAO.findOne(newId);
	}

	@Override
	public void delete(Long[] ids) {
		for (long id: ids) {
			newDAO.delete(id);
		}
		
	}

	@Override
	public NewsModel update(NewsModel updateNews) {
		NewsModel oldNew = newDAO.findOne(updateNews.getId());
		updateNews.setCreateDate(oldNew.getCreateDate());
		updateNews.setCreateBy(oldNew.getCreateBy());
		updateNews.setModifiedDate(new Timestamp(System.currentTimeMillis()));
		updateNews.setModifiedBy("");
		newDAO.update(updateNews);
		return newDAO.findOne(updateNews.getId());
	}

	@Override
	public List<NewsModel> findAll() {
		return newDAO.findAll();
	}

	@Override
	public NewsModel findOne(Long id) {
		return newDAO.findOne(id);
	}


	
	
	
	
}
