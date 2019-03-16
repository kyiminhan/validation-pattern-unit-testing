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

/**
 * The Class AbstractModelValidator.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @param <M> the generic type
 * @param <E> the element type
 * @since Mar 17, 2019 </BR>
 *        validation-model-pattern system </BR>
 *        com.kyiminhan.validtor </BR>
 *        AbstractModelValidator.java </BR>
 */
public abstract class AbstractModelValidator<M extends Serializable, E extends Serializable>
		implements ModelValidator<M, E> {

	/**
	 * Do validate.
	 *
	 * @param m the m
	 * @return List
	 */
	protected List<String> doValidate(final M m) {

		final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		final Validator validator = factory.getValidator();
		final Set<ConstraintViolation<M>> constraintViolations = validator.validate(m);

		final Map<String, String> map = new HashMap<>();
		this.getObjectFields(m).forEach(f -> {
			constraintViolations.forEach(cv -> {
				if (f.equals(cv.getPropertyPath().toString())) {
					map.put(f, cv.getMessage());
					// TODO remove return
					return;
				}
			});
		});

		return this.getMessage(map);
	}

	/**
	 * Gets the object fields.
	 *
	 * @param m the m
	 * @return the object fields
	 */
	private Set<String> getObjectFields(final M m) {

		final Field[] fields = m.getClass().getDeclaredFields();
		final Set<String> list = new HashSet<>();
		Arrays.asList(fields).forEach(field -> {
			field.setAccessible(true);
			list.add(field.getName());
		});
		return list;
	}

	/**
	 * Gets the message.
	 *
	 * @param map the map
	 * @return the message
	 */
	private List<String> getMessage(final Map<String, String> map) {
		final List<String> list = new ArrayList<>();
		final ResourceBundle bundle = ResourceBundle.getBundle("messages");
		map.forEach((k, v) -> {
			final String message = bundle.getString(v);
			final String param = bundle.getString(k);
			list.add(MessageFormat.format(message, param));
		});
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.kyiminhan.validtor.ModelValidator#validate(java.io.Serializable)
	 */
	@Override
	abstract public Map<?, ?> validate(M m);
}