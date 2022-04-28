package com.example.demo.pojos;


public class Userpojo {
	
	String is_success;
	String user_ID;
	String email;
	String roll_number;
	Object[] numbers;
	Object[] alphabets;

	public Userpojo(String is_success, String user_ID, String email, String roll_number, Object[] numbers, Object[] alphabets) {
		super();
		this.is_success = is_success;
		this.user_ID = user_ID;
		this.email = email;
		this.roll_number = roll_number;
		this.numbers = numbers;
		this.alphabets = alphabets;
	}
	
	
	public Userpojo(String is_success, String user_ID, String email, String roll_number, Object[] numbers, Object[] alphabets,
			String[] arr) {
		super();
		this.is_success = is_success;
		this.user_ID = user_ID;
		this.email = email;
		this.roll_number = roll_number;
		this.numbers = numbers;
		this.alphabets = alphabets;

	}




	public Userpojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIs_success() {
		return is_success;
	}
	public void setIs_success(String is_success) {
		this.is_success = is_success;
	}
	public String getUser_ID() {
		return user_ID;
	}
	public void setUser_ID(String user_ID) {
		this.user_ID = user_ID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(String roll_number) {
		this.roll_number = roll_number;
	}
	public Object[] getNumbers() {
		return numbers;
	}
	public void setNumbers(Object[] numbers) {
		this.numbers = numbers;
	}
	public Object[] getAlphabets() {
		return alphabets;
	}
	public void setAlphabets(Object[] alphabets) {
		this.alphabets = alphabets;
	}	
}
