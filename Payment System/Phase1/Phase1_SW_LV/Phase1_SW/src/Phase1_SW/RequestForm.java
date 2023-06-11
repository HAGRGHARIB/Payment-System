package Phase1_SW;

import java.util.Scanner;

public class RequestForm implements Form {

	@SuppressWarnings("resource")
	@Override
	public void open() {
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter the Name of Service : ");
		String name = cin.nextLine();
		System.out.print("Enter the Amount  you want  to borrow: ");
		double amount = cin.nextDouble();
		RequestController controller = new RequestController();
		controller.execute(name, amount);
	}

}
