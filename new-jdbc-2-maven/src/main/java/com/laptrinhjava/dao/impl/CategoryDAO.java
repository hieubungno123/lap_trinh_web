package com.laptrinhjava.dao.impl;

import java.util.List;

import com.laptrinhjava.dao.ICategoryDAO;
import com.laptrinhjava.mapper.CategoryMapper;
import com.laptrinhjava.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO{
	

	
// tạo 1 Connection	, đầu tiên: load 1 cái driver bằng class.forName
//	tạo ra 1 câu lệnh sql 	
//	Để thực thi câu lệnh sql ta dùng câu lệnh PreparedStatement
//	Để thực thi, truyền PreparedStatement vào ResultSet và dùng câu executeQuery()
//  Và nó sẽ trả về 1 đối tượng resultSet
	
	
	@Override
	public List<CategoryModel> findAll() {	
		String sql ="SELECT * FROM new_servlet.category";
		return query(sql, new CategoryMapper());

	}
}
