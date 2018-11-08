package com.kyiminhan.dao;

import java.io.Serializable;

public interface BaseDao<E extends Serializable> extends Serializable {

	void save(E e);

	E findById(Long id);

}