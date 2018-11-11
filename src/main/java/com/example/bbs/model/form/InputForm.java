package com.example.bbs.model.form;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class InputForm {

	@NotNull
	private String title;
	@NotNull
	private String contents;

}
