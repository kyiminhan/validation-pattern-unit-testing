package com.kyiminhan.model;

import org.junit.Assert;
import org.junit.Test;

import com.kyiminhan.web.model.UserRegistrationModel;

/**
 * The Class UserRegistrationModelTest.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since Mar 17, 2019 </BR>
 *        validation-model-pattern system </BR>
 *        com.kyiminhan.model </BR>
 *        UserRegistrationModelTest.java </BR>
 */
public class UserRegistrationModelTest {

	/**
	 * Test model 01.
	 */
	@Test
	public void testModel_01() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		final UserRegistrationModel model = new UserRegistrationModel();
		System.out.println(model);
		System.out.println(UserRegistrationModel.builder());
		System.out.println("--------------------------------------------------------------------------------");
		Assert.assertNotEquals(null, model);
	}

	/**
	 * Test model 02.
	 */
	@Test
	public void testModel_02() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		final UserRegistrationModel model = new UserRegistrationModel();
		System.out.println("--------------------------------------------------------------------------------");
		Assert.assertEquals(false, model.equals(new UserRegistrationModel()));
	}
}