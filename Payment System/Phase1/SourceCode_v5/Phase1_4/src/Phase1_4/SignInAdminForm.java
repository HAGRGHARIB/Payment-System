package Phase1_4;

import java.util.Scanner;

public class SignInAdminForm implements Form {
	@SuppressWarnings("resource")
	@Override
	public void open() {
		String Username;
		String Passward;
		System.out.print("Enter UserName : ");
		Username = new Scanner(System.in).nextLine();
		System.out.print("Enter Passward : ");
		Passward = new Scanner(System.in).nextLine();
		if (Username.equals(FawryApplication.getAdmin().getUsername())
				&& Passward.equals(FawryApplication.getAdmin().getPassward())) {
			System.out.print("sign in successfully");
		} else {
			System.out.println("the Username or Passward is Error");
			this.open();
		}
	}
}
