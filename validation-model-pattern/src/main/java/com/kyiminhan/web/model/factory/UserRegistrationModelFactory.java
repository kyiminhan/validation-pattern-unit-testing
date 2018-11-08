package com.kyiminhan.web.model.factory;

import com.kyiminhan.entity.User;
import com.kyiminhan.web.model.UserRegistrationModel;

public class UserRegistrationModelFactory implements ModelFactory<UserRegistrationModel, User> {

	@Override
	public UserRegistrationModel build(User e) {
		return (null != e)
				? UserRegistrationModel.builder().id(e.getId()).firstName(e.getFirstName()).lastName(e.getLastName())
						.email(e.getEmail()).password(e.getPassword()).phone(e.getPhone())
						.dateOfBirth(e.getDateOfBirth()).build()
				: null;
	}

}