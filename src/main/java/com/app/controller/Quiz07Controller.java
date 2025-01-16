package com.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Quiz07Controller {

	@GetMapping("/scopeCheck/first")
	public String first(Model model, HttpSession session) {
		
		// firsthide 접근 => redirect => session accessUr; : "/firsthide2"
		if(session.getAttribute("accessUrl") == null ) {// first로 바로옴
			model.addAttribute("accessUrl", "/first");
		} else { // firsthide2를 거쳐서 옴
			//model.addAttribute("accessUrl", "/firsthide2");
			model.addAttribute("accessUrl", session.getAttribute("accessUrl")); //세션에서 바로 가져와 세팅
			session.removeAttribute("accessUrl"); // 사용 후 제거
		}
		
		//request scope 삭제 =>  session scope 인식
		//session scope => request scope 이동 시켜 request 가 자동으로 인식
		return "/quiz/quiz07/targetPage";
	}
	
	
	@GetMapping("/scopeCheck/firsthide1")
	public String firsthide(Model model) {
		model.addAttribute("accessUrl", "/firsthide1");
		
		return "/quiz/quiz07/targetPage";
	}
	
	
	@GetMapping("/scopeCheck/firsthide2")
	public String firsthide2(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute("accessUrl", "/firsthide2");
		return "redirect:/scopeCheck/first";
	}
	
}
