package com.kyiminhan.validtor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kyiminhan.common.Constant;
import com.kyiminhan.entity.User;
import com.kyiminhan.web.model.ChangePasswordModel;

/**
 * The Class ChangePasswordModelValidator.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since Mar 17, 2019 </BR>
 *        validation-model-pattern system </BR>
 *        com.kyiminhan.validtor </BR>
 *        ChangePasswordModelValidator.java </BR>
 */
public class ChangePasswordModelValidator extends AbstractModelValidator<ChangePasswordModel, User> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.kyiminhan.validtor.AbstractModelValidator#validate(java.io.Serializable)
	 */
	@Override
	public Map<?, ?> validate(final ChangePasswordModel m) {
		final List<String> errors = this.doValidate(m);
		if (!errors.isEmpty()) {
			final Map<String, List<String>> map = new HashMap<>();
			map.put(Constant.VALIDATE_ERRORS, errors);
			return map;
		}
		final Map<String, User> map = new HashMap<>();
		map.put(Constant.VALIDATE_SUCCESS, User.builder().email(m.getEmail()).password(m.getNewPassword()).build());
		return map;
	}
}