package com.laptrinhjava.service;

import com.laptrinhjava.model.UserModel;

public interface IUserService {
	
	UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
}
