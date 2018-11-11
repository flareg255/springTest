package com.example.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {

	@RequestMapping("/login")
	public String login() {
		return "login/loginForm";
	}

	@RequestMapping("/loginForm")
	public String loginForm() {
		return "login/loginForm";
	}

}
