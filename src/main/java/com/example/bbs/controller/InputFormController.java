package com.example.bbs.controller;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bbs.model.form.InputForm;
import com.example.bbs.model.form.InputFormUser;
import com.example.bbs.model.provider.InputFormProvider;
import com.example.bbs.model.provider.InputUserFormProvider;

@Controller
public class InputFormController {

	@Autowired
	private InputFormProvider inputFormProvider;

	@Autowired
	private InputUserFormProvider inputUserFormProvider;

	@RequestMapping("/inputFormConfirm")
	public String confirmForm(@Valid InputForm inputForm, Model model,Principal principal) {

		String name = principal.getName();

		inputFormProvider.insert(inputForm,name);

		return "redirect:/admin/";
	}

	@RequestMapping("/inputFormUserConfirm")
	public String confirmFormUser(@Valid InputFormUser inputFormUser, Model model) {

		try {
			inputUserFormProvider.insert(inputFormUser);

			return "useradd/addSuccess";
		}catch(Exception e) {

			return "useradd/addFaile";
		}

	}
}
