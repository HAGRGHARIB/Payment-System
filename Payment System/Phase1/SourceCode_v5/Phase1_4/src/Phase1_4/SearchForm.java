package Phase1_4;

import java.util.Scanner;

public class SearchForm implements Form {

	@SuppressWarnings("resource")
	@Override
	public void open() {

		String serviceProvider;

		System.out.print("Enter the name of service Provider you want : ");
		serviceProvider = new Scanner(System.in).nextLine();
		Command command = new SearchCommand(serviceProvider);
		command.execute();
		Form form = new MenueCustomerForm();
		form.open();
	}
}

//Form form = new MenueCustomerForm();
//System.out.print("Enter the name of service you want : ");
//service = new Scanner(System.in).nextLine();
//String service;