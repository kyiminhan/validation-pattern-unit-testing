package com.kyiminhan.entity;

import org.junit.Assert;
import org.junit.Test;

/**
 * The Class UserTest.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since Mar 17, 2019 </BR>
 *        validation-model-pattern system </BR>
 *        com.kyiminhan.entity </BR>
 *        UserTest.java </BR>
 */
public class UserTest {

	/**
	 * Test model 01.
	 */
	@Test
	public void testModel_01() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		final User model = new User();
		System.out.println(model);
		System.out.println(User.builder());
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
		final User model = new User();
		System.out.println(model);
		System.out.println("--------------------------------------------------------------------------------");
		Assert.assertEquals(false, model.equals(new User()));
	}
}