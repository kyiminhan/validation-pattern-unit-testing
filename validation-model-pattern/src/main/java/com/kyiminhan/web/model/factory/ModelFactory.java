package com.kyiminhan.web.model.factory;

import java.io.Serializable;

public interface ModelFactory<M extends Serializable, E extends Serializable> {

	M build(E e);

}