package com.kyiminhan.web.model.factory;

import com.kyiminhan.entity.User;
import com.kyiminhan.web.model.ChangePasswordModel;

/**
 * A factory for creating ChangePasswordModel objects.
 */
public class ChangePasswordModelFactory implements ModelFactory<ChangePasswordModel, User> {

	/*
	 * (non-Javadoc)
	 *
	 * @see com.kyiminhan.web.model.factory.ModelFactory#build(java.io.Serializable)
	 */
	@Override
	public ChangePasswordModel build(final User e) {
		return (null != e) ? ChangePasswordModel.builder().email(e.getEmail()).build() : null;
	}
}