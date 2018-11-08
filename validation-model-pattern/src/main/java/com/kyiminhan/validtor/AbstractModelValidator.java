package com.kyiminhan.validtor;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public abstract class AbstractModelValidator<M extends Serializable, E extends Serializable>
		implements ModelValidator<M, E> {
	protected List<String> doValidate(M m) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<M>> constraintViolations = validator.validate(m);

		Map<String, String> map = new HashMap<>();
		getObjectFields(m).forEach(f -> {
			constraintViolations.forEach(cv -> {
				if (f.equals(cv.getPropertyPath().toString())) {
					map.put(f, cv.getMessage());
					// TODO remove return
					return;
				}
			});
		});

		return getMessage(map);
	}

	private Set<String> getObjectFields(M m) {

		Field[] fields = m.getClass().getDeclaredFields();
		Set<String> list = new HashSet<>();
		Arrays.asList(fields).forEach(field -> {
			field.setAccessible(true);
			list.add(field.getName());
		});
		return list;
	}

	private List<String> getMessage(Map<String, String> map) {
		List<String> list = new ArrayList<>();
		ResourceBundle bundle = ResourceBundle.getBundle("messages");
		map.forEach((k, v) -> {
			String message = bundle.getString(v);
			String param = bundle.getString(k);
			list.add(MessageFormat.format(message, param));
		});
		return list;
	}

	@Override
	abstract public Map<?, ?> validate(M m);
}