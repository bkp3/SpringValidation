package com.validate.entites;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {

	@NotBlank(message = "user name can not be empty!!")
	@Size(min = 3, max = 12, message = "user name must be in between 3-12 characters!!")
	private String name;

	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Invalid Email !!")
	private String email;

	@AssertTrue(message = "Must agree Terms and Conditions")
	private boolean agreed;

	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginData(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	@Override
	public String toString() {
		return "LoginData [name=" + name + ", email=" + email + ", agreed=" + agreed + "]";
	}

}
