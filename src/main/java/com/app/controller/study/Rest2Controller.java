package com.app.controller.study;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.common.CommonCode;
import com.app.dto.user.User;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class Rest2Controller {

	@GetMapping("/rest/rest4")
	public String rest4() {
		return "/rest/rest4";
	}

	@GetMapping("/rest/rest5")
	public String rest5() {
		return "rest5 return text restController2";
	}

	@GetMapping("/rest/rest6")
	public String rest6() {
		// json 포맷

		/*
		 * 단순텍스트 abc,qwe,name1,CUS
		 * 
		 * 많은 데이터 전달 -> 표션 규칙 -> JSON JSON 포맷으로 return 을 하려면 ? 1) 직접 포맷대로 작성 2)json 활용을
		 * 도와주는 라이브러리 사용
		 * 
		 */

//		JSONObject obj = new JSONObject();
//		obj.put("id", "abc");
//		obj.put("pw", "qwe");
//		obj.put("name", "name1");
//		obj.put("userType", "CUS");
//		
//		return "abc,qwe,name1,CUS";

		User user = new User();
		user.setId("abc");
		user.setPw("qwe");
		user.setName("name11");
		user.setUserType(CommonCode.USER_USERTYPE_CUSTOMER);

		ObjectMapper mapper = new ObjectMapper();
		String jsonStr = null;
		try {
			jsonStr = mapper.writeValueAsString(user);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		System.out.println(jsonStr);
	}
}
