package com.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewDataController {
	
	@GetMapping("/viewData1")
	public String viewData1(HttpServletRequest request) {
		
		System.out.println(request.getParameter("p1"));
		
		request.setAttribute("state", "배가 너무 고프다");
		request.setAttribute("time", "곧 점심시간");
		return "viewData/viewData1";
				
	}
	
	@GetMapping("/viewData2")
	public String viewData2(Model model) {
		model.addAttribute("state", "배가 더더더 고프다");
		model.addAttribute("time", "12분 남음");
		return "viewData/viewData1";
	}
	
	@GetMapping("/viewData3")
	public ModelAndView viewData3() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("viewData/viewData1");
		mav.addObject("state", "죽기직전");
		return mav.addObject("time","5분전");
		
	}
}
