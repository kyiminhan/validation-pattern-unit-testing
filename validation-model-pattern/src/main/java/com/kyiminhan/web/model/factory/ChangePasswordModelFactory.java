package com.kyiminhan.web.model.factory;

import com.kyiminhan.entity.User;
import com.kyiminhan.web.model.ChangePasswordModel;

public class ChangePasswordModelFactory implements ModelFactory<ChangePasswordModel, User> {

	@Override
	public ChangePasswordModel build(User e) {
		return (null != e) ? ChangePasswordModel.builder().email(e.getEmail()).build() : null;
	}

}