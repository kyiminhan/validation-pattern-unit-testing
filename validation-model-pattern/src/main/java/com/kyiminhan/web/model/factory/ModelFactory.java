package com.kyiminhan.web.model.factory;

import java.io.Serializable;

/**
 * A factory for creating Model objects.
 *
 * @param <M> the generic type
 * @param <E> the element type
 */
public interface ModelFactory<M extends Serializable, E extends Serializable> {

	/**
	 * Builds the.
	 *
	 * @param e the e
	 * @return M
	 */
	M build(E e);
}