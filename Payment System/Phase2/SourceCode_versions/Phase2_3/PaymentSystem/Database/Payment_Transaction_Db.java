package com.Phase2.PaymentSystem.Database;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Phase2.PaymentSystem.Class.Transaction.Payment_Transaction;

@Service
public class Payment_Transaction_Db {
	private static List<Payment_Transaction> payment_transaction_db = new ArrayList<>();

	public String Add_Payment_Transaction(Payment_Transaction payment_transaction) {
		payment_transaction_db.add(payment_transaction);
		return "Added Successfully";
	}

	public List<Payment_Transaction> Get_List_Payment_Transaction() {
		return payment_transaction_db;
	}
}
