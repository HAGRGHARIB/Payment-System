package Phase1_4;

import java.util.Scanner;

public class MenueCustomerForm implements Form {
	@SuppressWarnings("resource")
	@Override
	public void open() {
		System.out.println("1 - Request");
		System.out.println("2 - Pay");
		System.out.println("3 - SignOut");
		System.out.println("Enter the number From Menue: ");
		Scanner cin = new Scanner(System.in);
		int number = cin.nextInt();
		if (number == 1) {
		} else if (number == 2) {
			Form form = new PaymentForm();
			form.open();
		} else if (number == 3) {
			SignOutController controller = new SignOutController();
			controller.execute();
		} else {
			this.open();
		}

	}
}
