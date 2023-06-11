package Phase1_4;

import java.util.Scanner;

public class SignUpCustomerForm implements Form {

	@SuppressWarnings("resource")
	@Override
	public void open() {
		String Username;
		String Email;
		String Passward;
		String PhoneNumber;
		System.out.print("Enter UserName : ");
		Username = new Scanner(System.in).nextLine();
		System.out.print("Enter Email : ");
		Email = new Scanner(System.in).nextLine();
		System.out.print("Enter Passward : ");
		Passward = new Scanner(System.in).nextLine();
		System.out.print("Enter PhoneNumber : ");
		PhoneNumber = new Scanner(System.in).nextLine();
		Command command = new SignUpCommand(Username, Email, Passward, PhoneNumber);
		command.execute();
		Form form = new MenueCustomerForm();
		form.open();
	}

}
