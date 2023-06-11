package Phase1_4;

import java.util.Scanner;

public class CancerHospitalForm  implements Form {
	 double amount;
	String HospitalName;
   String DonatorName;
	@Override
	public void open() {
		// TODO Auto-generated method stub
		Scanner cin =new Scanner(System.in);
		System.out.println("Please,Enter the Amount:  ");
		amount=cin.nextDouble();
		System.out.println("Please,Enter the HospitalName:  ");
		HospitalName =cin.nextLine();
		System.out.println("Please,Enter the DonatorName:  ");
		DonatorName =cin.nextLine();

	}
}
