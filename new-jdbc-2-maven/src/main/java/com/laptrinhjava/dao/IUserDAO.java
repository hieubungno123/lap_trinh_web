package com.laptrinhjava.dao;

import java.util.List;

import com.laptrinhjava.model.NewsModel;
import com.laptrinhjava.model.UserModel;

public interface IUserDAO extends GenericDAO<UserModel>{
	UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
}
