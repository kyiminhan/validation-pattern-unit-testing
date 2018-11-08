
package com.kyiminhan.service.impl;

import java.io.Serializable;

import com.kyiminhan.common.Constant;
import com.kyiminhan.dao.BaseDao;
import com.kyiminhan.service.BaseService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class BaseServiceImpl<E extends Serializable> implements BaseService<E> {

	private static final long serialVersionUID = 1L;
	private BaseDao<E> baseDao;

	public BaseServiceImpl(BaseDao<E> baseDao) {
		super();
		this.baseDao = baseDao;
	}

	@Override
	public void save(E e) {
		String className = this.getClass().getName();
		String methodName = new Throwable().getStackTrace()[0].getMethodName();
		String msgPath = "\t[" + methodName + "() method in the " + className + "]";
		String message = Constant.get().SUCCESSFULLY_SAVE + msgPath;

		log.info(Constant.get().START + msgPath);
		this.baseDao.save(e);
		log.info(message);
		log.info(Constant.get().END + msgPath);
	}

	@Override
	public E findById(Long id) {
		String className = this.getClass().getName();
		String methodName = new Throwable().getStackTrace()[0].getMethodName();
		String msgPath = "\t[" + methodName + "() method in the " + className + "]";
		String message = Constant.get().SUCCESSFULLY_FIND + msgPath;

		log.info(Constant.get().START + msgPath);
		log.info(message);
		log.info(Constant.get().END + msgPath);
		return this.baseDao.findById(id);
	}
}