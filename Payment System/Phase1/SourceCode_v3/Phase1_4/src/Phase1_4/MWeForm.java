package Phase1_4;

import java.util.Scanner;

public class MWeForm  implements Form {

	double amount;
	int service;
	String phone_number;
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.print("Enter the amount : ");
		Scanner cin = new Scanner(System.in);
		amount = cin.nextDouble();
		System.out.println("Choose from services\n1- Kiks \n2- Tazbeet \n3- Extra We \n4- Agdaa Cart \n5- Control Kiks");
		service = cin.nextInt();
		System.out.print("Enter Your Phone Number : ");
		phone_number = cin.nextLine(); 
	}
}
