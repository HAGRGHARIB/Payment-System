package Phase1_4;

import java.util.Scanner;

public class IOrangeForm implements Form {
	double amount;
	int service;
	String phone_number;

	@SuppressWarnings("resource")
	@Override
	public void open() {
		System.out.print("Enter the amount : ");
		Scanner cin = new Scanner(System.in);
		amount = cin.nextDouble();
		System.out.println("Choose from services\n1- GO Packages \n2- Extra GO \n3- Complementary Internet");
		service = cin.nextInt();
		System.out.print("Enter Your Phone Number : ");
		phone_number = cin.nextLine();
	}
}
