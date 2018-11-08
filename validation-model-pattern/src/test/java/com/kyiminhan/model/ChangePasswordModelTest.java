package com.kyiminhan.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.kyiminhan.web.model.ChangePasswordModel;

public class ChangePasswordModelTest {

	@Test
	public void testModel_01() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		ChangePasswordModel model = new ChangePasswordModel();
		System.out.println(model);
		System.out.println(ChangePasswordModel.builder());
		System.out.println("--------------------------------------------------------------------------------");
		assertNotEquals(null, model);
	}

	@Test
	public void testModel_02() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		ChangePasswordModel model = new ChangePasswordModel();
		System.out.println("--------------------------------------------------------------------------------");
		assertEquals(false, model.equals(new ChangePasswordModel()));
	}
}
