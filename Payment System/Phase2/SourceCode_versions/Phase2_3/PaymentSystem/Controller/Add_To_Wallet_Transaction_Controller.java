package com.Phase2.PaymentSystem.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.Phase2.PaymentSystem.Class.Transaction.Add_To_Wallet_Transaction;
import com.Phase2.PaymentSystem.Database.Add_To_Wallet_Transaction_Db;

@RestController
public class Add_To_Wallet_Transaction_Controller {
	private Add_To_Wallet_Transaction_Db add_to_wallet_transaction_db = new Add_To_Wallet_Transaction_Db();;

	public String Add_Add_To_Wallet_Transaction(Add_To_Wallet_Transaction add_to_wallet_transaction) {
		System.out.println("True");
		return add_to_wallet_transaction_db.Add_To_Wallet_Transaction(add_to_wallet_transaction);
	}

	@GetMapping(value = "/Add To Wallet Transaction")
	public List<Add_To_Wallet_Transaction> Get_List_Add_To_Wallet_Transaction() {
		return add_to_wallet_transaction_db.Get_List_Add_To_Wallet_Transaction();
	}
}
