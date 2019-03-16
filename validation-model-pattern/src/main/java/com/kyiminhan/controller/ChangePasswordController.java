package com.kyiminhan.controller;

import com.kyiminhan.entity.User;
import com.kyiminhan.service.BaseService;
import com.kyiminhan.validtor.ModelValidator;
import com.kyiminhan.web.model.ChangePasswordModel;
import com.kyiminhan.web.model.factory.ModelFactory;

/**
 * The Class ChangePasswordController.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since Mar 17, 2019 </BR>
 *        validation-model-pattern system </BR>
 *        com.kyiminhan.controller </BR>
 *        ChangePasswordController.java </BR>
 */
public class ChangePasswordController extends AbstractBaseController<ChangePasswordModel, User> {

	/**
	 * Instantiates a new change password controller.
	 *
	 * @param baseService the base service
	 * @param validator   the validator
	 * @param factory     the factory
	 */
	public ChangePasswordController(final BaseService<User> baseService,
			final ModelValidator<ChangePasswordModel, User> validator,
			final ModelFactory<ChangePasswordModel, User> factory) {
		super(baseService, validator, factory);
	}
}