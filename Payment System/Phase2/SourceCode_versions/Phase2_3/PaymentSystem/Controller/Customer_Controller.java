package com.Phase2.PaymentSystem.Controller;

import org.springframework.web.bind.annotation.*;

import com.Phase2.PaymentSystem.Class.Observer.Customer;
import com.Phase2.PaymentSystem.Database.Customer_Db;

@RestController
public class Customer_Controller {
	Customer_Db customerdb = new Customer_Db();

	@PostMapping(value = "/User")
	public String Add_Cutomer(@RequestBody Customer cus) {
		Customer customer = cus;
		return customerdb.Add_Cutomer(customer);
	}

	@GetMapping(value = "/User/Username={Username}/Password={Password}")
	public Customer Get_Cutomer(@PathVariable("Username") String Username, @PathVariable("Password") String Password) {
		return customerdb.Get_Cutomer(Username, Password);
	}
	public String Get_Current_Customer() {
		return customerdb.Get_Current_Customer();
	}
}
