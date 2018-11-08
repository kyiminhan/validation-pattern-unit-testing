package com.kyiminhan.controller;

import com.kyiminhan.entity.User;
import com.kyiminhan.service.BaseService;
import com.kyiminhan.validtor.ModelValidator;
import com.kyiminhan.web.model.UserRegistrationModel;
import com.kyiminhan.web.model.factory.ModelFactory;

public class UserController extends AbstractBaseController<UserRegistrationModel, User> {

	public UserController(BaseService<User> baseService, ModelValidator<UserRegistrationModel, User> validator,
			ModelFactory<UserRegistrationModel, User> factory) {
		super(baseService, validator, factory);
	}

}