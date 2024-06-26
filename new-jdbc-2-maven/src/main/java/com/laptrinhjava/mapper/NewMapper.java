package com.laptrinhjava.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjava.model.CategoryModel;
import com.laptrinhjava.model.NewsModel;

public class NewMapper implements RowMapper<NewsModel>{

	@Override
	public NewsModel mapRow(ResultSet resultSet) {	
		try {
			NewsModel news = new NewsModel();
			news.setId(resultSet.getLong("id"));
			news.setTitle(resultSet.getString("title"));
			news.setContent(resultSet.getString("content"));
			news.setCategoryId(resultSet.getLong("categoryid"));
			news.setThumbnall(resultSet.getString("thumbmall"));
			news.setShortDescription(resultSet.getString("shortdescriptionn"));
			news.setCreateBy(resultSet.getString("createdby"));
			news.setCreateDate(resultSet.getTimestamp("createddate"));
			if (resultSet.getTimestamp("modifieddate") != null) {
				news.setModifiedDate(resultSet.getTimestamp("modifieddate"));
			}
			if (resultSet.getString("modifiedby") != null) {
				news.setModifiedBy(resultSet.getString("modifiedby"));
			}
			return news;
			
		} catch (SQLException e) {
			return null;
		}
	}

}
