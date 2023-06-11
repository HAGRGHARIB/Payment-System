package Phase1_SW;

import java.util.Scanner;

public class MVodafoneForm implements Form {

	double amount;
	int service;
	int phone_number;

	@SuppressWarnings("resource")
	@Override
	public void open() {
		System.out.print("Enter the amount : ");
		Scanner cin = new Scanner(System.in);
		amount = cin.nextDouble();
		System.out.println("Choose from services\n1- Vodafone Red \n2- Vodafone Flix \n3- Cart");
		service = cin.nextInt();
		System.out.print("Enter Your Phone Number : ");
		phone_number = cin.nextInt();
		System.out.println("1 for credit");
		System.out.println("2 for wallet");
		System.out.println("3 for cache");
		System.out.println("Enter how u want to pay : ");
		
       int paymentOption = cin.nextInt();
		if(paymentOption==1) {
			 Payment p=new CreditCardPayment();
			 p.pay(amount);
			
		}
		if(paymentOption==2) {
			 Payment p=new CreditCardPayment();
			 p.pay(amount);
			
		}
		if(paymentOption==3) {
			System.out.println("Come to our place to pay  ");

		
	}
	}

}
