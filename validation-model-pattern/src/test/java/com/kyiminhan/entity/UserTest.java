package com.kyiminhan.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class UserTest {
	@Test
	public void testModel_01() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		User model = new User();
		System.out.println(model);
		System.out.println(User.builder());
		System.out.println("--------------------------------------------------------------------------------");
		assertNotEquals(null, model);
	}

	@Test
	public void testModel_02() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		User model = new User();
		System.out.println(model);
		System.out.println("--------------------------------------------------------------------------------");
		assertEquals(false, model.equals(new User()));
	}
}
