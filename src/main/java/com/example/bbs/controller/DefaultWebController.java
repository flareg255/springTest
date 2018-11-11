package com.example.bbs.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bbs.model.provider.SelectContentProvider;

@Controller
public class DefaultWebController {

	@Autowired
	SelectContentProvider selectContentProvider;

	@RequestMapping("/")
	public String redirectLogin() {
		return "redirect:/login";
	}

	@RequestMapping("/index")
	public String index(Model model) {
		List<Map<String, Object>> map = selectContentProvider.getContent();
		model.addAttribute("contents", map);
		return "index.html";
	}

	@RequestMapping("/input")
	public String inputForm() {
		return "/form/inputForm";
	}
}
