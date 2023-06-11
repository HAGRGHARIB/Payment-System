package com.Phase2.PaymentSystem.Database;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Phase2.PaymentSystem.Class.Transaction.Refund_Transaction;


@Service
public class Refund_Transaction_Db {
	private List<Refund_Transaction> Refund_Transactiontable_db;

	public Refund_Transaction_Db() {
		Refund_Transactiontable_db = new ArrayList<>();
	}

	public String Add_Refund_Transaction(Refund_Transaction refund_transaction) {
		Refund_Transactiontable_db.add(refund_transaction);
		return "Added Successfully";
	}

	public List<Refund_Transaction> Get_List_Refund_Transaction() {
		return Refund_Transactiontable_db;
	}

	public String Refuse_Refund_Transaction(Refund_Transaction refund_transaction) {
		Refund_Transactiontable_db.remove(refund_transaction);
		return "Refused";
	}

	public String Accept_Refund_Transaction(Refund_Transaction refund_transaction) {
		Refund_Transactiontable_db.remove(refund_transaction);
		CreditCard_Db creditcard_db = new CreditCard_Db();
		return creditcard_db.Add_To_CreditCard(refund_transaction.Username, refund_transaction.Amount);
	}
}
