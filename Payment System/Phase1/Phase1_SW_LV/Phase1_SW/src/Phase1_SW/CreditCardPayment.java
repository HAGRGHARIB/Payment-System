package Phase1_SW;

public class CreditCardPayment implements Payment 
{
	static double creditMoney=1000;
	double amountOfMoney;
	public void setAmount(double Amount) {
		CreditCardPayment.creditMoney=Amount;
	}
	public double getAmount() {
		return CreditCardPayment.creditMoney;
	}
	//@Override
	 public void pay (double amount)
	{
		amountOfMoney=amount;
		if (creditMoney >= amountOfMoney)
		{
			creditMoney = creditMoney - amountOfMoney;
			System.out.println("you have paied succsessfuly ");
		
		}
		else 
		{
			System.out.println("you don't have enough money in your credit card");
		}
		
	}
}

