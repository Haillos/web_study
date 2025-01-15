package com.app.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dto.Quiz06Member;

@Controller
public class Quiz06Controller {

	@GetMapping("/manage/member")
	public String Quiz06(@RequestParam String auth, Model model) {
		
		model.addAttribute("auth", auth);
		
		ArrayList<Quiz06Member> memberList = new ArrayList<Quiz06Member>();

		memberList.add(new Quiz06Member("user1", "pass123", "홍길동", "basic"));
		memberList.add(new Quiz06Member("user2", "pass456", "김철수", "manager"));
		memberList.add(new Quiz06Member("user3", "pass789", "이영희", "basic"));
		memberList.add(new Quiz06Member("user4", "passabc", "박민지", "manager"));
		memberList.add(new Quiz06Member("user5", "passdef", "정재영", "basic"));
		memberList.add(new Quiz06Member("user6", "passxyz", "최성민", "basic"));
		memberList.add(new Quiz06Member("user7", "pass123", "서지원", "manager"));
		memberList.add(new Quiz06Member("user8", "pass456", "장성호", "basic"));
		memberList.add(new Quiz06Member("user9", "pass789", "신지수", "basic"));
		memberList.add(new Quiz06Member("user10", "passabc", "한영희", "manager"));
		
		model.addAttribute("memberList", memberList);
		
		
		ArrayList<Quiz06Member> viewMemberList = new ArrayList<Quiz06Member>();
		for(Quiz06Member quiz06member : memberList) {
			if(auth.equals(quiz06member.getType())) {
				viewMemberList.add(quiz06member);
			}
		}
		return "/quiz/quiz06/quiz06";
	}
}
