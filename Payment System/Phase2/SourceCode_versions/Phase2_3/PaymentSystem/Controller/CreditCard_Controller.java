package com.Phase2.PaymentSystem.Controller;

import org.springframework.web.bind.annotation.*;

import com.Phase2.PaymentSystem.Class.Payment.CreditCard;
import com.Phase2.PaymentSystem.Class.Transaction.Add_To_Wallet_Transaction;
import com.Phase2.PaymentSystem.Class.Transaction.Payment_Transaction;
import com.Phase2.PaymentSystem.Database.CreditCard_Db;

@RestController
public class CreditCard_Controller {
	CreditCard_Db creditcard_db = new CreditCard_Db();

	@GetMapping(value = "/Add To Wallet/Amount={Amount}")
	public String Add_To_Wallet(@PathVariable("Amount") double Amount) {
		Customer_Controller customer_controller=new Customer_Controller();
		String Username=customer_controller.Get_Current_Customer();
		CreditCard creditcard = creditcard_db.Get_CreditCard(Username);
		if (creditcard != null) {
			if (creditcard.Amount >= Amount) {
				Wallet_Controller wallet_controller = new Wallet_Controller();
				wallet_controller.Add_To_Wallet(Username, Amount);
				creditcard_db.Update_CreditCard(Username, Amount);
				Add_To_Wallet_Transaction_Controller add_to_wallet_transaction_controller = new Add_To_Wallet_Transaction_Controller();
				add_to_wallet_transaction_controller
						.Add_Add_To_Wallet_Transaction(new Add_To_Wallet_Transaction(Username, Amount));
			} else {
				return "There is not enough Amount in creditcard";
			}
			return "Done Added successfully to wallet";
		}
		return "Not Found Such as" + Username;
	}

	@GetMapping(value = "/Pay by CreditCard Payment/Amount={Amount}")
	public String pay(@PathVariable("Amount") double Amount) {
		Customer_Controller customer_controller=new Customer_Controller();
		String Username=customer_controller.Get_Current_Customer();
		int discount = 0;
		Payment_Transaction_Controller payment_transaction_controller = new Payment_Transaction_Controller();
		if (discount == 0) {
			CreditCard creditcard = creditcard_db.Update_CreditCard(Username, Amount);
			if (creditcard != null) {
				payment_transaction_controller.Add_Payment_Transaction(
						new Payment_Transaction(Username, Amount, "CreditCard payment"));
				return "Done";
			}
			return "There is not enough Money";
		} else {
			CreditCard creditcard = creditcard_db.Update_CreditCard(Username, Amount * (discount / 100.0));
			if (creditcard != null) {
				payment_transaction_controller.Add_Payment_Transaction(
						new Payment_Transaction(Username, Amount * (discount / 100.0), "CreditCard payment"));
				return "Done";
			}
			return "There is not enough Money";
		}

	}
}
