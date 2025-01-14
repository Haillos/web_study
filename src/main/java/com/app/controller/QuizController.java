package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz03")
public class QuizController {
	
	@RequestMapping("/pathA")
	public String pathA() {
		return "quiz03/pathA";
	}
	
	@RequestMapping("/pathB")
	public String pathB() {
		return "quiz03/pathB";
	}
	
	@RequestMapping("/pathCommon/A")
	public String pathCommonA() {
		return "quiz03/pathCommon/A";
	}
	
	@RequestMapping("/pathCommon/B")
	public String pathCommonB() {
		return "quiz03/pathCommon/B";
	}
}
