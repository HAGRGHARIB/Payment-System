package Phase1_SW;

import java.util.Scanner;

public class WalletPayment implements Payment {
	static double amount =0 ;
	double amountOfMoney;

	public void setAmount(double Amount) {
		
		WalletPayment.amount=Amount;
		CreditCardPayment.creditMoney = CreditCardPayment.creditMoney-this.amount;
		
	}
	public double  getAmount() {
		return WalletPayment.amount;
	}
		 public void pay (double a)
	{
		amountOfMoney=a;
		if (amount >= amountOfMoney)
		{
			amount = amount - amountOfMoney;
			System.out.println("you have paied succsessfuly ");
		
		}
		else 
		{
			System.out.println("you don't have enough money in your Wallet");
		}
		
	}
}

