package com.kyiminhan.service.impl;

import com.kyiminhan.dao.BaseDao;
import com.kyiminhan.dao.UserDao;
import com.kyiminhan.entity.User;
import com.kyiminhan.service.UserService;

/**
 * The Class UserServiceImpl.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since Mar 17, 2019 </BR>
 *        validation-model-pattern system </BR>
 *        com.kyiminhan.service.impl </BR>
 *        UserServiceImpl.java </BR>
 */
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The user dao. */
	@SuppressWarnings("unused")
	private final UserDao userDao;

	/**
	 * Instantiates a new user service impl.
	 *
	 * @param baseDao the base dao
	 */
	public UserServiceImpl(final BaseDao<User> baseDao) {
		super(baseDao);
		this.userDao = (UserDao) baseDao;
	}
}