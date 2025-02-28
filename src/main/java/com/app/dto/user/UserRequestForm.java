package com.app.dto.user;



import lombok.Data;

@Data
public class UserRequestForm {
	

	String id;
	

	String pw;
	
//	@Email
	String name;
	
	String userType;  // CUS(Customer)   ADM(Admin)
	
}
