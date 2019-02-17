package com.kyiminhan.dao.impl;

import java.io.Serializable;

import com.kyiminhan.common.Constant;
import com.kyiminhan.dao.BaseDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class BaseDaoImpl<E extends Serializable> implements BaseDao<E> {

	private static final long serialVersionUID = 1L;

	@Override
	public void save(E e) {
		String className = this.getClass().getName();
		String methodName = new Throwable().getStackTrace()[0].getMethodName();
		String msgPath = "\t[" + methodName + "() method in the " + className + "]";
		String message = Constant.SUCCESSFULLY_SAVE + msgPath;

		BaseDaoImpl.log.info(Constant.START + msgPath);
		BaseDaoImpl.log.info(message);
		BaseDaoImpl.log.info(Constant.END + msgPath);
	}

	@Override
	public abstract E findById(Long id);

}