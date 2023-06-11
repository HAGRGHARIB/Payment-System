package com.Phase2.PaymentSystem.Database;

import org.springframework.stereotype.Service;

import com.Phase2.PaymentSystem.Class.Payment.CreditCard;
import com.Phase2.PaymentSystem.Class.Payment.Wallet;

@Service
public class Payment_Db {
	public String Add_New_Payment(String Username) {
		CreditCard_Db creditcard = new CreditCard_Db();
		creditcard.Add_CreditCard(new CreditCard(Username, 1000));
		Wallet_Db wallet = new Wallet_Db();
		wallet.Add_Wallet(new Wallet(Username, 0));
		return "Done Creat Payment";

	}
}
