package com.kyiminhan.service;

import java.io.Serializable;

public interface BaseService<E extends Serializable> extends Serializable {

	void save(E e);

	E findById(Long id);

}