package com.kyiminhan.model;

import org.junit.Assert;
import org.junit.Test;

import com.kyiminhan.web.model.ChangePasswordModel;

/**
 * The Class ChangePasswordModelTest.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since Mar 17, 2019 </BR>
 *        validation-model-pattern system </BR>
 *        com.kyiminhan.model </BR>
 *        ChangePasswordModelTest.java </BR>
 */
public class ChangePasswordModelTest {

	/**
	 * Test model 01.
	 */
	@Test
	public void testModel_01() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		final ChangePasswordModel model = new ChangePasswordModel();
		System.out.println(model);
		System.out.println(ChangePasswordModel.builder());
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
		final ChangePasswordModel model = new ChangePasswordModel();
		System.out.println("--------------------------------------------------------------------------------");
		Assert.assertEquals(false, model.equals(new ChangePasswordModel()));
	}
}