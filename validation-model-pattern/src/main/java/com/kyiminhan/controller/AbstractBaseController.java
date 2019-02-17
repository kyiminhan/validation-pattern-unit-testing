package com.kyiminhan.controller;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.kyiminhan.common.Constant;
import com.kyiminhan.service.BaseService;
import com.kyiminhan.validtor.ModelValidator;
import com.kyiminhan.web.model.factory.ModelFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractBaseController<M extends Serializable, E extends Serializable>
		implements BaseController<M, E> {

	private BaseService<E> baseService;
	private ModelValidator<M, E> validator;
	private ModelFactory<M, E> factory;

	public AbstractBaseController(BaseService<E> baseService, ModelValidator<M, E> validator,
			ModelFactory<M, E> factory) {
		super();
		this.baseService = baseService;
		this.validator = validator;
		this.factory = factory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public String save(M m) {

		String className = this.getClass().getName();
		String methodName = new Throwable().getStackTrace()[0].getMethodName();
		String msgPath = "\t[" + methodName + "() method in the " + className + "]";

		AbstractBaseController.log.info(Constant.START + msgPath);

		Map<?, ?> map = this.validator.validate(m);
		if (map.containsKey(Constant.VALIDATE_ERRORS)) {
			List<String> errorMessages = (List<String>) map.get(Constant.VALIDATE_ERRORS);
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

	@Override
	public M find(Long id) {
		String className = this.getClass().getName();
		String methodName = new Throwable().getStackTrace()[0].getMethodName();
		String msgPath = "\t[" + methodName + "() method in the " + className + "]";
		String message = Constant.SUCCESSFULLY_FIND + msgPath;

		AbstractBaseController.log.info(Constant.START + msgPath);
		AbstractBaseController.log.info(message);
		AbstractBaseController.log.info(Constant.END + msgPath);
		return this.factory.build(this.baseService.findById(id));
	}
}