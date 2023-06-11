package Phase1_SW;

import java.util.Scanner;

public class MenueAdminForm implements Form {

	@SuppressWarnings("resource")
	@Override
	public void open() {
		System.out.println("1 - Assign Discount ");
		System.out.println("2 - Refund Requests");
		System.out.println("3 -Exit");
		System.out.println("Enter the number From Menue: ");
		Scanner cin = new Scanner(System.in);
		int number = cin.nextInt();
		if (number == 1) {
			String service_name=cin.nextLine();
		    double percentage= cin.nextDouble();
		    boolean isOverall=cin.nextBoolean();
		    Discount disc=new Discount(service_name,percentage,isOverall);
		    DiscountList list=new DiscountList();
		    list.AddDiscount(disc);
		} 
		else if (number == 2) {
		} 
		else if (number == 3) {
			SignOutCommand command = new SignOutCommand();
			command.execute();
		} else {
			this.open();
		}

	}
}
