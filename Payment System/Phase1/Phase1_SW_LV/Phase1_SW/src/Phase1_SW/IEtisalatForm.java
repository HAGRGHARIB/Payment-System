package Phase1_SW;

import java.util.Scanner;

public class IEtisalatForm implements Form {
	double amount;
	int service;
	int phone_number;

	@SuppressWarnings("resource")
	@Override
	public void open() {
		System.out.print("Enter the amount : ");
		Scanner cin = new Scanner(System.in);
		amount = cin.nextDouble();
		System.out.println(
				"Choose from services\n1- Super Mega\n2- Connect X \n3- Super hours intertainment \n4- Super hours social \n5- Super hours music \n6- Super hours video \n7- Super hours gaming");
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
