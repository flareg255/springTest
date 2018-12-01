package com.example.bbs.model.form;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class InputFormUser {

	@NotNull
	private String username;
	@NotNull
	private String password;

}
