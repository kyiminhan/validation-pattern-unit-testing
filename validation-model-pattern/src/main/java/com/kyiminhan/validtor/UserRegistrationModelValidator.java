package com.kyiminhan.validtor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kyiminhan.common.Constant;
import com.kyiminhan.entity.User;
import com.kyiminhan.web.model.UserRegistrationModel;

public class UserRegistrationModelValidator extends AbstractModelValidator<UserRegistrationModel, User> {

	@Override
	public Map<?, ?> validate(UserRegistrationModel m) {
		List<String> errors = this.doValidate(m);
		if (!errors.isEmpty()) {
			Map<String, List<String>> map = new HashMap<>();
			map.put(Constant.VALIDATE_ERRORS, errors);
			return map;
		}

		Map<String, User> map = new HashMap<>();
		map.put(Constant.VALIDATE_SUCCESS,
				User.builder().id(m.getId()).firstName(m.getFirstName()).lastName(m.getLastName()).email(m.getEmail())
						.password(m.getPassword()).phone(m.getPhone()).dateOfBirth(m.getDateOfBirth()).build());
		return map;
	}
}