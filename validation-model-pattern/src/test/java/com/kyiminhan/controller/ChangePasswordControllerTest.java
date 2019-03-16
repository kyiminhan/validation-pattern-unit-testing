package com.kyiminhan.controller;

import org.junit.Assert;
import org.junit.Test;

import com.kyiminhan.common.Constant;
import com.kyiminhan.dao.BaseDao;
import com.kyiminhan.dao.impl.UserDaoImpl;
import com.kyiminhan.entity.User;
import com.kyiminhan.service.BaseService;
import com.kyiminhan.service.impl.UserServiceImpl;
import com.kyiminhan.validtor.ChangePasswordModelValidator;
import com.kyiminhan.validtor.ModelValidator;
import com.kyiminhan.web.model.ChangePasswordModel;
import com.kyiminhan.web.model.factory.ChangePasswordModelFactory;
import com.kyiminhan.web.model.factory.ModelFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * The Class ChangePasswordControllerTest.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since Mar 17, 2019 </BR>
 *        validation-model-pattern system </BR>
 *        com.kyiminhan.controller </BR>
 *        ChangePasswordControllerTest.java </BR>
 */
@Slf4j
public class ChangePasswordControllerTest {

	/** The base dao. */
	BaseDao<User> baseDao = new UserDaoImpl();

	/** The base service. */
	BaseService<User> baseService = new UserServiceImpl(this.baseDao);

	/** The cpm validator. */
	// for changePasswordModel
	ModelValidator<ChangePasswordModel, User> cpmValidator = new ChangePasswordModelValidator();

	/** The cmp factory. */
	ModelFactory<ChangePasswordModel, User> cmpFactory = new ChangePasswordModelFactory();

	/** The cmp controller. */
	BaseController<ChangePasswordModel, User> cmpController = new ChangePasswordController(this.baseService,
			this.cpmValidator, this.cmpFactory);

	/**
	 * Test save 01.
	 */
	@Test
	public void testSave_01() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		final String actualResult = this.cmpController.save(ChangePasswordModel.builder().build());
		ChangePasswordControllerTest.log.info(actualResult);
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
		final String actualResult = this.cmpController.save(ChangePasswordModel.builder().email("kyiminhan@gicjp.biz")
				.oldPassword("admin12345").newPassword("xyzabc12345").confirmPassword("xyzabc12345").build());
		ChangePasswordControllerTest.log.info(actualResult);
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
		final ChangePasswordModel model = this.cmpController.find(1L);
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
		final ChangePasswordModel model = this.cmpController.find(11111L);
		System.out.println(model);
		System.out.println("--------------------------------------------------------------------------------");
		Assert.assertEquals(null, model);
	}
}