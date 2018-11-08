package com.kyiminhan.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kyiminhan.common.Constant;
import com.kyiminhan.dao.UserDao;
import com.kyiminhan.entity.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	private static final long serialVersionUID = 1L;

	@Override
	public User findById(Long id) {
		String className = this.getClass().getName();
		String methodName = new Throwable().getStackTrace()[0].getMethodName();
		String msgPath = "\t[" + methodName + "() method in the " + className + "]";
		String message = Constant.get().SUCCESSFULLY_FIND + msgPath;

		User user = null;
		log.info(Constant.get().START + msgPath);
		log.info(message);
		log.info(Constant.get().END + msgPath);
		for (User usr : getUserList()) {
			if (id == usr.getId())
				user = usr;
		}
		return user;
	}

	public List<User> getUserList() {
		List<User> users = new ArrayList<>();
		for (int i = 1; i < 20; i++) {
			users.add(User.builder().id(Long.valueOf(i)).firstName("firstName" + 1).lastName("lastName" + i)
					.email("email" + i + "@gmail.com").password("password" + i).phone("000000000" + i)
					.dateOfBirth(new Date()).build());
		}
		return users;
	}
}