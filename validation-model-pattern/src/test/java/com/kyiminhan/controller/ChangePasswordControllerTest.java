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

@Slf4j
public class ChangePasswordControllerTest {
	BaseDao<User> baseDao = new UserDaoImpl();
	BaseService<User> baseService = new UserServiceImpl(this.baseDao);

	// for changePasswordModel
	ModelValidator<ChangePasswordModel, User> cpmValidator = new ChangePasswordModelValidator();
	ModelFactory<ChangePasswordModel, User> cmpFactory = new ChangePasswordModelFactory();
	BaseController<ChangePasswordModel, User> cmpController = new ChangePasswordController(this.baseService,
			this.cpmValidator, this.cmpFactory);

	@Test
	public void testSave_01() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		String actualResult = this.cmpController.save(ChangePasswordModel.builder().build());
		ChangePasswordControllerTest.log.info(actualResult);
		System.out.println("--------------------------------------------------------------------------------");
		Assert.assertEquals(Constant.RESULT_ERROR, actualResult);
	}

	@Test
	public void testSave_02() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		String actualResult = this.cmpController.save(ChangePasswordModel.builder().email("kyiminhan@gicjp.biz")
				.oldPassword("admin12345").newPassword("xyzabc12345").confirmPassword("xyzabc12345").build());
		ChangePasswordControllerTest.log.info(actualResult);
		System.out.println("--------------------------------------------------------------------------------");
		Assert.assertEquals(Constant.RESULT_SUCCESS, actualResult);
	}

	@Test
	public void testFind_01() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		ChangePasswordModel model = this.cmpController.find(1L);
		System.out.println(model);
		System.out.println("--------------------------------------------------------------------------------");
		Assert.assertNotEquals(null, model);
	}

	@Test
	public void testFind_02() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		ChangePasswordModel model = this.cmpController.find(11111L);
		System.out.println(model);
		System.out.println("--------------------------------------------------------------------------------");
		Assert.assertEquals(null, model);
	}
}