package com.app.dto.room;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Data
public class Room {
	int roomId; //Primary Key 기본키 식별자
	String buildingNumber; // 동 이름 A동 B동
	int roomNumber;// 호실 번호 101 405
	int floor;// 층 7 8
	int maxGuestCount; //최대 숙박 인원
	String viewType; 
	
	int accomodationId;
	
	
}
