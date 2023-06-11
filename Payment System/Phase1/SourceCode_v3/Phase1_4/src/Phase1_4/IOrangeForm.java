package Phase1_4;

import java.util.Scanner;

public class IOrangeForm implements Form {

		// TODO Auto-generated method stub
		double amount;
		int service;
		String phone_number;
		@Override
		public void open() {
			// TODO Auto-generated method stub
			System.out.print("Enter the amount : ");
			Scanner cin = new Scanner(System.in);
			amount = cin.nextDouble();
			System.out.println("Choose from services\n1- GO Packages \n2- Extra GO \n3- Complementary Internet");
			service = cin.nextInt();
			System.out.print("Enter Your Phone Number : ");
			phone_number = cin.nextLine(); 
		}
	}

