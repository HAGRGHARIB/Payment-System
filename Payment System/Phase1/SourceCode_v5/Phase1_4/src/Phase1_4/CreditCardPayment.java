package Phase1_4;

public class CreditCardPayment implements Payment 
{
	float creditMoney;
	float amountOfMoney;
	void payWithCredit (float amount)
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

//27na 3ayzeen nsgl alflos ali gwaha 
//we b3den 3ayzeen n4of hwa hydf3 ad ehh 
//n4of fy flos kfaya wala la2 
//lw fyh
//we na5od lkmia li hydf3ha na2es li m3ana we nrg3 li 2t5sm ytsgl tani 
//we n2olo no kda df3 5alas
//lw mfy4
//hn2olo mfi4 lflos dyh fa ldf3 m4 hytm 