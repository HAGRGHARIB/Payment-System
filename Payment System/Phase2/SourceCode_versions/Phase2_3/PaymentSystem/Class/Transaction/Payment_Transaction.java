package com.Phase2.PaymentSystem.Class.Transaction;


public class Payment_Transaction extends Transaction {
	public String Name_Of_Payment;

	public Payment_Transaction(String Username, double Amount, String Name_Of_Payment) {
		this.Amount = Amount;
		this.Username = Username;
		this.Name_Of_Payment = Name_Of_Payment;
	}
}
