package com.Phase2.PaymentSystem.Database;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Phase2.PaymentSystem.Class.Observer.Customer;

@Service
public class Customer_Db {
	private static Customer Current_Customer = null;
	private List<Customer> Cutomertable = new ArrayList<>();

	public String Add_Cutomer(Customer customer) {
		for (Customer c : Cutomertable) {
			if (c.Email.equals(customer.Email))
				return "This is already exists";
			if (c.Username.equals(customer.Username))
				return "This is already exists";
		}
		Cutomertable.add(customer);
		Payment_Db paymnt_db = new Payment_Db();
		paymnt_db.Add_New_Payment(customer.Username);
		Current_Customer = customer;
		return "Added Successfully";
	}

	public Customer Get_Cutomer(String Username, String Password) {
		for (Customer c : Cutomertable) {
			if (c.Username.equals(Username) && c.Password.equals(Password)) {
				Current_Customer = c;
				return c;
			}
		}
		return null;
	}

	public String Get_Current_Customer() {
		return Current_Customer.Username;
	}

}
