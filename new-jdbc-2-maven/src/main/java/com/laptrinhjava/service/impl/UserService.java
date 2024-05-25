package com.laptrinhjava.service.impl;

import javax.inject.Inject;

import com.laptrinhjava.dao.IUserDAO;
import com.laptrinhjava.model.UserModel;
import com.laptrinhjava.service.IUserService;

public class UserService implements IUserService {
	
	@Inject
	private IUserDAO iUserDAO;

	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		return iUserDAO.findByUserNameAndPasswordAndStatus(userName, password, status);

	}
	
	
	
	
}
