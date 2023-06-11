package Phase1_4;

import java.util.Scanner;

public class RequestForm implements Form {

	@SuppressWarnings("resource")
	@Override
	public void open() {
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter the Name of Service : ");
		String name = cin.nextLine();
		System.out.print("Enter the Amount : ");
		double amount = cin.nextDouble();
		RequestController controller = new RequestController();
		controller.execute(name, amount);
	}

}
