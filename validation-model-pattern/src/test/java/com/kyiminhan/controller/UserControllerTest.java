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

/**
 * The Class UserControllerTest.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since Mar 17, 2019 </BR>
 *        validation-model-pattern system </BR>
 *        com.kyiminhan.controller </BR>
 *        UserControllerTest.java </BR>
 */
@Slf4j
public class UserControllerTest {

	/** The base dao. */
	BaseDao<User> baseDao = new UserDaoImpl();

	/** The base service. */
	BaseService<User> baseService = new UserServiceImpl(this.baseDao);

	/** The u validator. */
	// for changePasswordModel
	ModelValidator<UserRegistrationModel, User> uValidator = new UserRegistrationModelValidator();

	/** The ur factory. */
	ModelFactory<UserRegistrationModel, User> urFactory = new UserRegistrationModelFactory();

	/** The ur controller. */
	AbstractBaseController<UserRegistrationModel, User> urController = new UserController(this.baseService,
			this.uValidator, this.urFactory);

	/**
	 * Test save 01.
	 */
	@Test
	public void testSave_01() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		final String actualResult = this.urController.save(UserRegistrationModel.builder().build());
		UserControllerTest.log.info(actualResult);
		System.out.println("--------------------------------------------------------------------------------");
		Assert.assertEquals(Constant.RESULT_ERROR, actualResult);
	}

	/**
	 * Test save 02.
	 */
	@Test
	public void testSave_02() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		final String actualResult = this.urController.save(UserRegistrationModel.builder().id(Long.valueOf(1199))
				.firstName("firstName").lastName("lastName").email("email@gmail.com").password("password")
				.phone("000000000").dateOfBirth(new Date()).build());
		UserControllerTest.log.info(actualResult);
		System.out.println("--------------------------------------------------------------------------------");
		Assert.assertEquals(Constant.RESULT_SUCCESS, actualResult);
	}

	/**
	 * Test find 01.
	 */
	@Test
	public void testFind_01() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		final UserRegistrationModel model = this.urController.find(1L);
		System.out.println(model);
		System.out.println("--------------------------------------------------------------------------------");
		Assert.assertNotEquals(null, model);
	}

	/**
	 * Test find 02.
	 */
	@Test
	public void testFind_02() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		final UserRegistrationModel model = this.urController.find(11111L);
		System.out.println(model);
		System.out.println("--------------------------------------------------------------------------------");
		Assert.assertEquals(null, model);
	}
}