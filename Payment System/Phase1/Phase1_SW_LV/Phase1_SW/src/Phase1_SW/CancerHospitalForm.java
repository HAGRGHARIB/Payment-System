package Phase1_SW;

import java.util.Scanner;
public class CancerHospitalForm implements Form {

	double amount;
	String HospitalName;
	String DonatorName;

	@SuppressWarnings("resource")
	@Override
	public void open() {
		Scanner cin = new Scanner(System.in);
		System.out.println("Please,Enter the Amount:  ");
		amount = cin.nextDouble();
		System.out.println("Please,Enter the HospitalName:  ");
		HospitalName = cin.nextLine();
		System.out.println("Please,Enter the DonatorName:  ");
		DonatorName = cin.nextLine();
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

