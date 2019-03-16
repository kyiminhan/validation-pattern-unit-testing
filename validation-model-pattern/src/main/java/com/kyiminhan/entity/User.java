package com.kyiminhan.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * The Class User.</BR>
 *
 * @author KYIMINHAN </BR>
 * @version 1.0 </BR>
 * @since Mar 17, 2019 </BR>
 *        validation-model-pattern system </BR>
 *        com.kyiminhan.entity </BR>
 *        User.java </BR>
 */
@Entity
@Getter

/**
 * Builds the.
 *
 * @return User
 */
@Builder

/**
 * Instantiates a new user.
 */
@NoArgsConstructor

/**
 * Instantiates a new user.
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
public class User implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The id. */
	private Long id;

	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/** The email. */
	private String email;

	/** The date of birth. */
	private Date dateOfBirth;

	/** The password. */
	private String password;

	/** The phone. */
	private String phone;

}