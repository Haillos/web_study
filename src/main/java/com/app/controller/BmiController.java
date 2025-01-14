package com.app.controller;

import javax.servlet.http.HttpServletRequestWrapper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BmiController {
	
	@GetMapping("/quiz04/ask-bmi")
	public String ask_bmi() {
		return "/quiz04/ask-bmi";
	}
	
	@PostMapping("/quiz04/result-bmi")
	public String result_bmi(@RequestParam String name, 
			@RequestParam String height, 
			@RequestParam String weight, Model model) {
		
		Double heightDb = Double.parseDouble(height);
		Double weightDb = Double.parseDouble(weight);
		
		double bmi = weightDb / ((heightDb/100) * (heightDb/100));
		model.addAttribute("name", name);
		model.addAttribute("height", height);
		model.addAttribute("weight", weight);
		model.addAttribute("bmi", bmi);
		return "/quiz04/result-bmi";
	}
	
//	@RequestMapping("/quiz04/result-bmi4")
//	public String result_bmi4(@RequestParam Map<String, String> paraMap ) {
//		
//		Double heightDb = Double.parseDouble(paraMap.get("height"));
//		Double weightDb = Double.parseDouble(paraMap.get("weight"));
//		
//		double bmi = weightDb / Math.pow(heightDb/100, 2);
//		

		
	}
	
	

