package com.Phase2.PaymentSystem.Database;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Phase2.PaymentSystem.Class.Transaction.Add_To_Wallet_Transaction;

@Service
public class Add_To_Wallet_Transaction_Db {
	private static List<Add_To_Wallet_Transaction> Add_To_Wallet_Transaction_db = new ArrayList<>();

	public String Add_To_Wallet_Transaction(Add_To_Wallet_Transaction add_to_wallet_transaction) {
		Add_To_Wallet_Transaction_db.add(add_to_wallet_transaction);
		return "Added Successfully";
	}

	public List<Add_To_Wallet_Transaction> Get_List_Add_To_Wallet_Transaction() {
		System.out.println("True");
		for (Add_To_Wallet_Transaction a : Add_To_Wallet_Transaction_db) {
			System.out.println(a.Username + " " + a.Amount);
		}
		return Add_To_Wallet_Transaction_db;
	}

}
