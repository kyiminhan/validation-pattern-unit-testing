package com.kyiminhan.validtor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kyiminhan.common.Constant;
import com.kyiminhan.entity.User;
import com.kyiminhan.web.model.UserRegistrationModel;

/**
 * The Class UserRegistrationModelValidator.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since Mar 17, 2019 </BR>
 *        validation-model-pattern system </BR>
 *        com.kyiminhan.validtor </BR>
 *        UserRegistrationModelValidator.java </BR>
 */
public class UserRegistrationModelValidator extends AbstractModelValidator<UserRegistrationModel, User> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.kyiminhan.validtor.AbstractModelValidator#validate(java.io.Serializable)
	 */
	@Override
	public Map<?, ?> validate(final UserRegistrationModel m) {
		final List<String> errors = this.doValidate(m);
		if (!errors.isEmpty()) {
			final Map<String, List<String>> map = new HashMap<>();
			map.put(Constant.VALIDATE_ERRORS, errors);
			return map;
		}

		final Map<String, User> map = new HashMap<>();
		map.put(Constant.VALIDATE_SUCCESS,
				User.builder().id(m.getId()).firstName(m.getFirstName()).lastName(m.getLastName()).email(m.getEmail())
						.password(m.getPassword()).phone(m.getPhone()).dateOfBirth(m.getDateOfBirth()).build());
		return map;
	}
}