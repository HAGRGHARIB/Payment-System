package com.Phase2.PaymentSystem.Controller;

import org.springframework.web.bind.annotation.*;

import com.Phase2.PaymentSystem.Class.Payment.Wallet;
import com.Phase2.PaymentSystem.Class.Transaction.Payment_Transaction;
import com.Phase2.PaymentSystem.Database.Wallet_Db;

@RestController
public class Wallet_Controller {
	Wallet_Db wallet_db = new Wallet_Db();

	public String Add_New_Add_To_Wallet_Transaction(String Username, double Amount) {
		return wallet_db.Add_Wallet(new Wallet(Username, Amount));
	}

	public String Add_To_Wallet(String Username, double Amount) {
		return wallet_db.Add_To_Wallet(Username, Amount);
	}

	@GetMapping(value = "/Pay by Wallet Payment/Amount={Amount}")
	public String pay(@PathVariable("Amount") double Amount) {
		Customer_Controller customer_controller = new Customer_Controller();
		String Username = customer_controller.Get_Current_Customer();
		// discount from services
		int discount = 0;
		Payment_Transaction_Controller payment_transaction_controller = new Payment_Transaction_Controller();
		if (discount == 0) {
			Wallet wallet = wallet_db.Update_Wallet(Username, Amount);
			if (wallet != null) {
				payment_transaction_controller
						.Add_Payment_Transaction(new Payment_Transaction(Username, Amount, "Wallet payment"));
				return "Done";
			}
			return "There is not enough Money";
		} else {
			Wallet wallet = wallet_db.Update_Wallet(Username, Amount * (discount / 100.0));
			if (wallet != null) {
				payment_transaction_controller.Add_Payment_Transaction(
						new Payment_Transaction(Username, Amount * (discount / 100.0), "Wallet payment"));
				return "Done";
			}
			return "There is not enough Money";
		}
	}
}
