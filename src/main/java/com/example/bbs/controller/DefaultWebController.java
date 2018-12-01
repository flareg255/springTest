package com.example.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultWebController {

	@RequestMapping("/")
	public String redirectLogin() {
		return "redirect:/login";
	}

	@RequestMapping("/index")
	public String index(Model model) {
		return "redirect:/admin/";
	}

	@RequestMapping("/input")
	public String inputForm(Model model) {
		return "form/inputForm";
	}

	@RequestMapping("/userInput")
	public String inputUserForm(Model model) {
		return "useradd/inputForm";
	}
}
