package Phase1_SW;

import java.util.Scanner;

public class MenueCustomerForm implements Form {
	@SuppressWarnings("resource")
	@Override
	public void open() {
		System.out.println("1 - Search for service");
		System.out.println("2 - Pay");
		System.out.println("3 - Add Money TO your Wallet");
		System.out.println("4 - Show Money From your Wallet");
		System.out.println("5 - Request ");
		System.out.println("6 - Exit");
		System.out.println("Enter the number From Menue: ");
		Scanner cin = new Scanner(System.in);
		int number = cin.nextInt();
		WalletPayment form = new WalletPayment();
		if (number == 1) {
			Form f = new SearchForm();
			 f.open();
		} else if (number == 2) {
			Form f = new PaymentForm();
			f.open();
			this.open();
		} else if (number == 3) {
			System.out.println("Enter amount: ");
            double amount=cin.nextDouble();
			form.setAmount(amount);
			this.open();
			
		}else if (number == 4) {
			System.out.println("Enter amount: ");
            double amount=cin.nextDouble();
		    form.getAmount();
			this.open();
		}
		if (number == 5) {
			Form f = new RequestForm();
			 f.open();
		}
		else if (number == 6) {
			SignOutCommand command = new SignOutCommand();
			command.execute();
		} else {
			this.open();
		}

	}
}
