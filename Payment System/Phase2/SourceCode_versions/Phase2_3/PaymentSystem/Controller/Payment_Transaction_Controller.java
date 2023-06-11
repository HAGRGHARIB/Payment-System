package com.Phase2.PaymentSystem.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.Phase2.PaymentSystem.Class.Transaction.Payment_Transaction;
import com.Phase2.PaymentSystem.Database.Payment_Transaction_Db;

@RestController
public class Payment_Transaction_Controller {
	private Payment_Transaction_Db payment_transaction_db = new Payment_Transaction_Db();

	public String Add_Payment_Transaction(Payment_Transaction payment_transaction) {
		Customer_Controller customer_controller = new Customer_Controller();
		payment_transaction.Username = customer_controller.Get_Current_Customer();
		return payment_transaction_db.Add_Payment_Transaction(payment_transaction);
	}

	@GetMapping(value = "/Add To Payment Transaction")
	public List<Payment_Transaction> Get_List_Payment_Transaction_Transaction() {
		return payment_transaction_db.Get_List_Payment_Transaction();
	}
}
