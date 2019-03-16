package com.kyiminhan.dao.impl;

import java.io.Serializable;

import com.kyiminhan.common.Constant;
import com.kyiminhan.dao.BaseDao;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class BaseDaoImpl.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @param <E> the element type
 * @since Mar 17, 2019 </BR>
 * validation-model-pattern system </BR>
 * com.kyiminhan.dao.impl </BR>
 * BaseDaoImpl.java </BR>
 */

/** The Constant log. */
@Slf4j
public abstract class BaseDaoImpl<E extends Serializable> implements BaseDao<E> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.kyiminhan.dao.BaseDao#save(java.io.Serializable)
	 */
	@Override
	public void save(final E e) {
		final String className = this.getClass().getName();
		final String methodName = new Throwable().getStackTrace()[0].getMethodName();
		final String msgPath = "\t[" + methodName + "() method in the " + className + "]";
		final String message = Constant.SUCCESSFULLY_SAVE + msgPath;

		BaseDaoImpl.log.info(Constant.START + msgPath);
		BaseDaoImpl.log.info(message);
		BaseDaoImpl.log.info(Constant.END + msgPath);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.kyiminhan.dao.BaseDao#findById(java.lang.Long)
	 */
	@Override
	public abstract E findById(Long id);

}