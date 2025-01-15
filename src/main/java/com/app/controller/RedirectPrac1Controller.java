package com.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//@Controller
//public class RedirectPrac1Controller {
//
//	@GetMapping("/re/listTest") 
//	public String member(HttpServletRequest request, @RequestParam String type, Model model) {
//		model.addAttribute("type", type);
//		return "forward:/Jstl/listTest/member";
//	}
//	
//	@GetMapping("/re/listTest") 
//	public String str(HttpServletRequest request, RedirectAttributes ra) {
//		ra.addAttribute("type", "str");
//		return "redirect:/Jstl/listTest/str";
//	}
//}
