package com.kyiminhan.controller;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.kyiminhan.common.Constant;
import com.kyiminhan.dao.BaseDao;
import com.kyiminhan.dao.impl.UserDaoImpl;
import com.kyiminhan.entity.User;
import com.kyiminhan.service.BaseService;
import com.kyiminhan.service.impl.UserServiceImpl;
import com.kyiminhan.validtor.ModelValidator;
import com.kyiminhan.validtor.UserRegistrationModelValidator;
import com.kyiminhan.web.model.UserRegistrationModel;
import com.kyiminhan.web.model.factory.ModelFactory;
import com.kyiminhan.web.model.factory.UserRegistrationModelFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserControllerTest {
	BaseDao<User> baseDao = new UserDaoImpl();
	BaseService<User> baseService = new UserServiceImpl(this.baseDao);

//	for changePasswordModel
	ModelValidator<UserRegistrationModel, User> uValidator = new UserRegistrationModelValidator();
	ModelFactory<UserRegistrationModel, User> urFactory = new UserRegistrationModelFactory();
	AbstractBaseController<UserRegistrationModel, User> urController = new UserController(this.baseService,
			this.uValidator, this.urFactory);

	@Test
	public void testSave_01() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		String actualResult = this.urController.save(UserRegistrationModel.builder().build());
		UserControllerTest.log.info(actualResult);
		System.out.println("--------------------------------------------------------------------------------");
		Assert.assertEquals(Constant.RESULT_ERROR, actualResult);
	}

	@Test
	public void testSave_02() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		String actualResult = this.urController.save(UserRegistrationModel.builder().id(Long.valueOf(1199))
				.firstName("firstName").lastName("lastName").email("email@gmail.com").password("password")
				.phone("000000000").dateOfBirth(new Date()).build());
		UserControllerTest.log.info(actualResult);
		System.out.println("--------------------------------------------------------------------------------");
		Assert.assertEquals(Constant.RESULT_SUCCESS, actualResult);
	}

	@Test
	public void testFind_01() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		UserRegistrationModel model = this.urController.find(1L);
		System.out.println(model);
		System.out.println("--------------------------------------------------------------------------------");
		Assert.assertNotEquals(null, model);
	}

	@Test
	public void testFind_02() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		UserRegistrationModel model = this.urController.find(11111L);
		System.out.println(model);
		System.out.println("--------------------------------------------------------------------------------");
		Assert.assertEquals(null, model);
	}
}