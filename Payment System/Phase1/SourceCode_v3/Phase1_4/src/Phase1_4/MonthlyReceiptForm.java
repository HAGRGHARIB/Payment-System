package Phase1_4;

import java.util.Scanner;

public class MonthlyReceiptForm implements Form {

	String ZipCode;
	int PhoneNumber;
	@Override
	public void open() {
		// TODO Auto-generated method stub
		Scanner cin =new Scanner(System.in);
		System.out.println("Please,Enter the ZipCode:  ");
		ZipCode=cin.nextLine();
		System.out.println("Please,Enter the PhoneNumber:  ");
		PhoneNumber=cin.nextInt();
}
}
