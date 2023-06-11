package Phase1_SW;

import java.util.Scanner;

public class InitialForm implements Form {

	@SuppressWarnings("resource")
	@Override
	public void open() {
		System.out.println("enter 1 if you are User \nenter 2 if you are Admin \nenter 3 to exit");
		int type1, type2;
		Scanner cin = new Scanner(System.in);
		type1 = cin.nextInt();
		if (type1 == 1) {
			System.out.println("enter 1 to sign in \nenter 2 to sign up");
			type2 = cin.nextInt();
			if (type2 == 1) {
				Form form = new SignInCustomerForm();
				form.open();
			} else if (type2 == 2) {
				Form form = new SignUpCustomerForm();
				form.open();
			}
		} else if (type1 == 2) {
			Form form = new SignInAdminForm();
			form.open();
		} else
			this.open();

	}

}
