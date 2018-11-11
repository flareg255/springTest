package com.example.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	@RequestMapping("/admin/")
	public String redirecAdmin() {
		return "/admin/index";
	}

	@RequestMapping("/admin/index")
	public String adminIndex() {
		return "admin/index";
	}
}
