package Phase1_4;

import java.util.Scanner;

public class IEtisalatForm implements Form {
	double amount;
	int service;
	String phone_number;

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
		phone_number = cin.nextLine();
	}
}
