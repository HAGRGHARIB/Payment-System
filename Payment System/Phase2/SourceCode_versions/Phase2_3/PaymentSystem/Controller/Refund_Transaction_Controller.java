package com.Phase2.PaymentSystem.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.Phase2.PaymentSystem.Class.Transaction.Refund_Transaction;
import com.Phase2.PaymentSystem.Database.Refund_Transaction_Db;

@RestController
public class Refund_Transaction_Controller {
	private Refund_Transaction_Db refund_transaction_db = new Refund_Transaction_Db();;

	@PostMapping(value = "/Refund Transaction")
	public String Add_Refund_Transaction(@RequestBody Refund_Transaction refund_transaction) {
		Customer_Controller customer_controller = new Customer_Controller();
		refund_transaction.Username = customer_controller.Get_Current_Customer();
		return refund_transaction_db.Add_Refund_Transaction(refund_transaction);
	}

	@GetMapping(value = "/Refund Transaction")
	public List<Refund_Transaction> Get_List_Refund_Transaction() {
		return refund_transaction_db.Get_List_Refund_Transaction();
	}

	@DeleteMapping(value = "/Refund Transaction/Refuse/{number}")
	public String Refuse_Refund_Transaction(@PathVariable("number") int number) {
		return refund_transaction_db
				.Refuse_Refund_Transaction(refund_transaction_db.Get_List_Refund_Transaction().get(number - 1));
	}

	@DeleteMapping(value = "/Refund Transaction/Accept/{number}")
	public String Accept_Refund_Transaction(@PathVariable("number") int number) {
		return refund_transaction_db
				.Accept_Refund_Transaction(refund_transaction_db.Get_List_Refund_Transaction().get(number - 1));
	}
}
