package Phase1_4;

import java.util.LinkedList;
import java.util.Scanner;

public class PaymentForm implements Form {

	@SuppressWarnings("resource")
	@Override
	public void open() {
		ServicesController controller = new ServicesController();
		LinkedList<Services> list = controller.execute();
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).listproviderservices.size(); j++)
				System.out.println(list.get(i).listproviderservices.get(j).getName());
		}
		System.out.print("Enter the provider service you want : ");
		Scanner cin = new Scanner(System.in);
		String S = cin.nextLine();
		controller.getForm(S);
	}

}
