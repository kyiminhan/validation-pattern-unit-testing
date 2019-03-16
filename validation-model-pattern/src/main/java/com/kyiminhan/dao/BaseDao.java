package com.kyiminhan.dao;

import java.io.Serializable;

/**
 * The Interface BaseDao.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @param <E> the element type
 * @since Mar 17, 2019 </BR>
 *        validation-model-pattern system </BR>
 *        com.kyiminhan.dao </BR>
 *        BaseDao.java </BR>
 */
public interface BaseDao<E extends Serializable> extends Serializable {

	/**
	 * Save.
	 *
	 * @param e the e
	 */
	void save(E e);

	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return E
	 */
	E findById(Long id);
}