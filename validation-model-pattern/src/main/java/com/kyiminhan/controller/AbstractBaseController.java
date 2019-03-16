package com.kyiminhan.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.kyiminhan.common.Constant;
import com.kyiminhan.service.BaseService;
import com.kyiminhan.validtor.ModelValidator;
import com.kyiminhan.web.model.factory.ModelFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class AbstractBaseController.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @param <M> the generic type
 * @param <E> the element type
 * @since Mar 17, 2019 </BR>
 * validation-model-pattern system </BR>
 * com.kyiminhan.controller </BR>
 * AbstractBaseController.java </BR>
 */

/** The Constant log. */
@Slf4j
public abstract class AbstractBaseController<M extends Serializable, E extends Serializable>
		implements BaseController<M, E> {

	/** The base service. */
	private final BaseService<E> baseService;

	/** The validator. */
	private final ModelValidator<M, E> validator;

	/** The factory. */
	private final ModelFactory<M, E> factory;

	/**
	 * Instantiates a new abstract base controller.
	 *
	 * @param baseService the base service
	 * @param validator   the validator
	 * @param factory     the factory
	 */
	public AbstractBaseController(final BaseService<E> baseService, final ModelValidator<M, E> validator,
			final ModelFactory<M, E> factory) {
		super();
		this.baseService = baseService;
		this.validator = validator;
		this.factory = factory;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.kyiminhan.controller.BaseController#save(java.io.Serializable)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public String save(final M m) {

		final String className = this.getClass().getName();
		final String methodName = new Throwable().getStackTrace()[0].getMethodName();
		final String msgPath = "\t[" + methodName + "() method in the " + className + "]";

		AbstractBaseController.log.info(Constant.START + msgPath);

		final Map<?, ?> map = this.validator.validate(m);
		if (map.containsKey(Constant.VALIDATE_ERRORS)) {
			final List<String> errorMessages = (List<String>) map.get(Constant.VALIDATE_ERRORS);
			errorMessages.forEach(msg -> AbstractBaseController.log.info(msg));
			AbstractBaseController.log.info(Constant.VALIDATE_ERRORS);
			AbstractBaseController.log.info(Constant.END + msgPath);
			return Constant.RESULT_ERROR;
		}
		this.baseService.save((E) map.get(Constant.VALIDATE_SUCCESS));
		AbstractBaseController.log.info(Constant.SUCCESSFULLY_SAVE + msgPath);
		AbstractBaseController.log.info(Constant.END + msgPath);
		return Constant.RESULT_SUCCESS;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.kyiminhan.controller.BaseController#find(java.lang.Long)
	 */
	@Override
	public M find(final Long id) {
		final String className = this.getClass().getName();
		final String methodName = new Throwable().getStackTrace()[0].getMethodName();
		final String msgPath = "\t[" + methodName + "() method in the " + className + "]";
		final String message = Constant.SUCCESSFULLY_FIND + msgPath;

		AbstractBaseController.log.info(Constant.START + msgPath);
		AbstractBaseController.log.info(message);
		AbstractBaseController.log.info(Constant.END + msgPath);
		return this.factory.build(this.baseService.findById(id));
	}
}