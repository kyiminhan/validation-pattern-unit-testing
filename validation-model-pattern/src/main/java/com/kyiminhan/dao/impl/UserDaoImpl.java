package com.kyiminhan.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kyiminhan.common.Constant;
import com.kyiminhan.dao.UserDao;
import com.kyiminhan.entity.User;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class UserDaoImpl.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since Mar 17, 2019 </BR>
 * validation-model-pattern system </BR>
 * com.kyiminhan.dao.impl </BR>
 * UserDaoImpl.java </BR>
 */

/** The Constant log. */
@Slf4j
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.kyiminhan.dao.impl.BaseDaoImpl#findById(java.lang.Long)
	 */
	@Override
	public User findById(final Long id) {
		final String className = this.getClass().getName();
		final String methodName = new Throwable().getStackTrace()[0].getMethodName();
		final String msgPath = "\t[" + methodName + "() method in the " + className + "]";
		final String message = Constant.SUCCESSFULLY_FIND + msgPath;

		User user = null;
		UserDaoImpl.log.info(Constant.START + msgPath);
		UserDaoImpl.log.info(message);
		UserDaoImpl.log.info(Constant.END + msgPath);
		for (final User usr : this.getUserList()) {
			if (id == usr.getId()) {
				user = usr;
			}
		}
		return user;
	}

	/**
	 * Gets the user list.
	 *
	 * @return the user list
	 */
	public List<User> getUserList() {
		final List<User> users = new ArrayList<>();
		for (int i = 1; i < 20; i++) {
			users.add(User.builder().id(Long.valueOf(i)).firstName("firstName" + 1).lastName("lastName" + i)
					.email("email" + i + "@gmail.com").password("password" + i).phone("000000000" + i)
					.dateOfBirth(new Date()).build());
		}
		return users;
	}
}