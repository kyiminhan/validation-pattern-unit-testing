package com.kyiminhan.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.kyiminhan.web.model.UserRegistrationModel;

public class UserRegistrationModelTest {

	@Test
	public void testModel_01() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		UserRegistrationModel model = new UserRegistrationModel();
		System.out.println(model);
		System.out.println(UserRegistrationModel.builder());
		System.out.println("--------------------------------------------------------------------------------");
		assertNotEquals(null, model);
	}

	@Test
	public void testModel_02() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		UserRegistrationModel model = new UserRegistrationModel();
		System.out.println("--------------------------------------------------------------------------------");
		assertEquals(false, model.equals(new UserRegistrationModel()));
	}
}
