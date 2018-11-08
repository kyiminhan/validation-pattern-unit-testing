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

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ChangePasswordModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "required")
	@NotEmpty(message = "required")
	@NotBlank(message = "required")
	private String email;

	@NotNull(message = "required")
	@NotEmpty(message = "required")
	@NotBlank(message = "required")
	private String oldPassword;

	@NotNull(message = "required")
	@NotEmpty(message = "required")
	@NotBlank(message = "required")
	private String newPassword;

	@NotNull(message = "required")
	@NotEmpty(message = "required")
	@NotBlank(message = "required")
	private String confirmPassword;

}