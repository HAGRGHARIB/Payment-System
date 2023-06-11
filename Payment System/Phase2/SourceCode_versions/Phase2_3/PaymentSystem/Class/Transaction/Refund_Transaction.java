package com.Phase2.PaymentSystem.Class.Transaction;


public class Refund_Transaction extends Transaction {
	public String Name_of_Provider_Service;

	public Refund_Transaction(String Username, String Name_of_Provider_Service, double Amount) {
		this.Username = Username;
		this.Name_of_Provider_Service = Name_of_Provider_Service;
		this.Amount = Amount;
	}

}
