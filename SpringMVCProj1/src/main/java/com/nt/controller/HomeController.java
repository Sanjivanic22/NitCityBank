package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//for declaring class as controller
public class HomeController {
	@RequestMapping("/home")
public String home(Model m) {
		String str="HOME";
		m.addAttribute("name",str);
	return "home";
}
}
