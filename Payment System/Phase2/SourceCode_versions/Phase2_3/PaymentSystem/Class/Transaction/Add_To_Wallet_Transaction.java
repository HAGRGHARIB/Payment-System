package com.Phase2.PaymentSystem.Class.Transaction;


public class Add_To_Wallet_Transaction extends Transaction {
	public Add_To_Wallet_Transaction(String Username, double Amount) {
		this.Username = Username;
		this.Amount = Amount;
	}
}