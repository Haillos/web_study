package com.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController {

	@GetMapping("/re/re1")
	public String re1() {

		return "re/re1";
	}

	@GetMapping("/re/re2")
	public String re2(HttpServletRequest request) {
		
		request.setAttribute("msg", "직접 넣은 메시지");
		System.out.println(request.getParameter("msg"));
		return "re/re2";
	}

	@GetMapping("/re/re3")
	public String re3(HttpServletRequest request) {

		System.out.println(request.getParameter("msg"));

		return "re/re3";
	}

	@GetMapping("/re/re4")
	public String re4(HttpServletRequest request, RedirectAttributes ra) {
		System.out.println(request.getParameter("msg"));
		// return "re/re2"; //view 경로

		request.setAttribute("msg", "re4 redirect msg");//redirect시 안넘어감
		ra.addAttribute("msg", "re4 ra msg");
		
		
		
		//return "redirect:/re/re2?msg=re4 redirect msg"; // 경로에 파라미터 추가
		return "redirect:/re/re2";
	}

	@GetMapping("/re/re5")
	public String re5(HttpServletRequest request) {
		System.out.println(request.getParameter("msg"));
		
		request.setAttribute("msg", "re5 forward msg");
		return "forward:/re/re2"; // 그 경로로 다시 요청 ! 요청할 주소!

	}
}
