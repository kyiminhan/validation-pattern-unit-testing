package com.kyiminhan.validtor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kyiminhan.common.Constant;
import com.kyiminhan.entity.User;
import com.kyiminhan.web.model.ChangePasswordModel;

public class ChangePasswordModelValidator extends AbstractModelValidator<ChangePasswordModel, User> {

	@Override
	public Map<?, ?> validate(ChangePasswordModel m) {
		List<String> errors = doValidate(m);
		if (!errors.isEmpty()) {
			Map<String, List<String>> map = new HashMap<>();
			map.put(Constant.get().VALIDATE_ERRORS, errors);
			return map;
		}
		Map<String, User> map = new HashMap<>();
		map.put(Constant.get().VALIDATE_SUCCESS,
				User.builder().email(m.getEmail()).password(m.getNewPassword()).build());
		return map;
	}
}