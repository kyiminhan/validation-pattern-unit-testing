package com.kyiminhan.web.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * The Class UserRegistrationModel.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since Mar 17, 2019 </BR>
 *        validation-model-pattern system </BR>
 *        com.kyiminhan.web.model </BR>
 *        UserRegistrationModel.java </BR>
 */
@Getter

/**
 * Builds the.
 *
 * @return UserRegistrationModel
 */
@Builder

/**
 * Instantiates a new user registration model.
 */
@NoArgsConstructor

/**
 * Instantiates a new user registration model.
 *
 * @param id          the id
 * @param firstName   the first name
 * @param lastName    the last name
 * @param email       the email
 * @param dateOfBirth the date of birth
 * @param password    the password
 * @param phone       the phone
 */
@AllArgsConstructor
@ToString
public class UserRegistrationModel implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private Long id;

	/** The first name. */
	@NotNull(message = "required")
	@NotEmpty(message = "required")
	@NotBlank(message = "required")
	private String firstName;

	/** The last name. */
	@NotNull(message = "required")
	@NotEmpty(message = "required")
	@NotBlank(message = "required")
	private String lastName;

	/** The email. */
	@NotNull(message = "required")
	@NotEmpty(message = "required")
	@NotBlank(message = "required")
	private String email;

	/** The date of birth. */
	@NotNull(message = "required")
	private Date dateOfBirth;

	/** The password. */
	@NotNull(message = "required")
	@NotEmpty(message = "required")
	@NotBlank(message = "required")
	private String password;

	/** The phone. */
	@NotNull(message = "required")
	@NotEmpty(message = "required")
	@NotBlank(message = "required")
	private String phone;
}