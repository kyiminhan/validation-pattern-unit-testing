
package com.kyiminhan.service.impl;

import java.io.Serializable;

import com.kyiminhan.common.Constant;
import com.kyiminhan.dao.BaseDao;
import com.kyiminhan.service.BaseService;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class BaseServiceImpl.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @param <E> the element type
 * @since Mar 17, 2019 </BR>
 *        validation-model-pattern system </BR>
 *        com.kyiminhan.service.impl </BR>
 *        BaseServiceImpl.java </BR>
 */

@Slf4j
public abstract class BaseServiceImpl<E extends Serializable> implements BaseService<E> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The base dao. */
	private final BaseDao<E> baseDao;

	/**
	 * Instantiates a new base service impl.
	 *
	 * @param baseDao the base dao
	 */
	public BaseServiceImpl(final BaseDao<E> baseDao) {
		super();
		this.baseDao = baseDao;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.kyiminhan.service.BaseService#save(java.io.Serializable)
	 */
	@Override
	public void save(final E e) {
		final String className = this.getClass().getName();
		final String methodName = new Throwable().getStackTrace()[0].getMethodName();
		final String msgPath = "\t[" + methodName + "() method in the " + className + "]";
		final String message = Constant.SUCCESSFULLY_SAVE + msgPath;

		BaseServiceImpl.log.info(Constant.START + msgPath);
		this.baseDao.save(e);
		BaseServiceImpl.log.info(message);
		BaseServiceImpl.log.info(Constant.END + msgPath);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.kyiminhan.service.BaseService#findById(java.lang.Long)
	 */
	@Override
	public E findById(final Long id) {
		final String className = this.getClass().getName();
		final String methodName = new Throwable().getStackTrace()[0].getMethodName();
		final String msgPath = "\t[" + methodName + "() method in the " + className + "]";
		final String message = Constant.SUCCESSFULLY_FIND + msgPath;

		BaseServiceImpl.log.info(Constant.START + msgPath);
		BaseServiceImpl.log.info(message);
		BaseServiceImpl.log.info(Constant.END + msgPath);
		return this.baseDao.findById(id);
	}
}