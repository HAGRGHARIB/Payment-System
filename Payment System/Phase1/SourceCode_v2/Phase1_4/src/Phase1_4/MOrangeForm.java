package Phase1_4;

import java.util.Scanner;

public class MOrangeForm  implements Form {

	double amount;
	int service;
	String phone_number;
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.print("Enter the amount : ");
		Scanner cin = new Scanner(System.in);
		amount = cin.nextDouble();
		System.out.println("Choose from services\n1- Free Max \n2- ALO 14 \n3- Orange Premier \n4- Ahsan Nas");
		service = cin.nextInt();
		System.out.print("Enter Your Phone Number : ");
		phone_number = cin.nextLine(); 
	}

}
