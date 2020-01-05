package com.cos.starbucks.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private int id;
	private String name;
	private String username;
	private String password;
	private int money;
	private String email;
	
	private String provider;
	private String providerId;
	
	private String level;
	private Timestamp createDate;

}
