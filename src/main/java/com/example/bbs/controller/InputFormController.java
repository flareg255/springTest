package com.example.bbs.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bbs.model.form.InputForm;
import com.example.bbs.model.provider.InputFormProvider;

@Controller
public class InputFormController {

	@Autowired
	private InputFormProvider inputFormProvider;

	@RequestMapping("/inputFormConfirm")
	public String confirmForm(@Valid InputForm inputForm, Model model) {

		inputFormProvider.insert(inputForm);

		return "redirect:/admin/";
	}
}
