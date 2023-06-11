package com.Phase2.PaymentSystem.Class.Observer;

import org.springframework.stereotype.Service;

@Service
public class Admin {
	private final String Username = "admin";
	private final String Password = "123";

	public String getUsername() {
		return Username;
	}

	public String getPassword() {
		return Password;
	}

}
