package com.kyiminhan.common;

public class Constant {

	private static Constant SINGLE_INSTANCE = null;

	private Constant() {
	}

	public static Constant get() {
		if (null == SINGLE_INSTANCE) {
			synchronized (Constant.class) {
				SINGLE_INSTANCE = new Constant();
			}
		}
		return SINGLE_INSTANCE;
	}

	public final String START = "START";
	public final String END = "END";

	public final String VALIDATE_ERRORS = "validateError";
	public final String VALIDATE_SUCCESS = "validateSuccess";

	public final String SUCCESSFULLY_SAVE = "Successfully Save.";
	public final String SUCCESSFULLY_FIND = "Successfully find.";
	
	public final String RESULT_ERROR = "ERROR";
	public final String RESULT_SUCCESS = "SUCCESS";

}