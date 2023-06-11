package com.Phase2.PaymentSystem.Controller;

import org.springframework.web.bind.annotation.*;

import com.Phase2.PaymentSystem.Class.Observer.Admin;

@RestController
public class Admin_Controller {
	private final Admin admin = new Admin();

	@GetMapping(value = "/Admin/Username={Username}/Password={Password}")
	public String Get_Admin(@PathVariable("Username") String Username, @PathVariable("Password") String Password) {
		if (Username.equals(admin.getUsername()) && Password.equals(admin.getPassword()))
			return "Done";
		return "Error";
	}
}
