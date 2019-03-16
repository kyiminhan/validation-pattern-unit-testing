package com.kyiminhan.controller;

import java.io.Serializable;

/**
 * The Interface BaseController.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @param <M> the generic type
 * @param <E> the element type
 * @since Mar 17, 2019 </BR>
 *        validation-model-pattern system </BR>
 *        com.kyiminhan.controller </BR>
 *        BaseController.java </BR>
 */
public interface BaseController<M extends Serializable, E extends Serializable> {

	/**
	 * Save.
	 *
	 * @param m the m
	 * @return String
	 */
	String save(M m);

	/**
	 * Find.
	 *
	 * @param id the id
	 * @return M
	 */
	M find(Long id);
}