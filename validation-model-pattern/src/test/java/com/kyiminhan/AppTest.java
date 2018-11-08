package com.kyiminhan;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.kyiminhan.controller.ChangePasswordControllerTest;
import com.kyiminhan.controller.UserControllerTest;
import com.kyiminhan.entity.UserTest;
import com.kyiminhan.model.ChangePasswordModelTest;
import com.kyiminhan.model.UserRegistrationModelTest;

@RunWith(Suite.class)
@SuiteClasses({ ChangePasswordControllerTest.class, ChangePasswordModelTest.class, UserControllerTest.class,
		UserRegistrationModelTest.class, UserTest.class })
public class AppTest {

	public static void main(String[] args) {
		JUnitCore jUnitCore = new JUnitCore();
		jUnitCore.addListener(new TextListener(System.out));
		jUnitCore.run(AppTest.class);
	}

}