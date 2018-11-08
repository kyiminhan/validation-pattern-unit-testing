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

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserRegistrationModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	@NotNull(message = "required")
	@NotEmpty(message = "required")
	@NotBlank(message = "required")
	private String firstName;
	@NotNull(message = "required")
	@NotEmpty(message = "required")
	@NotBlank(message = "required")
	private String lastName;
	@NotNull(message = "required")
	@NotEmpty(message = "required")
	@NotBlank(message = "required")
	private String email;
	@NotNull(message = "required")
	private Date dateOfBirth;
	@NotNull(message = "required")
	@NotEmpty(message = "required")
	@NotBlank(message = "required")
	private String password;
	@NotNull(message = "required")
	@NotEmpty(message = "required")
	@NotBlank(message = "required")
	private String phone;
}
