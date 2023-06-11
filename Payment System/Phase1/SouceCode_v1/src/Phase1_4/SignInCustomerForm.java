package Phase1_4;

import java.util.Scanner;

public class SignInCustomerForm implements Form {

	@SuppressWarnings("resource")
	@Override
	public void open() {
		int i = 0;
		String Username;
		String Passward;
		System.out.print("Enter UserName : ");
		Username = new Scanner(System.in).nextLine();
		System.out.print("Enter Passward : ");
		Passward = new Scanner(System.in).nextLine();
		if (!FawryApplication.getConsumers().isEmpty()) {
			for (i = 0; i < FawryApplication.getConsumers().size(); i++) {
				if (Username.equals(FawryApplication.getConsumers().get(i).getUsername())
						&& Passward.equals(FawryApplication.getConsumers().get(i).getPassward())) {
					System.out.print("sign in successfully");
				}
				if (i == FawryApplication.getConsumers().size()) {
					System.out.println("the Username or Passward is Error");
					this.open();
				}
			}
		} else {
			System.out.println("the Username or Passward is Error");
			this.open();
		}
	}
}
