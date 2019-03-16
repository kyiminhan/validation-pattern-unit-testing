package com.kyiminhan.web.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * The Class ChangePasswordModel.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since Mar 17, 2019 </BR>
 *        validation-model-pattern system </BR>
 *        com.kyiminhan.web.model </BR>
 *        ChangePasswordModel.java </BR>
 */
@Getter

/**
 * Builds the.
 *
 * @return ChangePasswordModel
 */
@Builder

/**
 * Instantiates a new change password model.
 */
@NoArgsConstructor

/**
 * Instantiates a new change password model.
 *
 * @param email           the email
 * @param oldPassword     the old password
 * @param newPassword     the new password
 * @param confirmPassword the confirm password
 */
@AllArgsConstructor
@ToString
public class ChangePasswordModel implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The email. */
	@NotNull(message = "required")
	@NotEmpty(message = "required")
	@NotBlank(message = "required")
	private String email;

	/** The old password. */
	@NotNull(message = "required")
	@NotEmpty(message = "required")
	@NotBlank(message = "required")
	private String oldPassword;

	/** The new password. */
	@NotNull(message = "required")
	@NotEmpty(message = "required")
	@NotBlank(message = "required")
	private String newPassword;

	/** The confirm password. */
	@NotNull(message = "required")
	@NotEmpty(message = "required")
	@NotBlank(message = "required")
	private String confirmPassword;

}