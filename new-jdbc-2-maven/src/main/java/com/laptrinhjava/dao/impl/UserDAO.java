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
import com.laptrinhjava.dao.IUserDAO;
import com.laptrinhjava.mapper.NewMapper;
import com.laptrinhjava.mapper.UserMapper;
import com.laptrinhjava.model.NewsModel;
import com.laptrinhjava.model.UserModel;

public class UserDAO extends AbstractDAO<UserModel> implements IUserDAO  {

	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		StringBuilder sql = new StringBuilder("SELECT * FROM new_servlet.user AS U ") ;
		sql.append(" INNER JOIN role AS r ON r.id = u.roleid ");
		sql.append(" WHERE username = ? AND password = ? AND status = ? ");
		List<UserModel> user = query(sql.toString(), new UserMapper(), userName, password, status);
		return user.isEmpty() ? null : user.get(0);
		
	}
	

}
