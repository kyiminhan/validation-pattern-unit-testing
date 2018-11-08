package com.kyiminhan.validtor;

import java.io.Serializable;
import java.util.Map;

public interface ModelValidator<M extends Serializable, E extends Serializable> {

	Map<?, ?> validate(M m);

}