package com.laptrinhjava.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.laptrinhjava.dao.INewDAO;
import com.laptrinhjava.mapper.NewMapper;
import com.laptrinhjava.model.NewsModel;

public class NewDAO extends AbstractDAO<NewsModel> implements INewDAO  {
	

	
	@Override
	public List<NewsModel> findByCategoryId(Long categoryId) {
		String sql ="SELECT * FROM new_servlet.news WHERE categoryid = ?";
		return query(sql, new NewMapper(), categoryId);
	}
	
//			executeUpdate dùng cho delete, put, post
	
	@Override
	public Long save(NewsModel newsModel) {
//		String sql = "INSERT INTO new_servlet.news (title, content, categoryid) VALUES(?,?,?)";
		StringBuilder sql = new StringBuilder("INSERT INTO new_servlet.news (title, content, ");
		sql.append(" thumbmall , shortdescriptionn) ");
		sql.append(" VALUES(?,?,?,?)");
		return insert(sql.toString(), newsModel.getTitle(), newsModel.getContent(),
				newsModel.getThumbnall(),newsModel.getShortDescription());
	}

	@Override
	public void delete(Long id) {
		String sql = "DELETE FROM new_servlet.news WHERE id = ?";
		delete(sql, id);
	}

	@Override
	public void update(NewsModel updateNew) {
		StringBuilder sql = new StringBuilder("UPDATE new_servlet.news ");
		  sql.append(" SET title = ? ,content = ? ,shortdescriptionn = ? ,thumbmall = ?,");
		  sql.append(" ");
		  sql.append(" WHERE id = ?");

		update(sql.toString(), updateNew.getTitle(), updateNew.getContent(),
				updateNew.getShortDescription(), updateNew.getThumbnall(),
				 updateNew.getId());
	
	}

	@Override
	public NewsModel findOne(Long id) {
		String sql ="SELECT * FROM new_servlet.news WHERE id = ?";
		List<NewsModel> news = query(sql, new NewMapper(), id);
		return news.isEmpty() ? null : news.get(0);
	}

	@Override
	public List<NewsModel> findAll() {
		String sql ="SELECT * FROM new_servlet.news";
		return query(sql, new NewMapper());
	}


	
	
	
	
	
	
	
	
}
