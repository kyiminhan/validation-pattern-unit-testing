package com.kyiminhan.controller;

import com.kyiminhan.entity.User;
import com.kyiminhan.service.BaseService;
import com.kyiminhan.validtor.ModelValidator;
import com.kyiminhan.web.model.UserRegistrationModel;
import com.kyiminhan.web.model.factory.ModelFactory;

/**
 * The Class UserController.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since Mar 17, 2019 </BR>
 *        validation-model-pattern system </BR>
 *        com.kyiminhan.controller </BR>
 *        UserController.java </BR>
 */
public class UserController extends AbstractBaseController<UserRegistrationModel, User> {

	/**
	 * Instantiates a new user controller.
	 *
	 * @param baseService the base service
	 * @param validator   the validator
	 * @param factory     the factory
	 */
	public UserController(final BaseService<User> baseService,
			final ModelValidator<UserRegistrationModel, User> validator,
			final ModelFactory<UserRegistrationModel, User> factory) {
		super(baseService, validator, factory);
	}
}