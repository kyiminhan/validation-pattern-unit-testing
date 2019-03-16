package com.kyiminhan.validtor;

import java.io.Serializable;
import java.util.Map;

/**
 * The Interface ModelValidator.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @param <M> the generic type
 * @param <E> the element type
 * @since Mar 17, 2019 </BR>
 *        validation-model-pattern system </BR>
 *        com.kyiminhan.validtor </BR>
 *        ModelValidator.java </BR>
 */
public interface ModelValidator<M extends Serializable, E extends Serializable> {

	/**
	 * Validate.
	 *
	 * @param m the m
	 * @return Map
	 */
	Map<?, ?> validate(M m);
}