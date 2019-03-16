package com.kyiminhan.web.model.factory;

import com.kyiminhan.entity.User;
import com.kyiminhan.web.model.UserRegistrationModel;

/**
 * A factory for creating UserRegistrationModel objects.
 */
public class UserRegistrationModelFactory implements ModelFactory<UserRegistrationModel, User> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.kyiminhan.web.model.factory.ModelFactory#build(java.io.Serializable)
	 */
	@Override
	public UserRegistrationModel build(final User e) {
		return (null != e)
				? UserRegistrationModel.builder().id(e.getId()).firstName(e.getFirstName()).lastName(e.getLastName())
						.email(e.getEmail()).password(e.getPassword()).phone(e.getPhone())
						.dateOfBirth(e.getDateOfBirth()).build()
				: null;
	}
}