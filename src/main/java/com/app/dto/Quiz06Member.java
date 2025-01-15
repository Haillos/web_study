package com.app.dto;

public class Quiz06Member {
	String id;
	String pw;
	String name;
	String type;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Quiz06Member() {
		// TODO Auto-generated constructor stub
	}
	
	public Quiz06Member(String id, String pw, String name, String type) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.type = type;
	}
	
}
