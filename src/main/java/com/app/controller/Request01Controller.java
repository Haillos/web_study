package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Request01Controller {

	// 요청 주소별로 맵핑

	@RequestMapping("/url1") // 괄호 안에 명시된 주소로 요청이 왔을 때 실행
	public String url1() {

		return "url1"; // 그 이름을 가지고 있는 view 파일을 명시
	}

	@RequestMapping("/url2")
	public String url2() {

		return ""; // 그 이름을 가지고 있는 view 파일을 명시
	}

	@RequestMapping("/url3")
	public String url3() {

		return ""; // 그 이름을 가지고 있는 view 파일을 명시
	}
	
	@RequestMapping("/url4")
	public String url4() {

		return "url/url4"; // 그 이름을 가지고 있는 view 파일을 명시
	}
	
	//HTTP 통신 Method = GET / POST / DELETE / PUT / PATCH
	@RequestMapping(value = "/url5", method = RequestMethod.GET)
	public String url5() {

		return "url/url4"; // 그 이름을 가지고 있는 view 파일을 명시
	}
	
	@RequestMapping(value = "/url6", method = RequestMethod.POST)
	public String url6() {

		return "url/url4"; // 그 이름을 가지고 있는 view 파일을 명시
	}
	
	@GetMapping(value = "/url7")
	public String url7() {

		return "url/url4"; // 그 이름을 가지고 있는 view 파일을 명시
	}
	
	@PostMapping(value = "/url8")
	public String url8() {

		return "url/url4"; // 그 이름을 가지고 있는 view 파일을 명시
	}
}
