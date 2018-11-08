package com.kyiminhan.controller;

import java.io.Serializable;

public interface BaseController<M extends Serializable, E extends Serializable> {

	public String save(M m);

	public M find(Long id);
}
