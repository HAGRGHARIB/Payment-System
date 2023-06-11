package Phase1_4;

import java.util.LinkedList;
import java.util.Scanner;

public class PaymentForm implements Form {

	@SuppressWarnings({ "resource", "unchecked" })
	@Override
	public void open() {
		float amountOfMoney;
		int paymentOption;
		Command command = new ServicesCommand();
		LinkedList<Services> list = (LinkedList<Services>) command.execute();
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).listproviderservices.size(); j++)
				System.out.println(list.get(i).listproviderservices.get(j).getName());
		}
		System.out.println("Enter the provider service you want : ");
		Scanner cin = new Scanner(System.in);
		String S = cin.nextLine();
		Command comand1 = new GetProviderFormCommand(S);
		comand1.execute();
		System.out.println("Enter the amount of money you want to pay: ");
		amountOfMoney = new Scanner(System.in).nextFloat();

		System.out.println("1 for credit");
		System.out.println("2 for wallet");
		System.out.println("3 for cache");
		System.out.println("Enter how u want to pay : ");
		paymentOption = new Scanner(System.in).nextInt();

	}

}
