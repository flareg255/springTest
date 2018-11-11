package com.example.bbs.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bbs.model.provider.SelectContentProvider;

@Controller
public class AdminController {

	@Autowired
	SelectContentProvider selectContentProvider;

	@RequestMapping("/admin/")
	public String redirecAdmin(Model model) {
		List<Map<String, Object>> map = selectContentProvider.getContent();
		model.addAttribute("contents", map);
<<<<<<< HEAD
		return "admin/index";
=======
		return "/admin/index";
>>>>>>> input
	}

	@RequestMapping("/admin/index")
	public String adminIndex() {
		return "redirect:/admin/";
	}
}
