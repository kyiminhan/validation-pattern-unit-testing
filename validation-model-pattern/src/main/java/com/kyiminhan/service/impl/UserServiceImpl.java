package com.kyiminhan.service.impl;

import com.kyiminhan.dao.BaseDao;
import com.kyiminhan.dao.UserDao;
import com.kyiminhan.entity.User;
import com.kyiminhan.service.UserService;

public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private UserDao userDao;

	public UserServiceImpl(BaseDao<User> baseDao) {
		super(baseDao);
		this.userDao = (UserDao) baseDao;
	}
}