package Phase1_4;

import java.util.Scanner;

public class MenueAdminForm implements Form {

	@SuppressWarnings("resource")
	@Override
	public void open() {
		System.out.println("1 - Assign Discount For Specific Services");
		System.out.println("2 - Refund Requests");
		System.out.println("3 - SignOut");
		System.out.println("Enter the number From Menue: ");
		Scanner cin = new Scanner(System.in);
		int number = cin.nextInt();
		if (number == 1) {
		} else if (number == 2) {
		} else if (number == 3) {
			SignOutCommand command = new SignOutCommand();
			command.execute();
		} else {
			this.open();
		}

	}
}
