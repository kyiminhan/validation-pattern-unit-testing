package com.kyiminhan.controller;

import com.kyiminhan.entity.User;
import com.kyiminhan.service.BaseService;
import com.kyiminhan.validtor.ModelValidator;
import com.kyiminhan.web.model.ChangePasswordModel;
import com.kyiminhan.web.model.factory.ModelFactory;

public class ChangePasswordController extends AbstractBaseController<ChangePasswordModel, User> {

	public ChangePasswordController(BaseService<User> baseService, ModelValidator<ChangePasswordModel, User> validator,
			ModelFactory<ChangePasswordModel, User> factory) {
		super(baseService, validator, factory);
	}

}
